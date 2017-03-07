package com.bank.app.userfront.service;

import com.bank.app.userfront.domain.User;

/**
 * Created by Bhaskar on 3/3/2017.
 */
public interface UserService {
    void saveUser(User user);
    User findByUsername(String username);
    User findByEmail(String email);
    boolean checkUserExists(String username, String email);
    boolean checkUsernameExists(String username);
    boolean checkEmailExists(String email);
}
