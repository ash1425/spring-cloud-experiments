package DemoService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ashay on 31/5/15.
 */
@RestController
public class DemoController {

    @Value("${my.app.name}")
    private String name;

    @RequestMapping("/")
    public String showAppName() {
        return name;
    }
}
