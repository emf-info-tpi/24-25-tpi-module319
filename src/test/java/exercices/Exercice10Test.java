package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de tests pour Exercice 10 :
 * - Vérifie la présence des fichiers attendus
 * - Vérifie la déclaration des méthodes dans la classe Methodes
 * - Vérifie le comportement des méthodes et leur présence dans App.java
 * - Utilise Reflection pour analyser les signatures des méthodes
 * - Vérifie le contenu des affichages dans la méthode direBonjour
 */
public class Exercice10Test {

    @Test
    public void testFichiersExistent() {
        // Vérifie si les fichiers principaux nécessaires sont bien présents dans le projet
        assertTrue(new File("exercices/exercice10/Methodes.java").exists(), "❌ Le fichier Methodes.java est manquant !");
        assertTrue(new File("exercices/exercice10/ExercicesMethodesTableaux/src/App.java").exists(), "❌ Le fichier App.java est manquant !");
        // Ces lignes servent à tester la version avec erreurs si besoin
        // assertTrue(new File("exercices/exercice10/MethodesWithErrors.java").exists(), "❌ Le fichier Methodes.java est manquant !");
        // assertTrue(new File("exercices/exercice10/ExercicesMethodesTableaux/src/AppWithErrors.java").exists(), "❌ Le fichier App.java est manquant !");
    }

    @Test
    public void testMethodesDansMethodesJava() {
        try {
            // Chargement de la classe Methodes avec Reflection
            Class<?> clazz = Class.forName("exercices.exercice10.Methodes");
            // Pour tester la version avec erreurs si besoin
            //Class<?> clazz = Class.forName("exercices.exercice10.MethodesWithErrors");

            // Vérifie si la méthode direBonjour est bien déclarée, publique et accessible
            Method direBonjour = clazz.getDeclaredMethod("direBonjour");
            assertTrue(Modifier.isPublic(direBonjour.getModifiers()), "❌ La méthode direBonjour doit être publique.");

            // Vérifie si la méthode dire(String) est bien déclarée avec un paramètre String et publique
            Method dire = clazz.getDeclaredMethod("dire", String.class);
            assertTrue(Modifier.isPublic(dire.getModifiers()), "❌ La méthode dire(String) doit être publique.");

            // Vérifie le contenu de la méthode direBonjour (si elle affiche bien 'Bonjour')
            boolean contientBonjour = false;
            File fichier = new File("exercices/exercice10/Methodes.java");
            //File fichier = new File("exercices/exercice10/MethodesWithErrors.java");

            // Lit le fichier ligne par ligne pour rechercher l'affichage attendu
            try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
                String ligne;
                while ((ligne = reader.readLine()) != null) {
                    if (ligne.contains("System.out.println") && ligne.contains("Bonjour")) {
                        contientBonjour = true;
                    }
                }
            }

            // Vérifie que la méthode direBonjour affiche bien "Bonjour"
            assertTrue(contientBonjour, "❌ La méthode direBonjour doit afficher 'Bonjour'.");

        } catch (ClassNotFoundException e) {
            fail("❌ La classe Methodes n'a pas été trouvée.");
        } catch (NoSuchMethodException e) {
            fail("❌ Une des méthodes attendues n'a pas été trouvée dans Methodes.java.");
        } catch (Exception e) {
            fail("❌ Erreur lors de la lecture de MethodesWithErrors.java.");
        }
    }

    @Test
    public void testMethodesDansAppJavaEtComportement() {
        try {
            // Chargement de la classe App pour vérifier la présence des méthodes demandées
            Class<?> clazz = Class.forName("exercices.exercice10.exercicesmethodestableaux.App");
            //Class<?> clazz = Class.forName("exercices.exercice10.exercicesmethodestableaux.AppWithErrors");

            // Liste des méthodes attendues dans App.java
            String[] methodesAttenues = {
                "creeTableauEntiers", "remplirTableauValeur", "remplirTableauAleatoire",
                "tailleTableau", "afficheTableau", "rechercheMinTableau",
                "rechercheMaxTableau", "compteOccurences", "sommeTableau",
                "moyenneTableau", "remplacerValeur", "trouvePremiereOccurence",
                "trouveDerniereOccurence"
            };

            // Parcours de chaque méthode attendue
            for (String nomMethode : methodesAttenues) {
                boolean trouvée = false;
                // Vérifie si la méthode est bien présente dans la classe
                for (Method m : clazz.getDeclaredMethods()) {
                    if (m.getName().equals(nomMethode)) {
                        trouvée = true;
                        break;
                    }
                }
                // Message d'erreur clair si une méthode est manquante
                assertTrue(trouvée, "❌ La méthode " + nomMethode + " est manquante dans App.java !");
            }

        } catch (ClassNotFoundException e) {
            fail("❌ La classe App dans ExercicesMethodesTableaux n'a pas été trouvée.");
        } catch (Exception e) {
            fail("❌ Erreur lors de la vérification des méthodes dans App.java : " + e.getMessage());
        }
    }
}
