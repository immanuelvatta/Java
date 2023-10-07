package com.immanuel.daikichiroutes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    
    @GetMapping("/demo")
    public String demo(){
        return "demo.jsp";
    }
}
