package ru.javarush.info.fatfaggy.animals.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.javarush.info.fatfaggy.animals.days.*;
import ru.javarush.info.fatfaggy.animals.entities.Cat;
import ru.javarush.info.fatfaggy.animals.entities.Dog;
import ru.javarush.info.fatfaggy.animals.entities.Parrot;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
@ComponentScan("ru.javarush.info.fatfaggy.animals.entities")
public class MyConfig {

    @Bean
    public WeekDay getDay() {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY:
                return new Monday();
            case TUESDAY:
                return new Tuesday();
            case WEDNESDAY:
                return new Wednesday();
            case THURSDAY:
                return new Thursday();
            case FRIDAY:
                return new Friday();
            case SATURDAY:
                return new Saturday();
            default:
                return new Sunday();
        }
    }
    @Bean("dog")
    public Dog getDog(){
        return new Dog();
    }
}
