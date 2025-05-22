public class app {
    public static void main(String[] args) throws Exception {
        int nombreDepart = 17;
        int[] nombresSuivants = new int[5];

        System.out.println("Nombre de départ: "+ nombreDepart);

        for (int i = 0; i < nombresSuivants.length; i++) {
            nombresSuivants[i] = nombreDepart + 1 + i;
        }

        for (int i = 0; i < nombresSuivants.length; i++) {
            System.out.println("Cellule " + i + ": " + nombresSuivants[i]);
        }
    }
}
