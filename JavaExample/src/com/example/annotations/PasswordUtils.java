package com.example.annotations;

import java.util.List;

public class PasswordUtils {
    @UserCase(id=17,description="Passwords must contain at least on numeric")
    public boolean validatePassword(String password){
    	return (password.matches("\\w*\\d\\w*"));
    }
    @UserCase(id=18)
    public String encryptPassword(String password){
    	return new StringBuilder(password).reverse().toString();
    }
    @UserCase(id=19,description="New password can't equal previously used ones")
    public boolean checkForNewPasswod(List<String> prevPasswords,String password){
    	return !prevPasswords.contains(password);
    }
}
