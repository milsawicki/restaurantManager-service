package MainPackage.Services;

import MainPackage.Entities.*;
import MainPackage.Enums.OrderState;
import MainPackage.Repositories.*;
import MainPackage.TransferObjects.OrderDetailsTO;
import MainPackage.TransferObjects.OrderTO;
import MainPackage.TransferObjects.ProductTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class OrderService {

    @Autowired
    private PositionRepository positionRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private StandRepository tableRepository;

    @Autowired
    private WaiterRepository waiterRepository;

    public Collection<?> getAllOrders(Long waiterId) {
        Waiter waiter = waiterRepository.findById(waiterId);
        return convert(waiter.getPositions());
    }

    public OrderDetailsTO getOrderDetails(Long orderNumber) {
        Position position = positionRepository.findByOrderNumber(orderNumber);
        position.getProducts().forEach(product -> product.setPosition(null));
        return new OrderDetailsTO(position.getProducts(), position.getStand().getTableNumber(), position.getRemark(),position.getWaiter().getId(), position.isPaid());
    }

    public Collection<?> newOrder(OrderDetailsTO orderDetailsTO) {
        Waiter waiter = waiterRepository.findById(orderDetailsTO.getWaiterId());

        Double price = 0d;
        for (Product product : orderDetailsTO.getProducts()) {
            price += product.getPrice();
        }
        Long positionNumber = waiter.getPositions().size() == 0 ? 1L : waiter.getPositions().size() + 1L;
        Stand stand = tableRepository.findByTableNumber(orderDetailsTO.getTableNumber());


        boolean isPaid = orderDetailsTO.isPaid();
        Position position = new Position(null, positionNumber, price, stand, OrderState.INPROGRES, orderDetailsTO.getRemark(), isPaid,  waiter,  orderDetailsTO.getProducts());
        Collection<Position> waiterPositions = waiter.getPositions();
        waiterPositions.add(position);
        waiter.setPositions(waiterPositions);
        positionRepository.save(position);
        orderDetailsTO.getProducts().forEach(product -> {
            product.setPosition(position);
            productRepository.save(product);
        });
        waiterRepository.save(waiter);


        return convert(waiter.getPositions());
    }

    Collection<OrderTO> convert(Collection<Position> positionList) {
        Collection<OrderTO> result = new ArrayList<>();
        positionList.forEach(o -> {
            result.add(new OrderTO(o.getPrice(), o.getOrderNumber(), o.getStand().getTableNumber(), o.getOrderState(), o.getRemark(), o.isPaid()));
        });
        return result;
    }

    public Collection<?> getAllProducts() {
        Collection<Product> products = new ArrayList<>();
            Collection<ProductTO> result = new ArrayList<>();

        productRepository.findAll().forEach(products::add);
        products.forEach(p -> {
            result.add(new ProductTO(p.getProductId(), p.getPrice(), p.getName(), p.getProductType()));
        });
        return result;
    }
}
