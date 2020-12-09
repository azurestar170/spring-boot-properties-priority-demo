package name.az170.springbootpropertiesprioritydemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Value("${myconfig.value}")
    private String myConfig;

    @RequestMapping("/test")
    public String test() {
        return myConfig;
    }
}
