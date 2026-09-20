import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número que você deseja saber a tabuada: ");
        var number = scanner.nextInt();
        System.out.println("=============================");
        System.out.println("Tabuada do número " + number);
        System.out.println("=============================");

        for (var i = 0; i <= 10; i++){
            var result = number * i;
            System.out.println(number + " X " + i + " = " +  result);
        }
    }
}
