package io.github.gamgas.hiberLearn;

import io.github.gamgas.hiberLearn.models.Auto;
import io.github.gamgas.hiberLearn.models.User;
import io.github.gamgas.hiberLearn.services.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("Masha", 26);
        userService.saveUser(user);

        Auto ferarri = new Auto("Ferarri", "red");
        ferarri.setUser(user);
        user.addAuto(ferarri);

        Auto ford = new Auto("Ford","black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);
        //It works!
    }
}
