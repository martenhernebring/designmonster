package utils;

public class Dice {
    private final int max;
    private final int min;

    public Dice(int max){
        this.max = max;
        min = 1;
    }

    public int roll(){
        double rollDouble = (Math.random()*((max-min)+1))+min;
        return (int) Math.floor(rollDouble);
    }
}
