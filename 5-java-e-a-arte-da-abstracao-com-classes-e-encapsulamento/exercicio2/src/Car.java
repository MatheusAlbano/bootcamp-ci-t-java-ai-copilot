public class Car {

    private boolean isTheCarOn;
    private int gear;
    private int speed;
    private final int[] maxSpeedPerGear = {0, 20, 40, 60, 80, 100, 120};

    public Car() {
        this.isTheCarOn = false;
        this.gear = 0;
        this.speed = 0;
    }

    public int checkSpeed() {
        System.out.println("Velocidade atual: " + speed + "km/h");
        return speed;
    }

    public boolean startTheCar() {
        isTheCarOn = true;
        System.out.println("Carro ligado!");
        return true;
    }

    public boolean turnOffTheCar() {
        if (gear == 0 && speed == 0) {
            isTheCarOn = false;
            System.out.println("Carro desligado!");
            return true;
        } else {
            System.out.println("Não foi possível desligar o carro. É necessário que o carro esteja parado e no ponto morto!");
            return false;
        }
    }

    public boolean accelerateSpeed() {
        if (!isTheCarOn) {
            System.out.println("Não foi possível acelerar o carro, pois ele está desligado!");
            return false;
        } else if (gear == 0) {
            System.out.println("Não foi possível acelerar o carro, pois ele está no ponto morto!");
            return false;
        } else if (speed + 1 > maxSpeedPerGear[gear]) {
            System.out.println("Troque de marcha para que seja possível acelerar o carro!");
            return false;
        } else {
            speed++;
            System.out.println("Acelerando o carro... vrummmm (velocidade: " + speed + "km/h)");
            return true;
        }
    }

    public boolean decreaseSpeed() {
        if (!isTheCarOn) {
            System.out.println("Não foi possível desacelerar o carro, pois ele está desligado!");
            return false;
        } else if (speed == 0) {
            System.out.println("Não foi possível desacelerar o carro, pois ele está parado!");
            return false;
        } else {
            speed--;
            System.out.println("Desacelerando o carro... (velocidade: " + speed + "km/h)");
            return true;
        }
    }

    public boolean changeGear(int newGear) {
        if (!isTheCarOn) {
            System.out.println("Não foi possível trocar de marcha, pois o carro está desligado!");
            return false;
        }

        if (newGear < 0 || newGear > 6) {
            System.out.println("Não foi possível trocar para a marcha informada, por favor digite uma marcha válida!");
            return false;
        }

        if (newGear != gear + 1 && newGear != gear - 1) {
            System.out.println("Não foi possível trocar para a marcha " + newGear
                    + ", pois o carro está na marcha " + gear + ", e não é possível pular marchas!");
            return false;
        }

        if (newGear == 0) {
            // Só pode voltar ao ponto morto com o carro parado
            if (speed != 0) {
                System.out.println("Não foi possível voltar ao ponto morto com o carro em movimento!");
                return false;
            }
        } else {
            int maxAllowed = maxSpeedPerGear[newGear];
            int minAllowed = (newGear == 1) ? 0 : maxSpeedPerGear[newGear - 1];

            if (speed < minAllowed || speed > maxAllowed) {
                System.out.println("Não foi possível trocar para a marcha " + newGear
                        + ", pois a velocidade atual (" + speed + "km/h) não é compatível com essa marcha!");
                return false;
            }
        }

        gear = newGear;
        System.out.println("Marcha trocada para " + gear + "!");
        return true;
    }

    public boolean turn(String direction) {
        if (!isTheCarOn) {
            System.out.println("Não foi possível virar o carro, pois ele está desligado!");
            return false;
        }

        if (speed < 1 || speed > 40) {
            System.out.println("Não foi possível virar o carro, pois a velocidade (" + speed
                    + "km/h) está fora da faixa permitida (1km a 40km)!");
            return false;
        }

        System.out.println("Virando o carro para " + direction + "...");
        return true;
    }
}