package com.bank.app.userfront.domain;

import java.util.List;

/**
 * Created by Bhaskar on 3/2/2017.
 */
public class User {
    private Long userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private boolean enabled = true;

    private CheckingAccount checkingAccount;
    private SavingsAccount savingsAccount;
    private List<Appointment> appointmentList;
    private List<Recipient> recipientList;

}
