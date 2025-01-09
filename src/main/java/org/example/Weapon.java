package org.example;

public enum Weapon {
    SWORD(50, 1.5),
    AXE(60, 1.2),
    BOW(30, 2.0);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    // Damage getter
    public int getDamage() {
        return damage;
    }

    // Attack speed getter
    public double getAttackSpeed() {
        return attackSpeed;
    }
}
