public class AddTable {

    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = i;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
