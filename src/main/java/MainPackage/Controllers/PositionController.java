package MainPackage.Controllers;

import MainPackage.Services.OrderService;
import MainPackage.TransferObjects.OrderDetailsTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/order")
public class PositionController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/all")
    public ResponseEntity<?> getAllOrders(@RequestParam("id") Long waiterId){
        return new ResponseEntity<>(orderService.getAllOrders(waiterId), HttpStatus.OK);
    }

    @GetMapping(value = "/details")
    public ResponseEntity<?> getOrderDetails(@RequestParam("number") Long orderNumber){
        return new ResponseEntity<>(orderService.getOrderDetails(orderNumber), HttpStatus.OK);
    }

    @GetMapping(value = "/product/type")
    public ResponseEntity<?> getProductTypes(){
        return new ResponseEntity<>(orderService.getProductTypes(), HttpStatus.OK);
    }

    @GetMapping(value = "/products")
    public ResponseEntity<?> getProducts(@RequestParam("name")String name){
        return new ResponseEntity<>(orderService.getProducts(name), HttpStatus.OK);
    }

    @GetMapping(value = "/allproducts")
    public ResponseEntity<?> getAllProducts(){
        return new ResponseEntity<>(orderService.getAllProducts(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> newOrder(@RequestBody OrderDetailsTO orderDetailsTO){
        return new ResponseEntity<>(orderService.newOrder(orderDetailsTO), HttpStatus.OK);
    }

}
