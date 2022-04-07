/*4. Note que a classe de teste deixou de funcionar após a adição do construtor. Faça os
ajustes necessários para que ela volte a funcionar.*/

public class Ex04 {
    
        public static void main(String[] args) {
           
            Ex03 carro1 = new Ex03("Prata","SUV");
            Ex03 carro2 = new Ex03("Azul","Picape");
    
            carro1.exibirMensagem();
            carro1.CameraFrontal();  
    
            carro2.exibirMensagem();  
            carro2.CameraRe();
    
    
            carro1.getCor();
            carro1.getTipo();
    
            carro2.getCor();
            carro2.getTipo();
        }
    }