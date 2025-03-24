package com.demo.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String requestMethodName(@RequestParam String param) {

        String name = "Lin Htet Aung";
        // I am Lin Htet Aung
        System.out.println("Hello Sithu, I am" + name);
        return new String();

    }

}
