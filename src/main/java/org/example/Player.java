package org.example;

public class Player {
    // Değişkenler sadece sınıf içinde erişilebilir
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // Constructor metodu ile değişkenler set ediliyor
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;

        // Health kontrolü
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    // healthRemaining metodu healthPercentage değerini döner
    public int healthRemaining() {
        return this.healthPercentage;
    }

    // loseHealth metodu, damage değeri kadar canı azaltır
    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (this.healthPercentage <= 0) {
            this.healthPercentage = 0;
            System.out.println(this.name + " player has been knocked out of game");
        }
    }

    // restoreHealth metodu, healthPotion miktarı kadar canı artırır
    public void restoreHealth(int healthPotion) {
        this.healthPercentage += healthPotion;
        if (this.healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }
}
