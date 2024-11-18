package Mahmoud17.FirstApp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String sayHelloWorld(){
        return "Hello, World!";
    }
}
