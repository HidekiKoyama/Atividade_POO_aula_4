package com.mycompany.imc;
    
public class Calculo {
    
    private float peso;
    private float altura;
    
    public Calculo (float peso, float altura){
        this.altura = altura;
        this.peso = peso;
    }
    
    public float getPeso(){
        return peso;
    }
    public float getAltura(){
        return altura;
    }
    
    // -------------------------------------------------
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    // calculo
    
    public float calcularIMC() {
        return peso / (altura * altura);
    }
}
