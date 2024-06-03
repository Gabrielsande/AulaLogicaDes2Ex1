
package d2e1;

import java.util.Scanner;

public class D2E1 {

    public static void main(String[] args) {

        String nomeCliente;
        double largura, comprimento, area;
       
        Scanner leia= new Scanner(System.in);
       
        System.out.println("Qual o seu nome");
        nomeCliente= leia.nextLine();
        System.out.println("Qual largura do seu terreno:");
        largura= leia.nextDouble();
        System.out.println("Qual o comprimento do terreno:");
        comprimento= leia.nextDouble();
       
        area= largura*comprimento;
       
        System.out.println("A área do seu terreno é "+area);

    }
    
}
