public class Ex01 {

//Atributos   

private String cor;
private String tipo;

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

// Métodos   
public void CameraFrontal (){
      System.out.printf("\nSensor Frontal Ativado\n");
}
public void CameraRe () {
       System.out.printf("\nSenso de Ré Ativado");
}

public void exibirMensagem (){
    System.out.printf("\nCarro \nCor: %s \nTipo: %s", this.getCor(), this.getTipo());
}



}