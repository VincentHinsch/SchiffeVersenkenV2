package Schiffe;

import java.lang.reflect.Array;

public class SpielBrett {


    Schiff[][] spielfelder = new Schiff[10][10];

    public void showSpielfeld() {
        for (int x = 0; x < spielfelder.length; x++) {
            for (int y = 0; y < spielfelder.length; y++) {
                if (spielfelder [x][y] != null){
                    System.out.print("X");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }

    public void addSchiff(Schiff schiff) {
        spielfelder[schiff.getX()][schiff.getY()] = schiff;
    }
}
