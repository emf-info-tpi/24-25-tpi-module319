package exercices;

import org.junit.jupiter.api.Test;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice09Test {
    @Test
    public void testPresenceFichiers() {
        assertTrue(new File("exercices/exercice09/ExerciceTableaux1/src/App.java").exists(),
            "❌ App.java manquant dans ExerciceTableaux1");
        assertTrue(new File("exercices/exercice09/ExerciceTableaux2/src/App.java").exists(),
            "❌ App.java manquant dans ExerciceTableaux2");
        assertTrue(new File("exercices/exercice09/ExerciceTableaux3/src/App.java").exists(),
            "❌ App.java manquant dans ExerciceTableaux3");
        assertTrue(new File("exercices/exercice09/ExerciceTableaux4/src/App.java").exists(),
            "❌ App.java manquant dans ExerciceTableaux4");
    }
}
