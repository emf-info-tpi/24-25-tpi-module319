package exercices.exercice08.exerciceboucles1;
public class App {
    public static void main(String[] args) {

        // boucle for
        for (int i = 1; i <= 5; i++) {
            System.out.println("Boucle for, itération " + i);
        }

        System.out.println();

        // boucle while
        int j = 1;
        while (j <= 5) {
            System.out.println("Boucle while, itération " + j);
            j++;
        }

        System.out.println();

        // boucle do while
        j = 1;
        do {
            System.out.println("Boucle do-while, itération " + j);
            j++;
        } while (j <= 5);

        System.out.println();

        // boucle for en sautant le 3
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Boucle for, itération " + i);
        }

        System.out.println();

        // boucle while en s'arrêtant après 3
        j = 1;
        while (j <= 5) {
            System.out.println("Boucle while, itération " + j);
            if (j == 3) {
                break;
            }
            j++;
        }

    }
}
