import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual é o comprimento do retângulo? ");
        var lengthOfTheRectangle = scanner.nextFloat();
        System.out.println("Qual é a altura do retângulo? ");
        var heightOfTheRectangle = scanner.nextFloat();
        var area = lengthOfTheRectangle * heightOfTheRectangle;
        System.out.printf("A área desse retângulo é igual a %s", area);
    }
}
