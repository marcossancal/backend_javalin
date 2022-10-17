package com.sancal.controllers;
import io.javalin.Javalin;
import java.util.ArrayList;
public class UsersController {
    
    public ArrayList getAllUsers(){
        ArrayList<String> users = new ArrayList<String>();
        users.add("Marcos");
        users.add("Ariel");
        users.add("Ana");
        users.add("Roseli");
        users.add("Alécio");
        return users;
    }
}
