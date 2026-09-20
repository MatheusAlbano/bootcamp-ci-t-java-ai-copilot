import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quanto mede o lado do quadrado? ");
        var sideOfTheSquare = scanner.nextFloat();
        var area = sideOfTheSquare * sideOfTheSquare;
        System.out.printf("A área do quadrado é igual a %s", area);
    }
}
