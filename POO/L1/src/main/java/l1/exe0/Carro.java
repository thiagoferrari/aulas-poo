/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1.exe0;

/**
 *
 * @author vimarteleto
 */
public class Carro {
    // declaração de variaveis:
        // tipo_variavel nomeVariavel
    String marca; // String é um tipo de dados e uma classe
    String modelo; // String é um tipo de dados e uma classe
    int ano; // int é um tipo de dado primitivo
    boolean motor; // boolean é um tipo de dado primitivo
    float velAtual; // float é um tipo de dado primitivo
    
    // método construtor
    // possui o mesmo nome da classe
    public Carro(int ano, String modelo, String marca, boolean motor, float velAtual) { 
        // this representa o objeto que chama o método
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.velAtual = velAtual;
    }
    
    // método construtor sem parametros
    public Carro() {
    }
    
    public void mostra() {
        System.out.println("Ano: " + this.ano + " Modelo: " + this.modelo + " Marca: " + this.marca + 
                " Motor: " + this.motor + " Velocidade: " + this.velAtual);
    }
    
    public void ligar() {
        this.motor = true;
    }
    
    public void desligar() {
        this.motor = false;
        this.velAtual = 0;
    }
    
    /**
     *
     * @param x
     */
    public void acelerar(float x) {
        if(this.motor){
            this.velAtual = this.velAtual + x;
        }
        else {
            System.out.println("Carro está desligado.");
        }
        
    }
    
    
    public void frear(float velFreio) {
        if(this.motor && this.velAtual >= velFreio) {
            this.velAtual -= velFreio;
        }
        else if(this.motor && this.velAtual < velFreio) {
            this.velAtual = 0;
        }
        else {
            System.out.println("Carro deve estar ligado");
        }
    }
}
