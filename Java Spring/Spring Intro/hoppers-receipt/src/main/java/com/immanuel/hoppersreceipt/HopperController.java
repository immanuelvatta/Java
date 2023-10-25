package com.immanuel.hoppersreceipt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HopperController {

    // class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Immanuel Vattakunnel";
        String itemName = "Sun Glasses";
        double price = 225.99;
        String description = "metal frame and two lenses that are darkened to filter out light";
        String vendor = "Immanuel's Store";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
    
        return "index.jsp";
    }
    //...
    

    
}
