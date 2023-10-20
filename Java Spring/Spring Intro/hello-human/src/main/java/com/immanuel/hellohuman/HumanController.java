package com.immanuel.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HumanController {

    @RequestMapping("/")
    public String index(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "last_name", required = false) String lastName,
            @RequestParam(value = "times", required = false, defaultValue = "1") int times) {

        String res = "";
        if (name == null && lastName == null) {
            res += "Hello Human";
        } else if (name != null && lastName != null) {
            res += "Hello " + name + " " + lastName;
        } else if (name != null || times <= 0) {
            for (int i = 0; i < times; i++) {
                res += "Hello " + name + " ";
            }
        } else if (lastName != null) {
            res += "Hello " + lastName;
        }
        return res;

    }

}
