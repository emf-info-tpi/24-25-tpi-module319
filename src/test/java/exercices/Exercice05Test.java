package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice05Test {

    @Test
    public void verifierExerciceCondition1() {
        File fichier = new File("exercices/exercice05/ExerciceCondition1.java");
        //File fichier = new File("exercices/exercice05/ExerciceCondition1WithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier ExerciceCondition1.java n'a pas été trouvé dans le dossier exercice05.");

        boolean contientVariable = false;
        boolean contientAffichagePositif = false;
        boolean contientAffichageNegatif = false;
        boolean contientIf = false;
        boolean contientElse = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("int valeurATester")) contientVariable = true;
                if (ligne.contains("La valeur est positive")) contientAffichagePositif = true;
                if (ligne.contains("La valeur est négative")) contientAffichageNegatif = true;
                if (ligne.contains("if")) contientIf = true;
                if (ligne.contains("else")) contientElse = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceCondition1.java.");
        }

        assertTrue(contientVariable, "⚠️ La variable int valeurATester doit être déclarée.");
        assertTrue(contientIf, "⚠️ Une condition if est attendue pour tester la valeur.");
        assertTrue(contientElse, "⚠️ Une structure else est attendue pour gérer l'autre cas.");
        assertTrue(contientAffichagePositif, "⚠️ Le message 'La valeur est positive' est attendu.");
        assertTrue(contientAffichageNegatif, "⚠️ Le message 'La valeur est négative' est attendu.");
    }

    @Test
    public void verifierExerciceCondition2() {
        File fichier = new File("exercices/exercice05/ExerciceCondition2.java");
        //File fichier = new File("exercices/exercice05/ExerciceCondition2WithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier ExerciceCondition2.java n'a pas été trouvé dans le dossier exercice05.");

        boolean contientVariable = false;
        boolean contientAffichagePaire = false;
        boolean contientAffichageImpaire = false;
        boolean contientIf = false;
        boolean contientElse = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("int valeurATester")) contientVariable = true;
                if (ligne.contains("La valeur est paire")) contientAffichagePaire = true;
                if (ligne.contains("La valeur est impaire")) contientAffichageImpaire = true;
                if (ligne.contains("if")) contientIf = true;
                if (ligne.contains("else")) contientElse = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceCondition2.java.");
        }

        assertTrue(contientVariable, "⚠️ La variable int valeurATester doit être déclarée.");
        assertTrue(contientIf, "⚠️ Une condition if est attendue pour tester la parité.");
        assertTrue(contientElse, "⚠️ Une structure else est attendue pour gérer l'autre cas.");
        assertTrue(contientAffichagePaire, "⚠️ Le message 'La valeur est paire' est attendu.");
        assertTrue(contientAffichageImpaire, "⚠️ Le message 'La valeur est impaire' est attendu.");
    }

    @Test
    public void verifierExerciceCondition3() {
        File fichier = new File("exercices/exercice05/ExerciceCondition3.java");
        //File fichier = new File("exercices/exercice05/ExerciceCondition3WithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier ExerciceCondition3.java n'a pas été trouvé dans le dossier exercice05.");

        boolean contientVariables = false;
        boolean contientAffichagePositif = false;
        boolean contientAffichageNegatif = false;
        boolean contientIf = false;
        boolean contientElse = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("int valeur1") || ligne.contains("int valeur2")) contientVariables = true;
                if (ligne.contains("Le résultat est positif")) contientAffichagePositif = true;
                if (ligne.contains("Le résultat est négatif")) contientAffichageNegatif = true;
                if (ligne.contains("if")) contientIf = true;
                if (ligne.contains("else")) contientElse = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceCondition3.java.");
        }

        assertTrue(contientVariables, "⚠️ Les variables int valeur1 et int valeur2 doivent être déclarées.");
        assertTrue(contientIf, "⚠️ Une condition if est attendue pour déterminer le signe.");
        assertTrue(contientElse, "⚠️ Une structure else est attendue pour gérer l'autre cas.");
        assertTrue(contientAffichagePositif, "⚠️ Le message 'Le résultat est positif' est attendu.");
        assertTrue(contientAffichageNegatif, "⚠️ Le message 'Le résultat est négatif' est attendu.");
    }

    @Test
    public void verifierExerciceCondition4() {
        File fichier = new File("exercices/exercice05/ExerciceCondition4.java");
        //File fichier = new File("exercices/exercice05/ExerciceCondition4WithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier ExerciceCondition4.java n'a pas été trouvé dans le dossier exercice05.");

        boolean contientVariable = false;
        boolean contientAffichage1 = false;
        boolean contientAffichage2 = false;
        boolean contientAffichage3 = false;
        boolean contientAffichage4 = false;
        boolean contientIf = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("int temperature")) contientVariable = true;
                if (ligne.contains("Il fait très froid")) contientAffichage1 = true;
                if (ligne.contains("Il fait normal") || ligne.contains("Il fait froid")) contientAffichage2 = true;
                if (ligne.contains("Il fait chaud")) contientAffichage3 = true;
                if (ligne.contains("Il fait très chaud")) contientAffichage4 = true;
                if (ligne.contains("if")) contientIf = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier ExerciceCondition4.java.");
        }

        assertTrue(contientVariable, "⚠️ La variable int temperature doit être déclarée.");
        assertTrue(contientIf, "⚠️ Une structure if est attendue.");
        assertTrue(contientAffichage1, "⚠️ Le message 'Il fait très froid' est attendu.");
        assertTrue(contientAffichage2, "⚠️ Le message 'Il fait froid' ou 'Il fait normal' est attendu.");
        assertTrue(contientAffichage3, "⚠️ Le message 'Il fait chaud' est attendu.");
        assertTrue(contientAffichage4, "⚠️ Le message 'Il fait très chaud' est attendu.");
    }
}
