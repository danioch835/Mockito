package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @Autowired
    private SimpleAppService appService;

    @RequestMapping("/")
    public String index() {
        return appService.getUserName();
    }

}
