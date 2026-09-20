import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe um número inicial:");
        var initialValue = scanner.nextInt();

        while (true) {
            System.out.println("Informe o número para verificação:");
            var toVerify = scanner.nextInt();

            if (toVerify < initialValue) {
                System.out.printf("Informe um número maior que %s:\n", initialValue);
                continue;
            }

            var result = toVerify % initialValue;
            System.out.printf("%s %% %s = %s \n", toVerify, initialValue, result);
            if (result != 0) break;
        }
    }
}
