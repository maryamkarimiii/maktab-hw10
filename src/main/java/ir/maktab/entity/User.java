package ir.maktab.entity;

import lombok.*;

@Data
public abstract class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String phoneNumber;
}
