package ru.itis.strategy;

import ru.itis.adapter.Tank;
import ru.itis.adapter.TankAdapter;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.setWeapon(new Feast());
        warrior.attack();
        warrior.attack();
        warrior.setWeapon(new Sword());
        warrior.attack();
        warrior.setWeapon(new Rifle());
        warrior.attack();
        warrior.setWeapon(new TankAdapter(new Tank()));
        warrior.attack();
    }
}
