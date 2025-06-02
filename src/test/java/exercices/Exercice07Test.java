package exercices;

import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test JUnit pour l'exercice 07 :
 * Vérifie la présence des fichiers pour chaque opérateur et la bonne utilisation des opérateurs dans le code.
 * Chaque fichier doit contenir au moins un opérateur correspondant à sa catégorie.
 */
public class Exercice07Test {

    @Test
    public void testPresenceFichiersOperateurs() {
        // Liste des fichiers attendus dans l'exercice07
        String[] noms = {
            "operateurCalcul.java",
            "operateurAffectation.java",
            "operateurLogique.java",
            "operateurIncrementation.java",
            "operateurComparaison.java"
        };
        /*
        // Variante pour tester les fichiers WithErrors (décommenter si nécessaire)
        String[] noms = {
            "operateurCalculWithErrors.java",
            "operateurAffectationWithErrors.java",
            "operateurLogiqueWithErrors.java",
            "operateurIncrementationWithErrors.java",
            "operateurComparaisonWithErrors.java"
        };
        */
        // Vérifie que chaque fichier est bien présent
        for (String nom : noms) {
            File f = new File("exercices/exercice07/" + nom);
            assertTrue(f.exists(), "❌ Le fichier " + nom + " n'a pas été trouvé dans le dossier 'exercice07'.");
        }
    }

    @Test
    public void testOperateurCalcul() {
        // Vérifie que le fichier operateurCalcul.java contient au moins un des opérateurs +, -, *, /
        verifierContenuFichier("exercices/exercice07/operateurCalcul.java", new String[]{"+", "-", "*", "/"});
        //verifierContenuFichier("exercices/exercice07/operateurCalculWithErrors.java", new String[]{"+", "-", "*", "/"});
    }

    @Test
    public void testOperateurAffectation() {
        // Vérifie que le fichier operateurAffectation.java contient les opérateurs d'affectation attendus
        verifierContenuFichier("exercices/exercice07/operateurAffectation.java", new String[]{"=", "+=", "-=", "*=", "/="});
        //verifierContenuFichier("exercices/exercice07/operateurAffectationWithErrors.java", new String[]{"=", "+=", "-=", "*=", "/="});
    }

    @Test
    public void testOperateurLogique() {
        // Vérifie que le fichier operateurLogique.java contient les opérateurs logiques attendus
        verifierContenuFichier("exercices/exercice07/operateurLogique.java", new String[]{"&&", "||", "!"});
        //verifierContenuFichier("exercices/exercice07/operateurLogiqueWithErrors.java", new String[]{"&&", "||", "!"});
    }

    @Test
    public void testOperateurIncrementation() {
        // Vérifie que le fichier operateurIncrementation.java contient ++ et --
        verifierContenuFichier("exercices/exercice07/operateurIncrementation.java", new String[]{"++", "--"});
        //verifierContenuFichier("exercices/exercice07/operateurIncrementationWithErrors.java", new String[]{"++", "--"});
    }

    @Test
    public void testOperateurComparaison() {
        // Vérifie que le fichier operateurComparaison.java contient les opérateurs de comparaison
        verifierContenuFichier("exercices/exercice07/operateurComparaison.java", new String[]{"==", "!=", ">", "<", ">=", "<="});
        //verifierContenuFichier("exercices/exercice07/operateurComparaisonWithErrors.java", new String[]{"==", "!=", ">", "<", ">=", "<="});
    }

    /**
     * Vérifie si un fichier Java contient bien tous les opérateurs attendus.
     * @param chemin chemin du fichier à vérifier
     * @param operateursAttendus liste des opérateurs à rechercher
     */
    private void verifierContenuFichier(String chemin, String[] operateursAttendus) {
        // Vérifie que le fichier existe bien
        File fichier = new File(chemin);
        assertTrue(fichier.exists(), "❌ Le fichier " + chemin + " n'existe pas.");

        // Tableau pour suivre quels opérateurs ont été trouvés
        boolean[] operateursTrouves = new boolean[operateursAttendus.length];

        // Parcours du fichier pour chercher les opérateurs
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                // Pour chaque opérateur attendu, on vérifie s'il est présent dans la ligne
                for (int i = 0; i < operateursAttendus.length; i++) {
                    if (ligne.contains(operateursAttendus[i])) {
                        operateursTrouves[i] = true;
                    }
                }
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier " + chemin);
        }

        // Vérifie que chaque opérateur attendu a bien été trouvé
        for (int i = 0; i < operateursAttendus.length; i++) {
            assertTrue(operateursTrouves[i], "⚠️ L'opérateur '" + operateursAttendus[i] + "' n'est pas utilisé dans le fichier " + chemin);
        }
    }
}
