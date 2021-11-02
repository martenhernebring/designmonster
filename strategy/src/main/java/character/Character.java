package character;

import weapon.Weapon;

import java.util.Optional;

public abstract class Character {
    private int strength;
    private int health;
    private String name;

    public Character(int strength, int health, String name) {
        this.strength = strength;
        this.health = health;
        this.name = name;
    }

    public abstract int fight();

    public abstract void changeWeapon(Optional<Weapon> weapon);

    public boolean damage(int fight, Character character) {
        String name = character.getName();
        System.out.println("Damage done " + fight + " to " + name);
        health -= fight;
        if(health < 1){
            System.out.println(name + " died.");
            return true;
        } else {
            System.out.printf("%s has %d health left.%n", name, character.getHealth());
            return false;
        }
    }

    private int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    protected int getStrength() {
        return strength;
    }

    public void addHealth(int health) {
        this.health += health;
    }
}
