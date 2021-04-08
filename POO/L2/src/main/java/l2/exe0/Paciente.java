/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2.exe0;

/**
 *
 * @author vimarteleto
 */
public class Paciente {
    // visibilidade é private - encapsuladas
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    
    // contrutures
    public Paciente(){
        
    }
    
    public Paciente(String nome, int idade, float peso, float altura){
        this.setNome(nome);
        this.setIdade(idade);
        this.setPeso(peso);
        this.setAltura(altura);
    }
    
    
    // setters
    public final void setNome(String nome){
        this.nome = nome;
    }
    public final void setIdade(int idade){
        if ((idade >= 0) && (idade <= 130)){
            this.idade = idade;
        }   
        else {
            System.out.println("Idade inválida.");
        }
    }
    
    public final void setPeso(float peso){
        if ((peso >= 0) && (peso <= 300)){
            this.peso = peso;
        }   
        else {
            System.out.println("Peso inválida.");
        }
    }
    
    public final void setAltura(float altura){
        if ((altura >= 0) && (altura <= 3)){
            this.altura = altura;
        }   
        else {
            System.out.println("Altura inválida.");
        }
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public final float getPeso() {
        return this.peso;
    }
    
    public float getAltura() {
        return this.altura;
    } 
    
}
