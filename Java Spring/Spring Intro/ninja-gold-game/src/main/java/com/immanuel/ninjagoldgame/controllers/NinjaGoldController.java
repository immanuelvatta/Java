package com.immanuel.ninjagoldgame.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaGoldController {

    @RequestMapping("/")
    public String index(HttpSession session) {
        if (session.getAttribute("total_gold") == null) {
            session.setAttribute("total_gold", 0);
            session.setAttribute("activities", new ArrayList<String>());
        }
        return "index.jsp";
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/processMoney", method = RequestMethod.POST)
    public String processMoney(
            @RequestParam(value = "area") String area,
            HttpSession session) {
        if ("farm".equals(area)) {
            Random rand = new Random();
            int max = 20;
            int min = 10;
            int gold = rand.nextInt(max + 1 - min) + min;
            SimpleDateFormat sdf = new SimpleDateFormat("MMMM d 'th' y h:mm a");
            String datetime = sdf.format(new Date());
            session.setAttribute("total_gold", (Integer) session.getAttribute("total_gold") + gold);
            ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
            activities.add(0, "You entered a farm and earned " + gold + " gold . (" + datetime + ")");
            session.setAttribute("activities", activities);
        } else if ("cave".equals(area)) {
            Random rand = new Random();
            int max = 10;
            int min = 5;
            int gold = rand.nextInt(max + 1 - min) + min;
            SimpleDateFormat sdf = new SimpleDateFormat("MMMM d 'th' y h:mm a");
            String datetime = sdf.format(new Date());
            session.setAttribute("total_gold", (Integer) session.getAttribute("total_gold") + gold);
            ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
            activities.add(0, "You entered a cave and earned " + gold + " gold. (" + datetime + ")");
            session.setAttribute("activities", activities);
        } else if ("house".equals(area)) {
            Random rand = new Random();
            int max = 5;
            int min = 2;
            int gold = rand.nextInt(max + 1 - min) + min;
            SimpleDateFormat sdf = new SimpleDateFormat("MMMM d 'th' y h:mm a");
            String datetime = sdf.format(new Date());
            session.setAttribute("total_gold", (Integer) session.getAttribute("total_gold") + gold);
            ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
            activities.add(0, "You entered a house and earned " + gold + " gold. (" + datetime + ")");
            session.setAttribute("activities", activities);
        } else if ("quest".equals(area)) {
            Random rand = new Random();
            int max = 50;
            int min = -50;
            int gold = rand.nextInt(max + 1 - min) + min;
            SimpleDateFormat sdf = new SimpleDateFormat("MMMM d 'th' y h:mm a");
            String datetime = sdf.format(new Date());
            session.setAttribute("total_gold", (Integer) session.getAttribute("total_gold") + gold);
            ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
            if (gold > 0) {
                activities.add(0, "You completed a quest and earned " + gold + " gold. (" + datetime + ")");
            }else {
                activities.add(0,"You failed a quest and lost " + gold + "gold Ouch. (" + datetime + ")");
            }
            session.setAttribute("activities", activities);

        }
        return "redirect:/";
    }

}
