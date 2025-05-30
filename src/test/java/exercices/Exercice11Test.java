package exercices;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice11Test {

    @Test
    public void verifierFichierEtStructure() {
        File fichier = new File("exercices/exercice11/ExercicesInversionTableau/src/App.java");
        // Vérifie la présence du fichier App.java
        //File fichier = new File("exercices/exercice11/ExercicesInversionTableau/src/AppWithErrors.java");
        assertTrue(fichier.exists(), "❌ App.java n'a pas été trouvé dans le dossier ExercicesInversionTableau.");

        try {
            // Vérification de la présence de la classe App
            Class<?> clazz = Class.forName("exercices.exercice11.exercicesinversiontableau.App");
            //Class<?> clazz = Class.forName("exercices.exercice11.exercicesinversiontableau.AppWithErrors");

            // Vérification de la méthode inverseLeTableau
            Method method = clazz.getDeclaredMethod("inverseLeTableau", int[].class);
            assertEquals(int[].class, method.getReturnType(), "❌ La méthode inverseLeTableau doit retourner un tableau d'entiers (int[]).");
            assertTrue(Modifier.isPublic(method.getModifiers()), "❌ La méthode inverseLeTableau doit être publique.");

            // Vérification des constantes MIN et MAX
            Field minField = clazz.getDeclaredField("MIN");
            Field maxField = clazz.getDeclaredField("MAX");

            assertTrue(Modifier.isStatic(minField.getModifiers()) && Modifier.isFinal(minField.getModifiers()),
                    "❌ La constante MIN doit être static final.");
            assertEquals(int.class, minField.getType(), "❌ La constante MIN doit être de type int.");

            assertTrue(Modifier.isStatic(maxField.getModifiers()) && Modifier.isFinal(maxField.getModifiers()),
                    "❌ La constante MAX doit être static final.");
            assertEquals(int.class, maxField.getType(), "❌ La constante MAX doit être de type int.");

        } catch (ClassNotFoundException e) {
            fail("❌ La classe App n'a pas été trouvée. Vérifiez le package.");
        } catch (NoSuchMethodException e) {
            fail("❌ La méthode inverseLeTableau(int[]) est manquante.");
        } catch (NoSuchFieldException e) {
            fail("❌ La constante MIN ou MAX est manquante.");
        }
    }

    @Test
    public void verifierFonctionnementInverseLeTableau() {
        try {
            Class<?> clazz = Class.forName("exercices.exercice11.exercicesinversiontableau.App");
            //Class<?> clazz = Class.forName("exercices.exercice11.exercicesinversiontableau.AppWithErrors");
            Method inverseMethod = clazz.getDeclaredMethod("inverseLeTableau", int[].class);

            int[] original = {12, 5, 8, 14};
            int[] resultat = (int[]) inverseMethod.invoke(null, (Object) original);

            assertNotNull(resultat, "❌ La méthode inverseLeTableau doit retourner un tableau.");
            assertEquals(4, resultat.length, "❌ La taille du tableau retourné doit être la même que l'original.");
            assertEquals(14, resultat[0], "❌ Le premier élément du tableau inversé doit être 14.");
            assertEquals(8, resultat[1], "❌ Le deuxième élément du tableau inversé doit être 8.");
            assertEquals(5, resultat[2], "❌ Le troisième élément du tableau inversé doit être 5.");
            assertEquals(12, resultat[3], "❌ Le dernier élément du tableau inversé doit être 12.");

        } catch (Exception e) {
            fail("❌ Erreur lors du test de la méthode inverseLeTableau : " + e.getMessage());
        }
    }

    @Test
    public void verifierAffichagesMain() {
        File fichier = new File("exercices/exercice11/ExercicesInversionTableau/src/App.java");
        //File fichier = new File("exercices/exercice11/ExercicesInversionTableau/src/AppWithErrors.java");
        boolean afficheInitial = false;
        boolean afficheFinal = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("Tableau initial")) afficheInitial = true;
                if (ligne.contains("Tableau final")) afficheFinal = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier App.java.");
        }

        assertTrue(afficheInitial, "⚠️ Le message 'Tableau initial' doit être affiché.");
        assertTrue(afficheFinal, "⚠️ Le message 'Tableau final' doit être affiché.");
    }
}
