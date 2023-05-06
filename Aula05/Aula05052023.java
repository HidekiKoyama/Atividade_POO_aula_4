/*

* Desenvolva mais métodos para incluir os operadores de atribuição

* Desenvolva mais métodos para incluir os operadores lógico

* Desenvolva mais métodos para incluir os operadores comparação


*/

package aula.pkg04.pkg05.pkg2023;

import java.util.Scanner;
public class Aula05052023 {

    public static void main (String [] args)throws InterruptedException {
    System.out.println("------------------------------------");
    System.out.println("Bem Vindo!");
    long start = System.currentTimeMillis();
    Thread.sleep(2000);
    System.out.println("------------------------------------");
    
    //System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start));
    
    //System.out.flush();
   
    while (true)
    {
    Scanner ler = new Scanner(System.in);
      
    Operadores op = new Operadores();
    
    float recebe;
    System.out.printf("Digite o primeiro valor:\n");
    recebe = ler.nextFloat();
    //System.out.println();
    float recebe2;
    System.out.printf("Digite o segundo valor:\n");
    recebe2 = ler.nextFloat();
    
    System.out.println("O Resultado é: "+ op.adicao(recebe,recebe2));

    System.out.println("O Resultado é: "+ op.subtracao(recebe,recebe2));

    System.out.println("O Resultado é: "+ op.multiplicacao(recebe,recebe2));

    System.out.println("O Resultado é: "+ op.divisao(recebe,recebe2));
    
    }
}
    
}