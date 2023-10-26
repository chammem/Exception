import java.util.Scanner;

public class DivisionException {
    static int x = 20;
    static int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number");
        y = scanner.nextInt();
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.err.println("Erreur : Division par zéro n'est pas autorisée.");

        }
    }
}
