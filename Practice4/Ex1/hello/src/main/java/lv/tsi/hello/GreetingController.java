package lv.tsi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(defaultValue = "Spring") String name ){
        Greeting greet = new Greeting(name);
        return greet.toString();
    }


}
