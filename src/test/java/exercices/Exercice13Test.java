package exercices;

// Import des bibliothèques nécessaires pour le test
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests JUnit pour l'exercice 13 - BruteForce.
 * Vérifie la structure attendue du fichier BruteForce.java :
 * - La présence des constantes, des méthodes et des affichages.
 * - La présence des boucles nécessaires (for ou while).
 */
public class Exercice13Test {

    @Test
    public void testFichierPresentEtBienNomme() {
        // Vérifie si le fichier BruteForce.java est bien présent dans le bon dossier
        File fichier = new File("exercices/exercice13/BruteForce.java");
        //File fichier = new File("exercices/exercice13/BruteForceWithErrors.java"); // Ligne commentée pour test en cas d'erreurs
        assertTrue(fichier.exists(), "❌ Le fichier 'BruteForce.java' est manquant dans le dossier 'exercice13'.");
    }

    @Test
    public void testStructureBruteForce() {
        // Vérifie la présence et la structure du fichier BruteForce.java
        File fichier = new File("exercices/exercice13/BruteForce.java");
        //File fichier = new File("exercices/exercice13/BruteForceWithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier 'BruteForce.java' est manquant.");

        // Préparation de drapeaux pour vérifier chaque élément attendu
        boolean passwordPresent = false;         // Vérifie si la constante PASSWORD est déclarée
        boolean charactersPresent = false;       // Vérifie si le tableau CHARACTERS est présent
        boolean testPasswordPresent = false;     // Vérifie si la méthode testPassword est présente
        boolean base64Used = false;              // Vérifie si l'algorithme utilise Base64.getDecoder()
        boolean affichageMotDePasse = false;     // Vérifie si le résultat (mot de passe trouvé) est bien affiché dans la console

        // Lecture du fichier ligne par ligne
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                // Vérifie la déclaration de la constante PASSWORD
                if (ligne.contains("PASSWORD")) passwordPresent = true;
                // Vérifie la présence du tableau CHARACTERS
                if (ligne.contains("CHARACTERS")) charactersPresent = true;
                // Vérifie l'utilisation de la méthode testPassword
                if (ligne.contains("testPassword")) testPasswordPresent = true;
                // Vérifie l'utilisation de Base64 pour le décodage
                if (ligne.contains("Base64.getDecoder()")) base64Used = true;
                // Vérifie l'affichage final du mot de passe trouvé dans la console
                if (ligne.contains("System.out.println") && ligne.contains("le mot de passe est")) affichageMotDePasse = true;
            }
        } catch (Exception e) {
            fail("❌ Une erreur est survenue lors de la lecture du fichier BruteForce.java : " + e.getMessage());
        }

        // Vérifications finales avec des messages explicites
        assertTrue(passwordPresent, "❌ La constante PASSWORD est manquante.");
        assertTrue(charactersPresent, "❌ Le tableau CHARACTERS est manquant.");
        assertTrue(testPasswordPresent, "❌ La méthode testPassword est manquante ou non utilisée.");
        assertTrue(base64Used, "❌ La méthode Base64.getDecoder() n'est pas utilisée.");
        assertTrue(affichageMotDePasse, "❌ Le mot de passe trouvé n'est pas affiché correctement dans la console.");
    }

    @Test
    public void verifierPresenceBoucles() {
        // Vérifie que l'algorithme contient bien des boucles (for ou while) pour parcourir toutes les combinaisons
        File fichier = new File("exercices/exercice13/BruteForce.java");
        //File fichier = new File("exercices/exercice13/BruteForceWithErrors.java");

        boolean contientFor = false;    // Vérifie la présence d'une boucle for
        boolean contientWhile = false;  // Vérifie la présence d'une boucle while

        // Lecture du fichier ligne par ligne
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("for")) contientFor = true;
                if (ligne.contains("while")) contientWhile = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier BruteForce.java : " + e.getMessage());
        }

        // Vérifie qu'au moins une boucle est utilisée dans le code (for ou while)
        assertTrue(contientFor || contientWhile, "❌ L'algorithme de brute force doit contenir des boucles (for ou while).");
    }
}
