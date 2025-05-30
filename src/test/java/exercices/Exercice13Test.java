package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice13Test {

    @Test
    public void testFichierPresentEtBienNomme() {
        File fichier = new File("exercices/exercice13/BruteForce.java");
        //File fichier = new File("exercices/exercice13/BruteForceWithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier 'BruteForce.java' est manquant dans le dossier 'exercice13'.");
    }

    @Test
    public void testStructureBruteForce() {
        File fichier = new File("exercices/exercice13/BruteForce.java");
        //File fichier = new File("exercices/exercice13/BruteForceWithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier 'BruteForce.java' est manquant.");

        boolean passwordPresent = false;
        boolean charactersPresent = false;
        boolean testPasswordPresent = false;
        boolean base64Used = false;
        boolean affichageMotDePasse = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("PASSWORD")) passwordPresent = true;
                if (ligne.contains("CHARACTERS")) charactersPresent = true;
                if (ligne.contains("testPassword")) testPasswordPresent = true;
                if (ligne.contains("Base64.getDecoder()")) base64Used = true;
                if (ligne.contains("System.out.println") && ligne.contains("le mot de passe est")) affichageMotDePasse = true;
            }
        } catch (Exception e) {
            fail("❌ Une erreur est survenue lors de la lecture du fichier BruteForce.java : " + e.getMessage());
        }

        assertTrue(passwordPresent, "❌ La constante PASSWORD est manquante.");
        assertTrue(charactersPresent, "❌ Le tableau CHARACTERS est manquant.");
        assertTrue(testPasswordPresent, "❌ La méthode testPassword est manquante ou non utilisée.");
        assertTrue(base64Used, "❌ La méthode Base64.getDecoder() n'est pas utilisée.");
        assertTrue(affichageMotDePasse, "❌ Le mot de passe trouvé n'est pas affiché correctement dans la console.");
    }

    @Test
    public void verifierPresenceBoucles() {
        File fichier = new File("exercices/exercice13/BruteForce.java");
        //File fichier = new File("exercices/exercice13/BruteForceWithErrors.java");
        boolean contientFor = false;
        boolean contientWhile = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("for")) contientFor = true;
                if (ligne.contains("while")) contientWhile = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier BruteForce.java : " + e.getMessage());
        }

        assertTrue(contientFor || contientWhile, "❌ L'algorithme de brute force doit contenir des boucles (for ou while).");
    }
}
