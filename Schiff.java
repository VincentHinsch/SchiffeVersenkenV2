package Schiffe;

import java.util.Random;

public class Schiff {


    private int x;
    private int y;


    public Schiff() {
        Random random = new Random();

        x = random.nextInt(10);
        y = random.nextInt(10);

    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

}
