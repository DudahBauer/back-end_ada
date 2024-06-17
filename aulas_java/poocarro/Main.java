import carro.Carro;
import carro.Motor;

public class Main {

public static void main(String[] args) {
    
    Motor motor1 = new Motor(1, 030724,"chervolet", true);
    Carro carro1 = new Carro("chervolet", "creme", "Onix", "MEVB0307", 4, motor1);

    carro1.acelerar();
    carro1.parar();
    carro1.ligarEDesligar();
    carro1.acelerar();
    carro1.acelerar();
    carro1.parar();
    carro1.acelerar();
    carro1.parar();
    carro1.acelerar();
    carro1.parar();
    carro1.acelerar();
    carro1.lubrificarMotor();
    carro1.lubrificarMotor();
    carro1.ligarEDesligar();

}

}