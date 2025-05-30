package exercices.exercice10.exercicesmethodestableaux;

public class AppWithErrors {
    // Erreurs typiques : méthodes manquantes, erreurs dans les signatures
    
    public static void main(String[] args) {
        System.out.println("Test AppWithErrors");
    }

    // Mauvaise signature : manque le paramètre tableau
    public static int[] remplirTableauAleatoire() {
        return new int[0];
    }

    // Manque les autres méthodes (creeTableauEntiers, tailleTableau, etc.)
    // Manque la déclaration des constantes MIN, MAX et TAILLE
}
