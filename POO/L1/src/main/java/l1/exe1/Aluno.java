/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1.exe1;

/**
 *
 * @author vimarteleto
 */
public class Aluno {
    // variáveis
    int numeroAluno;
    String nome;
    int idade;
    float p1;
    float p2;
    
    // metodo construtor sem parametros
    public Aluno()  {  
    }
    
    // metodo construtor com parametros
    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public float notaFinal() {
        return ((this.p1 + this.p2)/2);
    }
    
    public String dadosAluno() {
        return "Número aluno: " + numeroAluno + ", Nome: " + nome + ", Idade: " + idade;
    }
    
    public boolean passou() {
        return this.notaFinal() >= 6;
    }  
    
    
}

