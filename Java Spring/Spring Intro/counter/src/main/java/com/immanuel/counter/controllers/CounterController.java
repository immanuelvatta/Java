package com.immanuel.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
    
    @RequestMapping("/")
    public String index(HttpSession session){
        Integer count = 0;
        if(session.getAttribute("count") == null){
            session.setAttribute("count", count);
        }else{
            count = (Integer) session.getAttribute("count");
            count++;
            session.setAttribute("count", count);
        }
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String counter(){
        return "counter.jsp";
    }

    @RequestMapping("/reset")
    public String reset(HttpSession session){
        if(session.getAttribute("count")!= null){
            session.setAttribute("count", 0);
        }
        return "index.jsp";
    }

    @RequestMapping("/double")
    public String doubleCounter(HttpSession session){
        Integer count = 0;
        if(session.getAttribute("count") != null){
            count = (Integer) session.getAttribute("count");
            count += 1;
            session.setAttribute("count", count);
        }
        return "double.jsp";
    }
}
