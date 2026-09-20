import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        var value1 = scanner.nextInt();

        System.out.println("Informe o segundo número (lembrando que ele deve ser maior que o primeiro): ");
        var value2 = scanner.nextInt();

        while (value2 <= value1) {
            System.out.println("O segundo número deve ser maior que o primeiro. Informe novamente: ");
            value2 = scanner.nextInt();
        }

        System.out.println("Você deseja visualizar os números pares ou ímpares nesse intervalo? (pares/ímpares)");
        var option = scanner.next();

        while (!option.equalsIgnoreCase("pares") &&
                !option.equalsIgnoreCase("ímpares") &&
                !option.equalsIgnoreCase("impares")) {
            System.out.println("A opção digitada não é válida. Informe novamente: ");
            option = scanner.next();
        }

        if (option.equalsIgnoreCase("pares")) {
            for (var i = value2; i >= value1; i--) {
                if (i % 2 == 0) System.out.println(i);
            }
        } else if ((option.equalsIgnoreCase("ímpares") || option.equalsIgnoreCase("impares"))) {
            for (var i = value2; i >= value1; i--) {
                if (i % 2 != 0) System.out.println(i);
            }
        }
    }
}
