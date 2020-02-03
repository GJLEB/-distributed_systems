package HW.rest;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

//    @RequestMapping("/greeting")
//    public Hello greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
//        return new Hello(counter.incrementAndGet(),
//                String.format(template, name));
//    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public Hello addTopic (@RequestBody Map<String, Long> json){
        return new Hello(counter.incrementAndGet(), json.get("number")+1);
    }
}
