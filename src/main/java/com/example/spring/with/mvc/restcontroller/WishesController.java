package com.example.spring.with.mvc.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WishesController {

    @GetMapping("/greetwishes")
    @ResponseBody   //@RestController = @Controller+@ResponseBody
    public String wishes(){
        return "Hi Amma nanna Good morning";
    }

}
