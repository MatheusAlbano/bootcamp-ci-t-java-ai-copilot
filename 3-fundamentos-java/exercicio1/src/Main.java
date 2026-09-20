import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Olá, qual o seu nome? ");
        var name = scanner.next();
        System.out.println("Em que ano você nasceu? ");
        var yearOfbirth = scanner.nextInt();
        var age = LocalDate.now().getYear() - yearOfbirth;
        System.out.printf("Olá %s você tem %s anos", name, age);
    }
}
