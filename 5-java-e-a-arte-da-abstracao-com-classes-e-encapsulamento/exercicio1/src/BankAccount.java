public class BankAccount {

    private float balance;
    private float overdraftLimit;
    private float currentOverdraftUsage;
    private float overdraftUsageForFee;

    public BankAccount(float balance) {
        this.balance = balance;

        if (balance <= 500) {
            overdraftLimit = 50;
        } else {
            overdraftLimit = balance * 50 / 100;
        }
    }

    public float getBalance() {
        return balance;
    }

    public float getOverdraftLimit() {
        return overdraftLimit;
    }

    public float getCurrentOverdraftUsage() {
        return currentOverdraftUsage;
    }

    public float getOverdraftUsageForFee() {
        return overdraftUsageForFee;
    }

    public boolean isUsingOverdraft() {
        return balance < 0;
    }

    public void withdraw(float value) {

        if (value <= 0) {
            System.out.println("O valor do saque deve ser maior que zero.");
            return;
        }

        if (value > balance + overdraftLimit) {
            System.out.println(
                    "Você não possui saldo suficiente para efetuar esse saque."
            );
            return;
        }

        balance -= value;

        if (isUsingOverdraft()) {

            currentOverdraftUsage = -balance;

            // Guarda o maior valor utilizado durante o período
            // em que o cheque especial está sendo utilizado.
            overdraftUsageForFee =
                    Math.max(overdraftUsageForFee, currentOverdraftUsage);

            System.out.println(
                    "Saque realizado com sucesso. "
                            + "Foi utilizado R$" + currentOverdraftUsage
                            + " do seu limite de cheque especial."
            );

        } else {

            currentOverdraftUsage = 0;

            System.out.println(
                    "Saque realizado com sucesso. "
                            + "Seu saldo atual é de R$" + balance + "."
            );
        }
    }

    public void deposit(float value) {

        if (value <= 0) {
            System.out.println("O valor do depósito deve ser maior que zero.");
            return;
        }

        balance += value;

        if (isUsingOverdraft()) {
            currentOverdraftUsage = -balance;
        } else {
            currentOverdraftUsage = 0;
        }

        // Calcula a taxa de 20% sobre o maior valor
        // utilizado do cheque especial.
        var fee = overdraftUsageForFee * 0.20f;

        // Se já houver uma taxa pendente e agora houver
        // saldo suficiente para pagá-la, desconta a taxa.
        if (overdraftUsageForFee > 0 && balance >= fee) {

            balance -= fee;

            currentOverdraftUsage = 0;
            overdraftUsageForFee = 0;

            System.out.println(
                    "Depósito realizado com sucesso. "
                            + "Seu saldo atual é de R$" + balance + ". "
                            + "Foi descontado o valor de R$" + fee
                            + " do seu saldo por conta da taxa do uso do cheque especial."
            );

            return;
        }

        System.out.println(
                "Depósito realizado com sucesso. "
                        + "Seu saldo atual é de R$" + balance + "."
        );
    }

    public void payBill(float value) {

        if (value <= 0) {
            System.out.println("O valor do boleto deve ser maior que zero.");
            return;
        }

        if (value > balance + overdraftLimit) {
            System.out.println(
                    "Você não possui saldo suficiente para efetuar esse pagamento."
            );
            return;
        }

        balance -= value;

        if (isUsingOverdraft()) {

            currentOverdraftUsage = -balance;

            overdraftUsageForFee =
                    Math.max(overdraftUsageForFee, currentOverdraftUsage);

            System.out.println(
                    "Pagamento do boleto realizado com sucesso. "
                            + "Foi utilizado R$" + currentOverdraftUsage
                            + " do seu limite de cheque especial."
            );

        } else {

            currentOverdraftUsage = 0;

            System.out.println(
                    "Pagamento do boleto realizado com sucesso. "
                            + "Seu saldo atual é de R$" + balance + "."
            );
        }
    }
}