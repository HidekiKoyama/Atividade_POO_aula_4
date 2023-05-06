package com.mycompany.imc;

public class Imc {
    
    public static void main(String[] args){
        
        Calculo c1 = new Calculo(0, 0);
        
        c1.setPeso(60.00f);
        c1.setAltura(1.76f);
        
        float imc = c1.calcularIMC();
        
        System.out.println("Novo IMC: " + imc);
    }
}
