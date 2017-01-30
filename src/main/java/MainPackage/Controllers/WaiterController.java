package MainPackage.Controllers;


import MainPackage.Services.WaiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/waiter")
public class WaiterController {

    @Autowired
    private WaiterService waiterService;

    @GetMapping
    public ResponseEntity<?> getAllWaiters(){
        return new ResponseEntity<>(waiterService.getallWaiters(), HttpStatus.OK);
    }
}
