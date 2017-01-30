package MainPackage.Services;

import MainPackage.Entities.Waiter;
import MainPackage.Repositories.WaiterRepository;
import MainPackage.TransferObjects.WaiterTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class WaiterService {
    @Autowired
    private WaiterRepository waiterRepository;

    public Collection<WaiterTO> getallWaiters(){
        Collection<Waiter> waiters = (Collection<Waiter>) waiterRepository.findAll();
        Collection<WaiterTO> result = new ArrayList<>();
        waiters.forEach(waiter -> {
            result.add(new WaiterTO(waiter.getId(),waiter.getName(),waiter.getSurname()));
        });
        return result;
    }

}
