package ru.itis.adapter;

import ru.itis.strategy.AttackStrategy;

public class TankAdapter implements AttackStrategy {
    private Tank tank;

    public TankAdapter(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void attack() {
        tank.shoot();
    }
}
