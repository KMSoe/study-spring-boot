package com.kaungmyat.spring_demo.controller;

import com.kaungmyat.spring_demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;
    private Coach anotherCoaach;

//    @Autowired
//    public DemoController(@Qualifier("cricketCoach") Coach coach, @Qualifier("cricketCoach") Coach anotherCoaach) {
//        System.out.println("In constructor: " + getClass().getSimpleName());
//        this.coach = coach;
//        this.anotherCoaach = anotherCoaach;
//    }

    @Autowired
    public DemoController(@Qualifier("aquatic") Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

//    @GetMapping("/check")
//    public String check() {
//        return "Comparing beans: myCoach == anotherCoach, " + (this.coach == this.anotherCoaach);
//    }
}
