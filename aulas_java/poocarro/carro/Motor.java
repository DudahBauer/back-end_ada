package carro;

public class Motor {
   protected int cavalaria;
   protected int dataDaUltimaVistoria;
   protected String fabricante;
   protected boolean isLubrificated;

   public void lubrificador(){
    if(this.isLubrificated == true){
        System.out.println("Seu carro está lubrificado :))");
        return;
    }
    this.isLubrificated = true;
    System.out.println("Seu carro foi lubrificado :))");
   }

   public Motor(int cavalaria, int dataDaUltimaVistoria, String fabricante, boolean isLubrificated){
    this.cavalaria = cavalaria;
    this.dataDaUltimaVistoria = dataDaUltimaVistoria;
    this.fabricante= fabricante;
    this.isLubrificated= isLubrificated;
   }

   public int getCavalaria() {
       return cavalaria;
   }

   public int getDataDaUltimaVistoria() {
       return dataDaUltimaVistoria;
   }

   public String getFabricante() {
       return fabricante;
   }

    public void setCavalaria(int cavalaria) {
        this.cavalaria = cavalaria;
    }

    public void setDataDaUltimaVistoria(int dataDaUltimaVistoria) {
        this.dataDaUltimaVistoria = dataDaUltimaVistoria;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    public void deslubrificar(){
        this.isLubrificated = false;
    }

    public boolean isLubrificado(){
        return this.isLubrificated;
    }
  }

