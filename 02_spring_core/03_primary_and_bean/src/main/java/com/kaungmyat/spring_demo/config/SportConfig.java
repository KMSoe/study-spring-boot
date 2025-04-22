package com.kaungmyat.spring_demo.config;

import com.kaungmyat.spring_demo.common.Coach;
import com.kaungmyat.spring_demo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
