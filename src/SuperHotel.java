public class SuperHotel {
    static int[] tab = new int[1];
    public void reserve() {

        try {
            tab[0] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Erreur : l'indice du tableau est en dehors des limites.");
        }
    }
    public static void main(String[] args) {
        SuperHotel sp = new SuperHotel();
        sp.reserve();
    }
}