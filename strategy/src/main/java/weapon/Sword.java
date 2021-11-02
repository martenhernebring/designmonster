package weapon;

import utils.Dice;

public class Sword implements Weapon {
    Dice d10 = new Dice(10);

    public int attack(){
        return d10.roll();
    }
}
