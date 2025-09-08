package no.hvl.dat250.lecture07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CalculationInterface calculateImplementation() {
        return new SubtractCalculator();
    }

}
