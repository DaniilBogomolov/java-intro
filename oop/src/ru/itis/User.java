package ru.itis;

public class User {
    protected String email;
    protected String password;
    protected int balance;
    protected Cart cart;
    protected boolean isActive;
    private static boolean canOrder = true;

    User(String email, String password) {
        this.isActive = true;
        this.email = email;
        this.password = password;
    }

    User(String email, String password, int balance) {
        this(email, password);
        this.balance = balance;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public static boolean isCanOrder() {
        return canOrder;
    }

    public static void setCanOrder(boolean canOrder) {
        User.canOrder = canOrder;
    }

    void setEmail(String email) {
        if (email.endsWith("@mail.ru")) {
            this.email = email;
        } else {
            System.out.println("Такой домен не поддерживается");
        }
    }

    String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    void addBalance(int extraBalance) {
        balance += extraBalance;
    }

    void sendMessage(User user, String message) {
        System.out.println(user.getEmail() + " получай " + message);
    }
}
