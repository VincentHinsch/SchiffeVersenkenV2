package Schiffe;

public class Test {
    public static void main(String[] args) {


        SpielBrett mySpielBrett = new SpielBrett();
        for (int i = 0; i <10; i++) {
            mySpielBrett.addSchiff(new Schiff());
        }

        mySpielBrett.showSpielfeld();





    }
}
