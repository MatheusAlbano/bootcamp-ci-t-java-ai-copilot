import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um número inicial: ");
        var initialValue = scanner.nextInt();

        while (true) {
            System.out.println("Informe outro número: ");
            var value = scanner.nextInt();

            if (value % initialValue == 0) break;
        }
    }
}
