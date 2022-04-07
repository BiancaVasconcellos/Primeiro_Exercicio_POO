/*    1. Escreva uma classe para representar carros. Adicione a ela dois atributos e dois
é métodos todos que lhe pareçam razoáveis. Os dois atributos devem ser encapsulados.
Escreva métodos getters/setters para cada um deles.*/

public class Ex01 {

//Atributos   

private String cor;
private String tipo;

//Getters e Setters

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
      System.out.printf("\nEstacione, sensor frontal ativado\n");
}
public void CameraRe () {
       System.out.printf("\nEstacione, sensor de ré ativado\n");
}

public void exibirMensagem (){
    System.out.printf("\nCarro \nCor: %s \nTipo: %s", this.cor, this.tipo);
}



}