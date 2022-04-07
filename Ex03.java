public class Ex03
 {
    private String cor;
    private String tipo;

    public Ex03 (String cor, String tipo){
        this.cor = cor;
        this.tipo = tipo;
    }
    
    public String getCor() {
        return this.cor;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
        
    }

 // Métodos   
    public void CameraFrontal (){
          System.out.printf("\nSensor Frontal Ativado\n");
    }
    public void CameraRe () {
           System.out.printf("\nSenso de Ré Ativado");
    }

    public void exibirMensagem (){
        System.out.printf ("\nCarro \nCor: %s \nTipo: %s", this.getCor(), this.getTipo());
    }

    
    
}

    
