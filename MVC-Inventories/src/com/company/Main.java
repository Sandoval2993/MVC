package com.company;

import com.company.controller.UserController;
import com.company.model.User;
import com.company.view.UserView;

public class Main {

    public static void main(String[] args) {
        User model = retriveUserFromDataBase();
        UserView view = new UserView();
        UserController controller = new UserController(model, view);
        controller.updateView();
        controller.setUserName("Jose");
        controller.updateView();
    }

    private static User retriveUserFromDataBase(){
        User user = new User();
        user.setName("Miguel");
        user.setPassword("123456");
        return user;
    }
}
