package no.hvl.dat250.lecture07.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHandler {

    @GetMapping("/hi")
    public String sayHi() {
        return "Hello World";
    }
}
