package javaexercices.solid.singleresponsability.good;

import javaexercices.solid.singleresponsability.User;
import javaexercices.solid.singleresponsability.DataBase;

public class UserLogin {

    private final DataBase db;

    public UserLogin(DataBase dataBase){
        this.db = dataBase;
    }

    public void login(String userName, String password){
        User user = db.findUserByUserName(userName);
        if(null == user){
            // logic
        }
        // logic process
    }
}
