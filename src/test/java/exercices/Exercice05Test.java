package exercices;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests JUnit pour l'exercice 05.
 * Vérifie que les fichiers des exercices ExerciceCondition1 à ExerciceCondition4
 * contiennent bien les éléments attendus :
 * - Les déclarations de variables correctes
 * - Les conditions if/else
 * - Les affichages demandés
 */
public class Exercice05Test {

    @Test
    public void verifierExerciceCondition1() {
        // Vérifie la présence du fichier ExerciceCondition1.java dans le bon dossier
        //File fichier = new File("exercices/exercice05/ExerciceCondition1.java");
        // (Décommenter la ligne suivante pour tester le fichier WithErrors)
         File fichier = new File("exercices/exercice05/ExerciceCondition1WithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier ExerciceCondition1.java n'a pas été trouvé dans le dossier exercice05.");

        // Préparation des drapeaux pour vérifier chaque élément du code
        boolean contientVariable = false;
        boolean contientAffichagePositif = false;
        boolean contientAffichageNegatif = false;
        boolean contientIf = false;
        boolean contientElse = false;

        // Lecture du fichier ligne par ligne pour vérifier les éléments attendus
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                // Vérifie la déclaration de la variable int valeurATester
                if (ligne.contains("int valeurATester")) contientVariable = true;

                // Vérifie la présence du message pour une valeur positive
                if (ligne.contains("La valeur est positive")) contientAffichagePositif = true;

                // Vérifie la présence du message pour une valeur négative
                if (ligne.contains("La valeur est négative")) contientAffichageNegatif = true;

                // Vérifie si une condition if est utilisée
                if (ligne.contains("if")) contientIf = true;

                // Vérifie si une structure else est présente
                if (ligne.contains("else")) contientElse = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceCondition1.java.");
        }

        // Vérifie que tous les éléments attendus sont bien présents
        assertTrue(contientVariable, "⚠️ La variable int valeurATester doit être déclarée.");
        assertTrue(contientIf, "⚠️ Une condition if est attendue pour tester la valeur.");
        assertTrue(contientElse, "⚠️ Une structure else est attendue pour gérer l'autre cas.");
        assertTrue(contientAffichagePositif, "⚠️ Le message 'La valeur est positive' est attendu.");
        assertTrue(contientAffichageNegatif, "⚠️ Le message 'La valeur est négative' est attendu.");
    }

    @Test
    public void verifierExerciceCondition2() {
        // Vérifie le fichier ExerciceCondition2.java
        File fichier = new File("exercices/exercice05/ExerciceCondition2.java");
     // File fichier = new File("exercices/exercice05/ExerciceCondition2WithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier ExerciceCondition2.java n'a pas été trouvé dans le dossier exercice05.");

        // Préparation des drapeaux pour vérifier le code
        boolean contientVariable = false;
        boolean contientAffichagePaire = false;
        boolean contientAffichageImpaire = false;
        boolean contientIf = false;
        boolean contientElse = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                // Vérifie la déclaration de la variable int valeurATester
                if (ligne.contains("int valeurATester")) contientVariable = true;

                // Vérifie le message pour une valeur paire
                if (ligne.contains("La valeur est paire")) contientAffichagePaire = true;

                // Vérifie le message pour une valeur impaire
                if (ligne.contains("La valeur est impaire")) contientAffichageImpaire = true;

                // Vérifie la présence d'une condition if
                if (ligne.contains("if")) contientIf = true;

                // Vérifie la présence d'une structure else
                if (ligne.contains("else")) contientElse = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceCondition2.java.");
        }

        // Vérifications finales
        assertTrue(contientVariable, "⚠️ La variable int valeurATester doit être déclarée.");
        assertTrue(contientIf, "⚠️ Une condition if est attendue pour tester la parité.");
        assertTrue(contientElse, "⚠️ Une structure else est attendue pour gérer l'autre cas.");
        assertTrue(contientAffichagePaire, "⚠️ Le message 'La valeur est paire' est attendu.");
        assertTrue(contientAffichageImpaire, "⚠️ Le message 'La valeur est impaire' est attendu.");
    }

    @Test
    public void verifierExerciceCondition3() {
        // Vérifie le fichier ExerciceCondition3.java
        File fichier = new File("exercices/exercice05/ExerciceCondition3.java");
        //File fichier = new File("exercices/exercice05/ExerciceCondition3WithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier ExerciceCondition3.java n'a pas été trouvé dans le dossier exercice05.");

        // Drapeaux pour vérifier les éléments attendus
        boolean contientVariables = false;
        boolean contientAffichagePositif = false;
        boolean contientAffichageNegatif = false;
        boolean contientIf = false;
        boolean contientElse = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                // Vérifie la présence des variables int valeur1 et valeur2
                if (ligne.contains("int valeur1") || ligne.contains("int valeur2")) contientVariables = true;

                // Vérifie le message attendu si le résultat est positif
                if (ligne.contains("Le résultat est positif")) contientAffichagePositif = true;

                // Vérifie le message attendu si le résultat est négatif
                if (ligne.contains("Le résultat est négatif")) contientAffichageNegatif = true;

                // Vérifie la présence d'un if
                if (ligne.contains("if")) contientIf = true;

                // Vérifie la présence d'un else
                if (ligne.contains("else")) contientElse = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceCondition3.java.");
        }

        // Vérifie que tout est en place
        assertTrue(contientVariables, "⚠️ Les variables int valeur1 et int valeur2 doivent être déclarées.");
        assertTrue(contientIf, "⚠️ Une condition if est attendue pour déterminer le signe.");
        assertTrue(contientElse, "⚠️ Une structure else est attendue pour gérer l'autre cas.");
        assertTrue(contientAffichagePositif, "⚠️ Le message 'Le résultat est positif' est attendu.");
        assertTrue(contientAffichageNegatif, "⚠️ Le message 'Le résultat est négatif' est attendu.");
    }

    @Test
    public void verifierExerciceCondition4() {
        // Vérifie le fichier ExerciceCondition4.java
        File fichier = new File("exercices/exercice05/ExerciceCondition4.java");
        //File fichier = new File("exercices/exercice05/ExerciceCondition4WithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier ExerciceCondition4.java n'a pas été trouvé dans le dossier exercice05.");

        // Drapeaux pour vérifier les éléments attendus
        boolean contientVariable = false;
        boolean contientAffichage1 = false;
        boolean contientAffichage2 = false;
        boolean contientAffichage3 = false;
        boolean contientAffichage4 = false;
        boolean contientIf = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                // Vérifie la déclaration de la variable int temperature
                if (ligne.contains("int temperature")) contientVariable = true;

                // Vérifie les messages attendus selon la température
                if (ligne.contains("Il fait très froid")) contientAffichage1 = true;
                if (ligne.contains("Il fait normal") || ligne.contains("Il fait froid")) contientAffichage2 = true;
                if (ligne.contains("Il fait chaud")) contientAffichage3 = true;
                if (ligne.contains("Il fait très chaud")) contientAffichage4 = true;

                // Vérifie la présence de la condition if
                if (ligne.contains("if")) contientIf = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceCondition4.java.");
        }

        // Vérifications finales
        assertTrue(contientVariable, "⚠️ La variable int temperature doit être déclarée.");
        assertTrue(contientIf, "⚠️ Une structure if est attendue.");
        assertTrue(contientAffichage1, "⚠️ Le message 'Il fait très froid' est attendu.");
        assertTrue(contientAffichage2, "⚠️ Le message 'Il fait froid' ou 'Il fait normal' est attendu.");
        assertTrue(contientAffichage3, "⚠️ Le message 'Il fait chaud' est attendu.");
        assertTrue(contientAffichage4, "⚠️ Le message 'Il fait très chaud' est attendu.");
    }
}
