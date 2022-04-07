//2. Escreva uma classe de teste que:

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        //2.2 Obtém valores para seus atributos e os atribui adequadamente.
        Scanner scanner = new Scanner(System.in);

        //2.1 Instância dois veiculos
        Ex01 carro1 = new Ex01();
        Ex01 carro2 = new Ex01();

        System.out.printf("O primeiro carro é da cor: ");
        String cor = scanner.nextLine();
        System.out.printf("O primeiro carro é do tipo: ");
        String tipo = scanner.nextLine();
        carro1.setCor(cor);
        carro2.setTipo(tipo);

        System.out.printf("O segundo carro é da cor: ");
        String cor2 = scanner.nextLine();
        System.out.printf("O segundo carro é do tipo: ");
        String tipo2 = scanner.nextLine();
        carro1.setCor(cor2);
        carro2.setTipo(tipo2);
        
        //2.3 Chama cada um dos métodos que você criou.
        carro1.exibirMensagem();
        carro1.CameraFrontal();

        carro2.exibirMensagem();
        carro2.CameraRe();

        //2.4 Exibe os valores das variáveis, usando os métodos getters.
        carro1.getCor();
        carro1.getTipo();

        carro2.getCor();
        carro2.getTipo();

        scanner.close();

       


    }


    
}
