package weapon;

import utils.Dice;

public class Shotgun implements Weapon {
    Dice d100 = new Dice(100);

    public int attack(){
        return d100.roll();
    }
}
