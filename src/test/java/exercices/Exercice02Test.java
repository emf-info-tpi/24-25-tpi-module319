package exercices;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice02Test {

    @Test
    public void verifierContenuFichier() {
        File fichier = new File("exercices/exercice02/Exercice02.java");

        assertTrue(fichier.exists(), "❌ Le fichier Exercice02.java est introuvable dans le dossier exercice02.");

        boolean ligneCorrecteTrouvee = false;

        try (BufferedReader lecteur = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = lecteur.readLine()) != null) {
                if (ligne.contains("Bonjour tout le monde")) {
                    ligneCorrecteTrouvee = true;
                    break;
                }
            }
        } catch (Exception e) {
            fail("❌ Une erreur est survenue lors de la lecture du fichier Exercice02.java.");
        }

        assertTrue(ligneCorrecteTrouvee,
            "⚠️ Le message affiché attendu n'a pas été détecté. Vérifiez le texte affiché dans la console.");
    }
}
