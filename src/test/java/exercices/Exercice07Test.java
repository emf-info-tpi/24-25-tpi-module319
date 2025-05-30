package exercices;

import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice07Test {

    @Test
    public void testPresenceFichiersOperateurs() {
        String[] noms = {
            "operateurCalcul.java",
            "operateurAffectation.java",
            "operateurLogique.java",
            "operateurIncrementation.java",
            "operateurComparaison.java"
        };
       /*String[] noms = {
            "operateurCalculWithErrors.java",
            "operateurAffectationWithErrors.java",
            "operateurLogiqueWithErrors.java",
            "operateurIncrementationWithErrors.java",
            "operateurComparaisonWithErrors.java"
        };*/
        for (String nom : noms) {
            File f = new File("exercices/exercice07/" + nom);
            assertTrue(f.exists(), "❌ Le fichier " + nom + " n'a pas été trouvé dans le dossier 'exercice07'.");
        }
    }

    @Test
    public void testOperateurCalcul() {
        verifierContenuFichier("exercices/exercice07/operateurCalcul.java", new String[]{"+", "-", "*", "/"});
        //verifierContenuFichier("exercices/exercice07/operateurCalculWithErrors.java", new String[]{"+", "-", "*", "/"});
    }

    @Test
    public void testOperateurAffectation() {
        verifierContenuFichier("exercices/exercice07/operateurAffectation.java", new String[]{"=", "+=", "-=", "*=", "/="});
        //verifierContenuFichier("exercices/exercice07/operateurAffectationWithErrors.java", new String[]{"=", "+=", "-=", "*=", "/="});
    }

    @Test
    public void testOperateurLogique() {
        verifierContenuFichier("exercices/exercice07/operateurLogique.java", new String[]{"&&", "||", "!"});
        //verifierContenuFichier("exercices/exercice07/operateurLogiqueWithErrors.java", new String[]{"&&", "||", "!"});
    }

    @Test
    public void testOperateurIncrementation() {
        verifierContenuFichier("exercices/exercice07/operateurIncrementation.java", new String[]{"++", "--"});
        //verifierContenuFichier("exercices/exercice07/operateurIncrementationWithErrors.java", new String[]{"++", "--"});
    }

    @Test
    public void testOperateurComparaison() {
        verifierContenuFichier("exercices/exercice07/operateurComparaison.java", new String[]{"==", "!=", ">", "<", ">=", "<="});
        //verifierContenuFichier("exercices/exercice07/operateurComparaisonWithErrors.java", new String[]{"==", "!=", ">", "<", ">=", "<="});
    }

    private void verifierContenuFichier(String chemin, String[] operateursAttendus) {
        File fichier = new File(chemin);
        assertTrue(fichier.exists(), "❌ Le fichier " + chemin + " n'existe pas.");

        boolean contientAffichage = false;
        boolean[] operateursTrouves = new boolean[operateursAttendus.length];

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {

                    // Vérifie si l'opérateur est utilisé dans le projet
                    for (int i = 0; i < operateursAttendus.length; i++) {
                        if (ligne.contains(operateursAttendus[i])) {
                            operateursTrouves[i] = true;
                        }
                    }
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier " + chemin);
        }

        for (int i = 0; i < operateursAttendus.length; i++) {
            assertTrue(operateursTrouves[i], "⚠️ L'opérateur '" + operateursAttendus[i] + "' n'est pas utilisé dans le projet dans " + chemin);
        }
    }
}
