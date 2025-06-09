package exercices;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test pour l'exercice 04 :
 * Vérifie que le code de l'élève correspond bien à l'énoncé :
 * - Déclaration des variables variable1 et variable2 avec les bonnes valeurs
 * - Présence de la logique d'échange des valeurs
 * - Vérifie les affichages demandés
 */
public class Exercice04Test {

    @Test
    public void verifierContenuDuCode() {
        // Vérifie si le fichier EchangeValeurs.java est bien présent
        File fichier = new File("exercices/exercice04/EchangeValeurs.java");
        // (Décommenter la ligne suivante pour tester le fichier WithErrors)
        //File fichier = new File("exercices/exercice04/EchangeValeursWithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier EchangeValeurs.java n'a pas été trouvé dans le dossier exercice04.");

        // Prépare des drapeaux pour vérifier les éléments du code
        boolean variable1Valide = false;
        boolean variable2Valide = false;
        boolean logiqueEchangePresente = false;
        boolean contientAffichageDebut = false;
        boolean contientTraitement = false;
        boolean contientAffichageFin = false;

        // Lit le fichier ligne par ligne pour vérifier le contenu
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String l = ligne.trim();

                // Vérifie la déclaration de variable1 = 1
                if (l.contains("int variable1") && l.contains("= 1")) variable1Valide = true;

                // Vérifie la déclaration de variable2 = 2
                if (l.contains("int variable2") && l.contains("= 2")) variable2Valide = true;

                // Vérifie la présence de l'échange des valeurs
                if (l.contains("variable1 = variable2") || l.contains("variable2 = variable1")) logiqueEchangePresente = true;

                // Vérifie qu'il y a un affichage avec 'variable1' (au début)
                if (l.contains("System.out.println") && l.contains("variable1")) contientAffichageDebut = true;

                // Vérifie le message "Traitement"
                if (l.contains("Traitement")) contientTraitement = true;

                // Vérifie qu'il y a un affichage avec 'variable2' (après échange)
                if (l.contains("System.out.println") && l.contains("variable2")) contientAffichageFin = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier EchangeValeurs.java : " + e.getMessage());
        }

        // Vérifications finales avec des messages clairs
        assertTrue(variable1Valide, "⚠️ La variable 'variable1' doit être déclarée avec la valeur 1.");
        assertTrue(variable2Valide, "⚠️ La variable 'variable2' doit être déclarée avec la valeur 2.");
        assertTrue(logiqueEchangePresente, "⚠️ La logique d'échange semble absente ou incorrecte.");
        assertTrue(contientAffichageDebut, "⚠️ L'affichage initial de 'variable1' semble incorrect.");
        assertTrue(contientTraitement, "⚠️ Le message '... Traitement ...' est attendu.");
        assertTrue(contientAffichageFin, "⚠️ L'affichage final de 'variable1' après échange est attendu.");
    }
}
