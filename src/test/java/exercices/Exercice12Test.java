package exercices;

import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice12Test {

    @Test
    public void testFichierString() {
        File fichier = new File("exercices/exercice12/ExercicesString/src/App.java");
        //File fichier = new File("exercices/exercice12/ExercicesString/src/AppWithErrors.java");
        assertTrue(fichier.exists(), "❌ App.java n'a pas été trouvé dans le dossier ExercicesString.");
    }

    @Test
    public void testPresenceVariablesEtMethodesString() {
        File fichier = new File("exercices/exercice12/ExercicesString/src/App.java");
        //File fichier = new File("exercices/exercice12/ExercicesString/src/AppWithErrors.java");
        assertTrue(fichier.exists(), "❌ App.java n'a pas été trouvé dans le dossier ExercicesString.");

        boolean variableChainePresente = false;
        boolean variablePrenomPresente = false;
        boolean methodeLengthPresente = false;
        boolean methodeIndexOfPresente = false;
        boolean methodeCharAtPresente = false;
        boolean methodeContainsPresente = false;
        boolean contientAffichage = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("maChaineDeCaractere")) variableChainePresente = true;
                if (ligne.contains("monPrenom")) variablePrenomPresente = true;
                if (ligne.contains(".length()")) methodeLengthPresente = true;
                if (ligne.contains(".indexOf")) methodeIndexOfPresente = true;
                if (ligne.contains(".charAt")) methodeCharAtPresente = true;
                if (ligne.contains(".contains")) methodeContainsPresente = true;
                if (ligne.contains("System.out.println")) contientAffichage = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier App.java : " + e.getMessage());
        }

        assertTrue(variableChainePresente, "❌ La variable 'maChaineDeCaractere' est manquante.");
        assertTrue(variablePrenomPresente, "❌ La variable 'monPrenom' est manquante.");
        assertTrue(methodeLengthPresente, "❌ L'appel à la méthode .length() est manquant.");
        assertTrue(methodeIndexOfPresente, "❌ L'appel à la méthode .indexOf() est manquant.");
        assertTrue(methodeCharAtPresente, "❌ L'appel à la méthode .charAt() est manquant.");
        assertTrue(methodeContainsPresente, "❌ L'appel à la méthode .contains() est manquant.");
        assertTrue(contientAffichage, "⚠️ Des affichages (System.out.println) sont attendus dans le programme.");
    }
}
