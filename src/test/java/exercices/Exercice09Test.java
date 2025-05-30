package exercices;

import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice09Test {

    @Test
    public void testPresenceFichiers() {
        assertTrue(new File("exercices/exercice09/ExerciceTableaux1/src/App.java").exists(),
            "❌ App.java n'a pas été trouvé dans le dossier ExerciceTableaux1");
        assertTrue(new File("exercices/exercice09/ExerciceTableaux2/src/App.java").exists(),
            "❌ App.java n'a pas été trouvé dans le dossier ExerciceTableaux2");
        assertTrue(new File("exercices/exercice09/ExerciceTableaux3/src/App.java").exists(),
            "❌ App.java n'a pas été trouvé dans le dossier ExerciceTableaux3");
        assertTrue(new File("exercices/exercice09/ExerciceTableaux4/src/App.java").exists(),
            "❌ App.java n'a pas été trouvé dans le dossier ExerciceTableaux4");
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
        File fichier = new File("exercices/exercice09/ExerciceTableaux1/src/App.java");
        //File fichier = new File("exercices/exercice09/ExerciceTableaux1/src/AppWithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier App.java est manquant dans ExerciceTableaux1.");

        boolean contientTableauInt = false;
        boolean contientTableauString = false;
        boolean contientAffichage = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("int[]")) contientTableauInt = true;
                if (ligne.contains("String[]")) contientTableauString = true;
                if (ligne.contains("System.out.println")) contientAffichage = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier App.java.");
        }

        assertTrue(contientTableauInt, "⚠️ Le tableau int[] doit être déclaré.");
        assertTrue(contientTableauString, "⚠️ Le tableau String[] doit être déclaré.");
        assertTrue(contientAffichage, "⚠️ Les valeurs des tableaux doivent être affichées.");
    }

    @Test
    public void verifierExerciceTableaux2() {
        try {
            Class<?> clazz = Class.forName("exercices.exercice09.exercicetableaux2.App");
            //Class<?> clazz = Class.forName("exercices.exercice09.exercicetableaux2.AppWithErrors");

            Field minField = clazz.getDeclaredField("MIN");
            Field maxField = clazz.getDeclaredField("MAX");

            assertTrue(Modifier.isStatic(minField.getModifiers()), "❌ La constante MIN doit être static.");
            assertTrue(Modifier.isFinal(minField.getModifiers()), "❌ La constante MIN doit être final.");
            assertEquals(int.class, minField.getType(), "❌ La constante MIN doit être de type int.");

            assertTrue(Modifier.isStatic(maxField.getModifiers()), "❌ La constante MAX doit être static.");
            assertTrue(Modifier.isFinal(maxField.getModifiers()), "❌ La constante MAX doit être final.");
            assertEquals(int.class, maxField.getType(), "❌ La constante MAX doit être de type int.");

        } catch (Exception e) {
            fail("❌ Les constantes MIN ou MAX sont manquantes ou incorrectes.");
        }

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
        verifierExerciceTableaux2(); // Vérifie aussi MIN, MAX, random
        File fichier = new File("exercices/exercice09/ExerciceTableaux3/src/App.java");
        //File fichier = new File("exercices/exercice09/ExerciceTableaux3/src/AppWithErrors.java");
        boolean contientMoyenne = false;
        boolean contientRandom = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.toLowerCase().contains("moyenne")) {
                    contientMoyenne = true;
                }
                if (ligne.contains("Math.random") || ligne.contains("new Random")) {
                    contientRandom = true;
                }
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
        //File fichier = new File("exercices/exercice09/ExerciceTableaux4/src/AppWithErrors.java");
        assertTrue(fichier.exists(), "❌ Le fichier App.java est manquant dans ExerciceTableaux4.");

        boolean contientVariableDepart = false;
        boolean contientBoucleFor = false;
        boolean incrementeCorrectement = false;

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
