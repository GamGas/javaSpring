package ru.javarush.info.fatfaggy.animals.entities;

import org.springframework.stereotype.Component;
//@Component
public class Dog {
    private String name = "standart dog name";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
