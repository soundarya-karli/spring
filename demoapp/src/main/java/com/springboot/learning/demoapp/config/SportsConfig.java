package com.springboot.learning.demoapp.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.springboot.learning.demoapp.common.Coach;
import com.springboot.learning.demoapp.common.SwimCoach;
//to inject a class without using @Component annotation- e.g SwimCoach
@Configuration
public class SportsConfig {
    
    @Bean //to configure the bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
