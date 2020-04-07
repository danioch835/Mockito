package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleAppService {

    private SimpleService simpleService;

    @Autowired
    public void setSimpleService(SimpleService service) {
        this.simpleService = service;
    }

    public String getUserName() {
        return simpleService.getUserName();
    }

}
