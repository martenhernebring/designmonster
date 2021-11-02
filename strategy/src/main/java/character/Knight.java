package character;

import utils.Strength;
import weapon.Weapon;

import java.util.Optional;

public class Knight extends Character {

    private Optional<Weapon> weapon;
    private final int UNARMED_PROFICIENCY;

    public Knight(int strength, Optional<Weapon> weapon, int health, String name) {
        super(strength, health, name);
        this.weapon = weapon;
        this.UNARMED_PROFICIENCY = 0;
    }

    @Override
    public int fight() {
        if(weapon.isPresent()){
            return weapon.get().attack();
        } else{
            return UNARMED_PROFICIENCY + Strength.strengthModifier(super.getStrength());
        }
    }

    @Override
    public void changeWeapon(Optional<Weapon> weapon) {
        this.weapon = weapon;
    }
}
