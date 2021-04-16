package ru.itis.strategy;

public class Rifle implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Прицеливаюсь...");
    }
}
