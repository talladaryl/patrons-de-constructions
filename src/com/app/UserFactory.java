package com.app;

public class UserFactory {
public static User createUser(String nom, String email, String password) {
return new User.Builder()
.setNom(nom)
.setEmail(email)
.setPassword(password)
.build();
}
}
