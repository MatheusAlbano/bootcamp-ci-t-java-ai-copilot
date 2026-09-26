import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== MENU DO CARRO =====");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Trocar de marcha");
            System.out.println("6 - Virar (esquerda/direita)");
            System.out.println("7 - Verificar velocidade");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            String input = scanner.nextLine().trim();
            int option;

            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digite um número.");
                continue;
            }

            switch (option) {
                case 1:
                    car.startTheCar();
                    break;

                case 2:
                    car.turnOffTheCar();
                    break;

                case 3:
                    car.accelerateSpeed();
                    break;

                case 4:
                    car.decreaseSpeed();
                    break;

                case 5:
                    System.out.print("Digite a marcha desejada (0 a 6): ");
                    try {
                        int newGear = Integer.parseInt(scanner.nextLine().trim());
                        car.changeGear(newGear);
                    } catch (NumberFormatException e) {
                        System.out.println("Marcha inválida! Digite um número.");
                    }
                    break;

                case 6:
                    System.out.print("Para qual direção (esquerda/direita)? ");
                    String direction = scanner.nextLine().trim();
                    car.turn(direction);
                    break;

                case 7:
                    car.checkSpeed();
                    break;

                case 0:
                    running = false;
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha um número entre 0 e 7.");
            }
        }
    }
}