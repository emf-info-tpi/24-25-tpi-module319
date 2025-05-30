package exercices.exercice08.exerciceboucles2;
public class App {
    public static void main(String[] args) throws Exception {

        // boucle for
        System.out.println("Boucle for:");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Décollage !!");
        System.out.println();

        // boucle while
        System.out.println("Boucle while:");
        int j = 5;
        while (j > 0) {
            System.out.println(j);
            j--;
        }

        System.out.println("Décollage !!");
        System.out.println();

        // boucle do while
        System.out.println("Boucle do-while:");
        j = 5;
        do {
            System.out.println(j);
            j--;
        } while (j > 0);

        System.out.println("Décollage !!");
        System.out.println();

    }
}
