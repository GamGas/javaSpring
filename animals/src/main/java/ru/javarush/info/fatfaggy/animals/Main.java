package ru.javarush.info.fatfaggy.animals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javarush.info.fatfaggy.animals.configs.MyConfig;
import ru.javarush.info.fatfaggy.animals.days.WeekDay;
import ru.javarush.info.fatfaggy.animals.entities.*;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());


        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's "+weekDay.getWeekDayName()+" today!");
    }
}
