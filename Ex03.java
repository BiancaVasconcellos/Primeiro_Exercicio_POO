/*3. Rescreva a classe do exercício 1 adicionando a ela um construtor que recebe valores
a serem atribuídos às duas variáveis de instância da classe carro.*/

public class Ex03
 {
    private String cor;
    private String tipo;

//construtor 
    public Ex03 (String cor, String tipo){
        this.cor = cor;
        this.tipo = tipo;
    }
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
        
    }

    public void CameraFrontal (){
          System.out.printf("\nEstacione, sensor frontal ativado\n");
    }
    public void CameraRe () {
           System.out.printf("\nEstacione, sensor frontal de ré ativado");
    }

    public void exibirMensagem (){
        System.out.printf ("\nCarro \n Cor: %s \n Tipo: %s", this.cor, this.tipo);
    }

    
}

    
