package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice07Test {
    @Test
    public void testPresenceFichiersOperateurs() {
        String[] noms = {"operateurCalcul.java", "operateurAffectation.java", "operateurLogique.java"};
        for (String nom : noms) {
            File f = new File("exercices/exercice07/" + nom);
            assertTrue(f.exists(), "❌ Le fichier " + nom + " est attendu mais introuvable.");
        }
    }
}
