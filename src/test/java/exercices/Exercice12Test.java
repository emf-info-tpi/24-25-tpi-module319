package exercices;

// Import des bibliothèques nécessaires pour écrire les tests JUnit
import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test JUnit pour l'exercice 12 :
 * Vérifie la présence du fichier App.java et contrôle le contenu du code :
 * - Présence des variables attendues
 * - Appels des méthodes sur les chaînes de caractères
 * - Affichages attendus dans la console
 */
public class Exercice12Test {

    /**
     * Vérifie si le fichier App.java est bien présent dans le bon dossier
     */
    @Test
    public void testFichierString() {
        // Chemin du fichier à vérifier
        File fichier = new File("exercices/exercice12/ExercicesString/src/App.java");
        // (Décommenter la ligne ci-dessous pour tester le fichier AppWithErrors si besoin)
        // File fichier = new File("exercices/exercice12/ExercicesString/src/AppWithErrors.java");

        // Vérifie si le fichier existe, sinon affiche une erreur claire
        assertTrue(fichier.exists(), "❌ App.java n'a pas été trouvé dans le dossier ExercicesString.");
    }

    /**
     * Vérifie la présence des variables, des méthodes sur String et des affichages attendus
     */
    @Test
    public void testPresenceVariablesEtMethodesString() {
        // Fichier contenant le code à vérifier
        File fichier = new File("exercices/exercice12/ExercicesString/src/App.java");
        assertTrue(fichier.exists(), "❌ App.java n'a pas été trouvé dans le dossier ExercicesString.");

        // Drapeaux pour vérifier la présence des éléments attendus
        boolean variableChainePresente = false;
        boolean variablePrenomPresente = false;
        boolean methodeLengthPresente = false;
        boolean methodeIndexOfPresente = false;
        boolean methodeCharAtPresente = false;
        boolean methodeContainsPresente = false;
        boolean contientAffichage = false;

        // Lecture du fichier ligne par ligne
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                // Vérifie si la variable 'maChaineDeCaractere' est présente
                if (ligne.contains("maChaineDeCaractere")) variableChainePresente = true;

                // Vérifie si la variable 'monPrenom' est présente
                if (ligne.contains("monPrenom")) variablePrenomPresente = true;

                // Vérifie si la méthode .length() est utilisée sur une chaîne
                if (ligne.contains(".length()")) methodeLengthPresente = true;

                // Vérifie si la méthode .indexOf() est utilisée
                if (ligne.contains(".indexOf")) methodeIndexOfPresente = true;

                // Vérifie si la méthode .charAt() est utilisée
                if (ligne.contains(".charAt")) methodeCharAtPresente = true;

                // Vérifie si la méthode .contains() est utilisée
                if (ligne.contains(".contains")) methodeContainsPresente = true;

                // Vérifie si des affichages sont présents (avec System.out.println)
                if (ligne.contains("System.out.println")) contientAffichage = true;
            }
        } catch (Exception e) {
            // Si une erreur survient lors de la lecture du fichier, on arrête le test avec un message d'erreur
            fail("❌ Erreur lors de la lecture du fichier App.java : " + e.getMessage());
        }

        // Vérifications finales : chaque élément est contrôlé et un message clair est affiché si manquant
        assertTrue(variableChainePresente, "❌ La variable 'maChaineDeCaractere' est manquante.");
        assertTrue(variablePrenomPresente, "❌ La variable 'monPrenom' est manquante.");
        assertTrue(methodeLengthPresente, "❌ L'appel à la méthode .length() est manquant.");
        assertTrue(methodeIndexOfPresente, "❌ L'appel à la méthode .indexOf() est manquant.");
        assertTrue(methodeCharAtPresente, "❌ L'appel à la méthode .charAt() est manquant.");
        assertTrue(methodeContainsPresente, "❌ L'appel à la méthode .contains() est manquant.");
        assertTrue(contientAffichage, "⚠️ Des affichages (System.out.println) sont attendus dans le programme.");
    }
}
