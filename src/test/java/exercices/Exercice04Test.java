package exercices;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import static org.junit.jupiter.api.Assertions.*;

public class Exercice04Test {

    @Test
    public void verifierContenuDuCode() {
        File fichier = new File("exercices/exercice04/EchangeValeurs.java");
        //File fichier = new File("exercices/exercice04/EchangeValeursWithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier EchangeValeurs.java n'a pas été trouvé dans le dossier exercice04.");

        boolean variable1Valide = false;
        boolean variable2Valide = false;
        boolean logiqueEchangePresente = false;
        boolean contientAffichageDebut = false;
        boolean contientTraitement = false;
        boolean contientAffichageFin = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String l = ligne.trim();

                if (l.contains("int variable1") && l.contains("= 1")) variable1Valide = true;
                if (l.contains("int variable2") && l.contains("= 2")) variable2Valide = true;
                if (l.contains("variable1 = variable2") || l.contains("variable2 = variable1")) logiqueEchangePresente = true;
                if (l.contains("System.out.println") && l.contains("variable1")) contientAffichageDebut = true;
                if (l.contains("Traitement")) contientTraitement = true;
                if (l.contains("System.out.println") && l.contains("variable2")) contientAffichageFin = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier EchangeValeurs.java : " + e.getMessage());
        }

        assertTrue(variable1Valide, "⚠️ La variable 'variable1' doit être déclarée avec la valeur 1.");
        assertTrue(variable2Valide, "⚠️ La variable 'variable2' doit être déclarée avec la valeur 2.");
        assertTrue(logiqueEchangePresente, "⚠️ La logique d'échange semble absente ou incorrecte.");
        assertTrue(contientAffichageDebut, "⚠️ L'affichage initial de 'variable1' semble incorrect.");
        assertTrue(contientTraitement, "⚠️ Le message '... Traitement ...' est attendu.");
        assertTrue(contientAffichageFin, "⚠️ L'affichage final de 'variable1' après échange est attendu.");

    }
}
