package weapon;

import utils.Dice;

public class Club implements Weapon {
    Dice d8 = new Dice(8);

    public int attack(){
        return d8.roll();
    }
}
