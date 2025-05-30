package exercices.exercice05;

public class ExerciceCondition3WithErrors {
    public static void main(String[] args) {
        // Pas de déclaration de valeur1 et valeur2
        int v1 = 7;
        int v2 = -9;

         if (v1 > 0 && v2 > 0) {
            System.out.println("Le résultat est positif");
        } else if (v1 < 0 && v2 < 0) {
            System.out.println("Le résultat est positif");
        } else {
            System.out.println("Le résultat est négatif");
        }
    }
}
