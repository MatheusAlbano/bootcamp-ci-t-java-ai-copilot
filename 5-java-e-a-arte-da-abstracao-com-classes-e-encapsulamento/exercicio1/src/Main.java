import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        var account = new BankAccount(100);

        do {
            System.out.println("===Escolha uma opção===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar dinheiro");
            System.out.println("4. Sacar dinheiro");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Verificar se a conta está usando cheque especial");
            System.out.println("0. Sair");
            var option = scanner.nextInt();

            switch (option) {
                case 1 -> System.out.println("O seu saldo atual é de " + account.getBalance() + " reais.");
                case 2 -> System.out.println("O seu limite do cheque especial é de " + account.getOverdraftLimit() + " reais");
                case 3 -> {
                    System.out.println("Qual valor você deseja depositar?");
                    var value = scanner.nextFloat();
                    account.deposit(value);
                }
                case 4 -> {
                    System.out.println("Qual valor você deseja sacar?");
                    var value = scanner.nextFloat();
                    account.withdraw(value);
                }
                case 5 -> {
                    System.out.println("Qual valor do boleto que deseja pagar?");
                    var value = scanner.nextFloat();
                    account.payBill(value);
                }
                case 6 -> {
                    String mensagem = account.isUsingOverdraft() ?
                        "Sim, a conta está utilizando o valor de " + account.getCurrentOverdraftUsage() + " reais do limite do cheque especial." :
                        "Não";
                    System.out.println(mensagem);
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Opção Inválida!");
            }
        } while (true);


    }

}
