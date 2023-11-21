package javaexercices.solid.singleresponsability.bad;

import javaexercices.solid.singleresponsability.DataBase;
import javaexercices.solid.singleresponsability.User;

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

    public void sendEmail(User user, String msg){
        // logic to send email to user
    }
}
