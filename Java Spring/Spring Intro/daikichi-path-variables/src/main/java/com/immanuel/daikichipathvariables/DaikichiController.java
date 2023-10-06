package com.immanuel.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

    @RequestMapping("/travel/{location}")
    public String travelLocation(@PathVariable("location") String location){
        return String.format("Congratulations! You will soon travel to %s! \n", location);
    }

    @RequestMapping("/lotto/{lottoNum}")
    public String lotto(@PathVariable("lottoNum") int lottoNum) {
        return (lottoNum % 2 == 0) ? "You will take a grand journey in the near future, but be weary of tempting offers"
                : "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    }

}
