package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice10Test {

    @Test
    public void testFichiersExistent() {
        assertTrue(new File("exercices/exercice10/Methodes.java").exists(), "❌ Le fichier Methodes.java est manquant !");
        assertTrue(new File("exercices/exercice10/ExercicesMethodesTableaux/src/App.java").exists(), "❌ Le fichier App.java est manquant !");
        //assertTrue(new File("exercices/exercice10/MethodesWithErrors.java").exists(), "❌ Le fichier Methodes.java est manquant !");
        //assertTrue(new File("exercices/exercice10/ExercicesMethodesTableaux/src/AppWithErrors.java").exists(), "❌ Le fichier App.java est manquant !");
    }

    @Test
    public void testMethodesDansMethodesJava() {
        try {
            Class<?> clazz = Class.forName("exercices.exercice10.Methodes");
            //Class<?> clazz = Class.forName("exercices.exercice10.MethodesWithErrors");

            Method direBonjour = clazz.getDeclaredMethod("direBonjour");
            assertTrue(Modifier.isPublic(direBonjour.getModifiers()), "❌ La méthode direBonjour doit être publique.");

            Method dire = clazz.getDeclaredMethod("dire", String.class);
            assertTrue(Modifier.isPublic(dire.getModifiers()), "❌ La méthode dire(String) doit être publique.");

            boolean contientBonjour = false;
            File fichier = new File("exercices/exercice10/Methodes.java");
            //File fichier = new File("exercices/exercice10/MethodesWithErrors.java");
            try (BufferedReader reader = new BufferedReader(new FileReader(fichier))) {
                String ligne;
                while ((ligne = reader.readLine()) != null) {
                    if (ligne.contains("System.out.println") && ligne.contains("Bonjour")) {
                        contientBonjour = true;
                    }
                }
            }
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
            Class<?> clazz = Class.forName("exercices.exercice10.exercicesmethodestableaux.App");
            //Class<?> clazz = Class.forName("exercices.exercice10.exercicesmethodestableaux.AppWithErrors");

            String[] methodesAttenues = {
                "creeTableauEntiers", "remplirTableauValeur", "remplirTableauAleatoire",
                "tailleTableau", "afficheTableau", "rechercheMinTableau",
                "rechercheMaxTableau", "compteOccurences", "sommeTableau",
                "moyenneTableau", "remplacerValeur", "trouvePremiereOccurence",
                "trouveDerniereOccurence"
            };

            for (String nomMethode : methodesAttenues) {
                boolean trouvée = false;
                for (Method m : clazz.getDeclaredMethods()) {
                    if (m.getName().equals(nomMethode)) {
                        trouvée = true;
                        break;
                    }
                }
                assertTrue(trouvée, "❌ La méthode " + nomMethode + " est manquante dans App.java !");
            }

        } catch (ClassNotFoundException e) {
            fail("❌ La classe App dans ExercicesMethodesTableaux n'a pas été trouvée.");
        } catch (Exception e) {
            fail("❌ Erreur lors de la vérification des méthodes dans App.java : " + e.getMessage());
        }
    }
}
