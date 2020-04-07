package app;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    public String getUserName() {
        return "User";
    }

}
