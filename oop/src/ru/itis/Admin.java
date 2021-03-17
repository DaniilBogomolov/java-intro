package ru.itis;

public class Admin extends User {

    public void banUser(User user) {
        user.setActive(false);
    }

    public Admin(String email, String password) {
        super(email, password);
        this.email = email;
        this.password = password;
    }

}