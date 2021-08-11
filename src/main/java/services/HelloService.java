package services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(String name) {
        System.out.println("Hello " + name + "!");
        return "Hello " + name + "!";
        //throw new RuntimeException("error!");
    }
}
