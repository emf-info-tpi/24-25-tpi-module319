package exercices.exercice11.exercicesinversiontableau;;
public class App {
    public static final int MIN = 0;
    public static final int MAX = 100;

    public static int[] inverseLeTableau(int[] tableau) {
        int taille = tableau.length;
        int[] tableauInverse = new int[taille];
        for (int i = 0; i < taille; i++) {
            tableauInverse[i] = tableau[taille - 1 - i];
        }
        return tableauInverse;
    }

    public static void main(String[] args) throws Exception {
        int[] tableauInitial = new int[4];

        System.out.println("Contenu du tableau initial:");
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = (int) (Math.random() * (MAX - MIN + 1) + MIN);
            System.out.println("Tableau initial[" + i + "] = " + tableauInitial[i]);
        }

        System.out.println();
        System.out.println("Contenu du tableau final:");
        int[] tableauFinal = inverseLeTableau(tableauInitial);
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.println("Tableau final[" + i + "] = " + tableauFinal[i]);
        }

    }
}
