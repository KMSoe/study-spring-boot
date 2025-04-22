package com.kaungmyat.spring_demo.controller;

import com.kaungmyat.spring_demo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetterInjectionController {
    private Coach coach;

    @Autowired
    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/setter/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
