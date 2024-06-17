package carro;

public class Carro {
    protected String marca;
    protected String cor;
    protected  String modelo;
    protected String placa;
    protected int quantidadeDePortas;
    protected boolean temArCondicionado = false;
    protected Motor motor;
    protected boolean acelerando = false;
    protected boolean ligado = false;
    protected int aceleradas = 2;

    public Carro( String marca, String cor, String modelo, String placa, int quantidadeDePortas, Motor motor){
        this.marca= marca;
        this.cor= cor;
        this.modelo=modelo;
        this.placa=placa;
        this.quantidadeDePortas=quantidadeDePortas;
        this.motor= motor; 
    }

    public void ligarEDesligar(){
        if (this.ligado == true) {
        this.ligado=false;

        System.out.println("O carro foi desligado");
        return;
        }
        this.ligado = true;
        System.out.println("O carro foi ligado");
    }


    public void acelerar(){
        if(!motor.isLubrificado()){
            System.out.println("Lubrifique o motor!");
        }

        if(this.aceleradas == 0){
            this.motor.deslubrificar();
        }

        if(this.acelerando == true){
            System.out.println("O carro já está acelerando");
            return;
        }

        if (!this.ligado) {
            System.out.println("Vc está tentando acelerar com o carro desligado, parabens!!");
            return;
        }

        this.acelerando = true;
        System.out.println("O carro está acelerando");
        this.aceleradas--;
        return;
    }

    public void parar(){
        if(this.acelerando==true){
            this.acelerando=false;
            System.out.println("O carro está parado.");
            return;
        }
        System.out.println("O carro já está parado");
    }

    public void lubrificarMotor(){
        this.motor.lubrificador();
        this.aceleradas = 2;
    }
}
