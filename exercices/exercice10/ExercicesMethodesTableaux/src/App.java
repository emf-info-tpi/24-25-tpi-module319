package exercices.exercice10.exercicesmethodestableaux;
public class App {
    public static final int MIN = 0;
    public static final int MAX = 25;
    public static final int TAILLE = 50;

    public static void main(String[] args) throws Exception {
        int[] tableau = creeTableauEntiers(TAILLE);

        System.out.println("Le tableau a une taille de " + tailleTableau(tableau) + " cellules.");
        System.out.println();

        tableau = remplirTableauAleatoire(tableau);
        System.out.println("Contenu du tableau aléatoire :");
        afficheTableau(tableau);

        System.out.println("La valeur min trouvée = " + rechercheMinTableau(tableau));
        System.out.println("La valeur max trouvée = " + rechercheMaxTableau(tableau));
        System.out.println();

        tableau = remplacerValeur(tableau, 12, 5);
        System.out.println("Après remplacement de la valeur 12 par la valeur 5 voici le contenu du tableau:");
        afficheTableau(tableau);

        System.out.println();
        System.out.println("La somme des cellules du tableau = " + sommeTableau(tableau));
        System.out.println("La moyenne des cellules du tableau = " + moyenneTableau(tableau));
        System.out
                .println("La valeur 13 a été trouvée à la première position N°" + trouvePremiereOccurence(tableau, 13));
        System.out
                .println("La valeur 13 a été trouvée à la dernière position N°" + trouveDerniereOccurence(tableau, 13));

    }

    public static int[] creeTableauEntiers(int taille) {
        return new int[taille];
    }

    public static int[] remplirTableauValeur(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = valeur;
        }

        return tableau;
    }

    public static int[] remplirTableauAleatoire(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (int) (Math.random() * (MAX - MIN + 1) + MIN);
        }

        return tableau;
    }

    public static int tailleTableau(int[] tableau) {
        return tableau.length;
    }

    public static void afficheTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("tab[" + i + "]=" + tableau[i]);
        }
    }

    public static int rechercheMinTableau(int[] tableau) {
        int min = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
            }
        }

        return min;
    }

    public static int rechercheMaxTableau(int[] tableau) {
        int max = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < max) {
                max = tableau[i];
            }
        }

        return max;
    }

    public static int compteOccurences(int[] tableau, int valeurRecherchee) {
        int compteur = 0;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                compteur++;
            }
        }

        return compteur;
    }

    public static int sommeTableau(int[] tableau) {
        int somme = 0;

        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }

        return somme;
    }

    public static double moyenneTableau(int[] tableau) {

        return (double) sommeTableau(tableau) / tailleTableau(tableau);
    }

    public static int[] remplacerValeur(int[] tableau, int valeurRecherchee, int nouvelleValeur) {

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                tableau[i] = nouvelleValeur;
            }
        }

        return tableau;
    }

    public static int trouvePremiereOccurence(int[] tableau, int valeurRecherchee) {
        int index = -1;

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeurRecherchee) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static int trouveDerniereOccurence(int[] tableau, int valeurRecherchee) {
        int index = -1;

        for (int i = tableau.length - 1; i >= 0; i--) {
            if (tableau[i] == valeurRecherchee) {
                index = i;
                break;
            }
        }

        return index;
    }
}
