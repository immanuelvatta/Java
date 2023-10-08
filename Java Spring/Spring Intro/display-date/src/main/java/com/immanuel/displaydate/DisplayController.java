package com.immanuel.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;





@Controller
public class DisplayController {
    
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
    
    @RequestMapping("/time")
    public String time(Model model){
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm:a");

        Date date = new Date();
        model.addAttribute("time", timeFormat.format(date));
        return "time.jsp";
    }


    @RequestMapping("/date")
    public String date(Model model){
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMM d, yyyy");
        Date date = new Date();

        model.addAttribute("date", dateFormat.format(date));
        
        return "date.jsp";
    }
}
