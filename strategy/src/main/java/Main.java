import character.Character;
import character.Knight;
import character.Troll;
import utils.Dice;
import weapon.Club;
import weapon.Shotgun;
import weapon.Sword;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Character knight = new Knight(16, Optional.of(new Sword()), 150, "Sir James");
        Character troll = new Troll(18, Optional.of(new Club()), 100, "Balder");
        Character winner = fightUntilDeath(knight, troll);
        System.out.printf("A shotgun was found under a stone by %s%n", winner.getName());
        winner.changeWeapon(Optional.of(new Shotgun()));
        System.out.printf("%s sleeps and regains 10 health.%n", winner.getName());
        winner.addHealth(10);
        Knight blackKnight = new Knight(14, Optional.empty(), 80, "Fistfighting Black Knight");
        System.out.printf("The evil, but unarmed Black Knight shows up and attacks %s%n", winner.getName());
        winner = fightUntilDeath(blackKnight, winner);
        System.out.printf("The winner was %s%n", winner.getName());
    }

    private static Character fightUntilDeath(Character attacker, Character defender) {
        Dice d10 = new Dice(10);
        while(true){
            if(defender.damage(attacker.fight(), defender)){
                return attacker;
            } else if (d10.roll() == 1){
                defender.changeWeapon(Optional.empty());
            }
            if(attacker.damage(defender.fight(), attacker)){
                return defender;
            } else if (d10.roll() == 1){
                attacker.changeWeapon(Optional.empty());
            }
        }
    }
}