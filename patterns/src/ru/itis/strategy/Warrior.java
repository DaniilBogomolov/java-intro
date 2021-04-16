package ru.itis.strategy;

public class Warrior {

    private AttackStrategy weapon;

    public void setWeapon(AttackStrategy weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.attack();
    }
}
