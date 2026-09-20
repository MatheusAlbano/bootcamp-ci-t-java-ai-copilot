import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe sua altura: ");
        var height = scanner.nextFloat();

        System.out.println("Informe seu peso: ");
        var weight = scanner.nextFloat();

        var imc = weight / (height * height);
        System.out.printf("O valor do seu imc é %.2f \n", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9){
            System.out.println("Peso ideal");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau II (Severa)");
        } else {
            System.out.println("Obesidade grau III (Mórbida)");
        }
    }
}
