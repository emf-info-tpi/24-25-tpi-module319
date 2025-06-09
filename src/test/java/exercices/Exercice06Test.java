package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests JUnit pour l'exercice 06.
 * Vérifie que les fichiers ExerciceSwitch1.java et ExerciceSwitch2.java
 * contiennent bien :
 * - Les déclarations des variables attendues
 * - Les structures if/else et switch
 * - Les affichages demandés (par cas)
 */
public class Exercice06Test {

    @Test
    public void verifierExerciceSwitch1() {
        // Vérifie la présence du fichier ExerciceSwitch1.java dans le dossier exercice06
        //File fichier = new File("exercices/exercice06/ExerciceSwitch1.java");
        // (Décommenter la ligne suivante pour tester le fichier WithErrors)
         File fichier = new File("exercices/exercice06/ExerciceSwitch1WithErrors.java");
        assertTrue(fichier.exists(), "❌ ExerciceSwitch1.java n'a pas été trouvé dans le dossier 'exercice06'.");

        // Prépare des drapeaux pour vérifier chaque élément attendu dans le code
        boolean variableTrouvee = false;
        boolean contientAffichage1 = false;
        boolean contientAffichage2 = false;
        boolean contientAffichage3 = false;
        boolean contientAffichage4 = false;
        boolean contientAffichage5 = false;
        boolean contientAffichage6 = false;

        boolean contientSwitch = false;
        boolean contientIf = false;

        // Lecture ligne par ligne du code pour détecter les éléments
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                // Vérifie la déclaration de la variable int noteDuModule
                if (ligne.contains("int noteDuModule")) variableTrouvee = true;

                // Vérifie les différents affichages attendus
                if (ligne.contains("Travail non rendu")) contientAffichage1 = true;
                if (ligne.contains("Très insuffisant")) contientAffichage2 = true;
                if (ligne.contains("Insuffisant")) contientAffichage3 = true;
                if (ligne.contains("Suffisant")) contientAffichage4 = true;
                if (ligne.contains("Bien")) contientAffichage5 = true;
                if (ligne.contains("Très bien")) contientAffichage6 = true;

                // Vérifie la présence d'un switch
                if (ligne.contains("switch")) contientSwitch = true;

                // Vérifie la présence d'un if/else
                if (ligne.contains("if") || ligne.contains("else")) contientIf = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceSwitch1.java.");
        }

        // Vérifications finales avec des messages clairs
        assertTrue(variableTrouvee, "⚠️ La variable int noteDuModule doit être déclarée.");
        assertTrue(contientAffichage1, "⚠️ Le message 'Travail non rendu' est attendu.");
        assertTrue(contientAffichage2, "⚠️ Le message 'Très insuffisant' est attendu.");
        assertTrue(contientAffichage3, "⚠️ Le message 'Insuffisant' est attendu.");
        assertTrue(contientAffichage4, "⚠️ Le message 'Suffisant' est attendu.");
        assertTrue(contientAffichage5, "⚠️ Le message 'Bien' est attendu.");
        assertTrue(contientAffichage6, "⚠️ Le message 'Très bien' est attendu.");
        assertTrue(contientIf, "⚠️ Le programme doit utiliser un test if/else.");
        assertTrue(contientSwitch, "⚠️ Le programme doit utiliser un switch.");
    }

    @Test
    public void verifierExerciceSwitch2() {
        // Vérifie la présence du fichier ExerciceSwitch2.java dans le dossier exercice06
        File fichier = new File("exercices/exercice06/ExerciceSwitch2.java");
        // File fichier = new File("exercices/exercice06/ExerciceSwitch2WithErrors.java");
        assertTrue(fichier.exists(), "❌ ExerciceSwitch2.java n'a pas été trouvé dans le dossier 'exercice06'.");

        // Prépare des drapeaux pour vérifier les éléments attendus
        boolean variableTrouvee = false;
        boolean contientAffichagePoussin = false;
        boolean contientAffichagePupille = false;
        boolean contientAffichageMinime = false;
        boolean contientAffichageInconnu = false;

        boolean contientSwitch = false;
        boolean contientIf = false;

        // Lecture du fichier ligne par ligne
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                // Vérifie la déclaration de la variable int age
                if (ligne.contains("int age")) variableTrouvee = true;

                // Vérifie les affichages attendus pour chaque catégorie
                if (ligne.contains("Poussin")) contientAffichagePoussin = true;
                if (ligne.contains("Pupille")) contientAffichagePupille = true;
                if (ligne.contains("Minime")) contientAffichageMinime = true;
                if (ligne.contains("Inconnu")) contientAffichageInconnu = true;

                // Vérifie la présence d'un switch
                if (ligne.contains("switch")) contientSwitch = true;

                // Vérifie la présence d'un if/else
                if (ligne.contains("if") || ligne.contains("else")) contientIf = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceSwitch2.java.");
        }

        // Vérifications des éléments attendus
        assertTrue(variableTrouvee, "⚠️ La variable int age doit être déclarée.");
        assertTrue(contientAffichagePoussin, "⚠️ Le message 'Poussin' est attendu.");
        assertTrue(contientAffichagePupille, "⚠️ Le message 'Pupille' est attendu.");
        assertTrue(contientAffichageMinime, "⚠️ Le message 'Minime' est attendu.");
        assertTrue(contientAffichageInconnu, "⚠️ Le message 'Inconnu' est attendu.");
        assertTrue(contientIf, "⚠️ Le programme doit utiliser un test if/else.");
        assertTrue(contientSwitch, "⚠️ Le programme doit utiliser un switch.");
    }
}
