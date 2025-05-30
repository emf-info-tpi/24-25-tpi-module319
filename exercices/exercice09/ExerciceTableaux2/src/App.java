package exercices.exercice09.exercicetableaux2;
public class App {

    public static final int MIN = 1;
    public static final int MAX = 6;

    public static void main(String[] args) throws Exception {

        int[] tableau = new int[10];

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (MAX - MIN + 1) + MIN);
        }

        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Cellule " + i + ": " + tableau[i]);
        }
    }
}
