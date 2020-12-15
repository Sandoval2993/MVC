package com.company.controller;

import com.company.model.User;
import com.company.view.UserView;

public class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view){
        this.model = model;
        this.view = view;
    }

    public void setUserName(String name){
        model.setName(name);
    }

    public String getUserName() {
        return model.getName();
    }

    public void setUserPassword(String password){
        model.setPassword(password);
    }

    public String getPassword(){
        return model.getPassword();
    }

    public void updateView(){
        view.printUserDetails(model.getName(), model.getPassword());
    }
}
