package exercices;

import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test JUnit pour l'Exercice 09 : vérifie la présence et la bonne implémentation des fichiers liés aux tableaux.
 * 
 * - Vérifie la présence des fichiers App.java pour chaque exercice.
 * - Vérifie le contenu du code source : tableaux, constantes, méthodes, structures et logique attendue.
 * - Vérifie la présence de la méthode random(), des boucles, des variables, et des affichages attendus.
 */
public class Exercice09Test {

    @Test
    public void testPresenceFichiers() {
        // Vérifie que les fichiers App.java existent dans chaque dossier ExerciceTableaux
        assertTrue(new File("exercices/exercice09/ExerciceTableaux1/src/App.java").exists(),
            "❌ App.java n'a pas été trouvé dans le dossier ExerciceTableaux1");
        assertTrue(new File("exercices/exercice09/ExerciceTableaux2/src/App.java").exists(),
            "❌ App.java n'a pas été trouvé dans le dossier ExerciceTableaux2");
        assertTrue(new File("exercices/exercice09/ExerciceTableaux3/src/App.java").exists(),
            "❌ App.java n'a pas été trouvé dans le dossier ExerciceTableaux3");
        assertTrue(new File("exercices/exercice09/ExerciceTableaux4/src/App.java").exists(),
            "❌ App.java n'a pas été trouvé dans le dossier ExerciceTableaux4");
        // (Décommenter les lignes suivantes pour tester les fichiers WithErrors)
        //assertTrue(new File("exercices/exercice09/ExerciceTableaux1/src/AppWithErrors.java").exists(),
        //    "❌ App.java n'a pas été trouvé dans le dossier ExerciceTableaux1");
        //assertTrue(new File("exercices/exercice09/ExerciceTableaux2/src/AppWithErrors.java").exists(),
        //    "❌ App.java n'a pas été trouvé dans le dossier ExerciceTableaux2");
        //assertTrue(new File("exercices/exercice09/ExerciceTableaux3/src/AppWithErrors.java").exists(),
        //    "❌ App.java n'a pas été trouvé dans le dossier ExerciceTableaux3");
        //assertTrue(new File("exercices/exercice09/ExerciceTableaux4/src/AppWithErrors.java").exists(),
        //    "❌ App.java n'a pas été trouvé dans le dossier ExerciceTableaux4");
    }

    @Test
    public void verifierExerciceTableaux1() {
        // Vérifie que le fichier App.java est présent pour ExerciceTableaux1
        File fichier = new File("exercices/exercice09/ExerciceTableaux1/src/App.java");
        assertTrue(fichier.exists(), "❌ Le fichier App.java est manquant dans ExerciceTableaux1.");

        // Drapeaux pour vérifier la présence des tableaux et des affichages
        boolean contientTableauInt = false;
        boolean contientTableauString = false;
        boolean contientAffichage = false;

        // Parcourt le fichier ligne par ligne
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("int[]")) contientTableauInt = true; // Vérifie la déclaration d'un tableau int[]
                if (ligne.contains("String[]")) contientTableauString = true; // Vérifie la déclaration d'un tableau String[]
                if (ligne.contains("System.out.println")) contientAffichage = true; // Vérifie la présence d'un affichage
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier App.java.");
        }

        // Vérifications finales avec messages d'erreur clairs
        assertTrue(contientTableauInt, "⚠️ Le tableau int[] doit être déclaré.");
        assertTrue(contientTableauString, "⚠️ Le tableau String[] doit être déclaré.");
        assertTrue(contientAffichage, "⚠️ Les valeurs des tableaux doivent être affichées.");
    }

    @Test
    public void verifierExerciceTableaux2() {
        // Vérifie la présence des constantes MIN et MAX dans la classe App
        try {
            Class<?> clazz = Class.forName("exercices.exercice09.exercicetableaux2.App");

            Field minField = clazz.getDeclaredField("MIN");
            Field maxField = clazz.getDeclaredField("MAX");

            // Vérifie que MIN est static, final et de type int
            assertTrue(Modifier.isStatic(minField.getModifiers()), "❌ La constante MIN doit être static.");
            assertTrue(Modifier.isFinal(minField.getModifiers()), "❌ La constante MIN doit être final.");
            assertEquals(int.class, minField.getType(), "❌ La constante MIN doit être de type int.");

            // Vérifie que MAX est static, final et de type int
            assertTrue(Modifier.isStatic(maxField.getModifiers()), "❌ La constante MAX doit être static.");
            assertTrue(Modifier.isFinal(maxField.getModifiers()), "❌ La constante MAX doit être final.");
            assertEquals(int.class, maxField.getType(), "❌ La constante MAX doit être de type int.");

        } catch (Exception e) {
            fail("❌ Les constantes MIN ou MAX sont manquantes ou incorrectes.");
        }

        // Vérifie la présence de l'utilisation de Math.random() ou Random dans le code source
        File fichier = new File("exercices/exercice09/ExerciceTableaux2/src/AppWithErrors.java");
        boolean contientRandom = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("Math.random") || ligne.contains("new Random")) {
                    contientRandom = true;
                    break;
                }
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier App.java.");
        }

        assertTrue(contientRandom, "⚠️ L'utilisation de Math.random() ou Random est attendue.");
    }

    @Test
    public void verifierExerciceTableaux3() {
        verifierExerciceTableaux2(); // Vérifie les constantes et random
        File fichier = new File("exercices/exercice09/ExerciceTableaux3/src/App.java");
        boolean contientMoyenne = false;
        boolean contientRandom = false;

        // Vérifie la présence des mots-clés "moyenne" et l'utilisation de random
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.toLowerCase().contains("moyenne")) contientMoyenne = true;
                if (ligne.contains("Math.random") || ligne.contains("new Random")) contientRandom = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier App.java.");
        }

        assertTrue(contientMoyenne, "⚠️ Le calcul de la moyenne est attendu dans ExerciceTableaux3.");
        assertTrue(contientRandom, "⚠️ L'utilisation de Math.random() ou Random est attendue dans ExerciceTableaux3.");
    }

    @Test
    public void verifierExerciceTableaux4() {
        File fichier = new File("exercices/exercice09/ExerciceTableaux4/src/App.java");
        assertTrue(fichier.exists(), "❌ Le fichier App.java est manquant dans ExerciceTableaux4.");

        boolean contientVariableDepart = false;
        boolean contientBoucleFor = false;
        boolean incrementeCorrectement = false;

        // Vérifie la présence de la variable 'nombreDepart', d'une boucle for et du calcul correct dans la boucle
        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("nombreDepart")) contientVariableDepart = true;
                if (ligne.contains("for") && ligne.contains("nombresSuivants")) contientBoucleFor = true;
                if (ligne.contains("nombresSuivants[i] = nombreDepart + 1 + i")) incrementeCorrectement = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier App.java.");
        }

        assertTrue(contientVariableDepart, "⚠️ La variable 'nombreDepart' est attendue.");
        assertTrue(contientBoucleFor, "⚠️ Une boucle for qui remplit le tableau 'nombresSuivants' est attendue.");
        assertTrue(incrementeCorrectement, "⚠️ Le remplissage du tableau 'nombresSuivants' doit être correct.");
    }
}
