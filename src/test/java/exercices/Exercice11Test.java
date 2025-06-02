package exercices;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de test pour l'exercice 11 :
 * - Vérifie la présence et la structure du fichier App.java
 * - Vérifie la méthode inverseLeTableau (signature, type de retour)
 * - Vérifie les constantes MIN et MAX (présence, type et modificateurs)
 * - Vérifie le bon fonctionnement de la méthode inverseLeTableau avec un tableau d'exemple
 * - Vérifie les affichages demandés dans le main : "Tableau initial" et "Tableau final"
 */
public class Exercice11Test {

    @Test
    public void verifierFichierEtStructure() {
        // Vérifie si le fichier App.java est bien présent dans le bon dossier
        File fichier = new File("exercices/exercice11/ExercicesInversionTableau/src/App.java");
        // Ligne en commentaire pour tester la version avec erreurs si besoin
        //File fichier = new File("exercices/exercice11/ExercicesInversionTableau/src/AppWithErrors.java");
        assertTrue(fichier.exists(), "❌ App.java n'a pas été trouvé dans le dossier ExercicesInversionTableau.");

        try {
            // Charge la classe App grâce à la Reflection (permet d'inspecter le code sans l'exécuter)
            Class<?> clazz = Class.forName("exercices.exercice11.exercicesinversiontableau.App");
            // Ligne en commentaire pour tester la version avec erreurs
            //Class<?> clazz = Class.forName("exercices.exercice11.exercicesinversiontableau.AppWithErrors");

            // Vérifie que la méthode inverseLeTableau existe et qu'elle prend bien un tableau d'entiers en paramètre
            Method method = clazz.getDeclaredMethod("inverseLeTableau", int[].class);
            // Vérifie que la méthode retourne bien un tableau d'entiers (int[])
            assertEquals(int[].class, method.getReturnType(), "❌ La méthode inverseLeTableau doit retourner un tableau d'entiers (int[]).");
            // Vérifie que la méthode est publique
            assertTrue(Modifier.isPublic(method.getModifiers()), "❌ La méthode inverseLeTableau doit être publique.");

            // Vérifie la présence et la déclaration correcte des constantes MIN et MAX
            Field minField = clazz.getDeclaredField("MIN");
            Field maxField = clazz.getDeclaredField("MAX");

            // Vérifie que MIN est static final et de type int
            assertTrue(Modifier.isStatic(minField.getModifiers()) && Modifier.isFinal(minField.getModifiers()),
                    "❌ La constante MIN doit être static final.");
            assertEquals(int.class, minField.getType(), "❌ La constante MIN doit être de type int.");

            // Vérifie que MAX est static final et de type int
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
            // Charge la classe App (qui contient la méthode à tester)
            Class<?> clazz = Class.forName("exercices.exercice11.exercicesinversiontableau.App");
            //Class<?> clazz = Class.forName("exercices.exercice11.exercicesinversiontableau.AppWithErrors");
            Method inverseMethod = clazz.getDeclaredMethod("inverseLeTableau", int[].class);

            // Prépare un tableau d'exemple pour tester le fonctionnement de la méthode
            int[] original = {12, 5, 8, 14};
            // Exécute la méthode inverseLeTableau via Reflection (appelle la méthode sans connaître son code)
            int[] resultat = (int[]) inverseMethod.invoke(null, (Object) original);

            // Vérifie que le résultat n'est pas null
            assertNotNull(resultat, "❌ La méthode inverseLeTableau doit retourner un tableau.");
            // Vérifie que la taille du tableau retourné est correcte
            assertEquals(4, resultat.length, "❌ La taille du tableau retourné doit être la même que l'original.");
            // Vérifie le contenu du tableau retourné (ordre inversé)
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
        // Vérifie la présence des affichages "Tableau initial" et "Tableau final" dans App.java
        File fichier = new File("exercices/exercice11/ExercicesInversionTableau/src/App.java");
        //File fichier = new File("exercices/exercice11/ExercicesInversionTableau/src/AppWithErrors.java");
        boolean afficheInitial = false;
        boolean afficheFinal = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            // Parcours le fichier ligne par ligne pour vérifier la présence des messages attendus
            while ((ligne = reader.readLine()) != null) {
                if (ligne.contains("Tableau initial")) afficheInitial = true;
                if (ligne.contains("Tableau final")) afficheFinal = true;
            }
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture du fichier App.java.");
        }

        // Vérifie que les affichages sont bien présents
        assertTrue(afficheInitial, "⚠️ Le message 'Tableau initial' doit être affiché.");
        assertTrue(afficheFinal, "⚠️ Le message 'Tableau final' doit être affiché.");
    }
}
