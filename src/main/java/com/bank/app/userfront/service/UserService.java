package com.bank.app.userfront.service;

/**
 * Created by Bhaskar on 3/3/2017.
 */
public interface UserService {
    public boolean checkUserExists(String username, String email);
    public boolean checkUsernameExists(String username);
    public boolean checkEmailExists(String email);
}
