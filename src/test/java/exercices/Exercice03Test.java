package exercices;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice03Test {

    @Test
    public void verifierContenuFichier() {
        File fichier = new File("exercices/exercice03/TypesDeBase.java");
        assertTrue(fichier.exists(), "❌ Le fichier TypesDeBase.java n'a pas été trouvé dans exercice03.");

        boolean contientVariableAge = false;
        boolean contientVariableNom = false;
        boolean contientTexte1 = false;
        boolean contientTexte2 = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("int age")) contientVariableAge = true;
                if (ligne.contains("String nom")) contientVariableNom = true;
                if (ligne.contains("Je m'appelle") || ligne.contains("Je m'appelle")) contientTexte1 = true;
                if (ligne.contains("Dans 10 ans")) contientTexte2 = true;
            }
        } catch (Exception e) {
            fail("❌ Une erreur est survenue lors de la lecture du fichier TypesDeBase.java.");
        }

        assertTrue(contientVariableAge, "⚠️ La variable entière représentant l'âge semble manquante.");
        assertTrue(contientVariableNom, "⚠️ La variable contenant un nom semble manquante.");
        assertTrue(contientTexte1, "⚠️ Le message de présentation est manquant ou incorrect.");
        assertTrue(contientTexte2, "⚠️ Le message concernant l'âge dans 10 ans est manquant ou incorrect.");
    }
}
