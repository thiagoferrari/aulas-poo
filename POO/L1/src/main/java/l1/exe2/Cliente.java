/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1.exe2;

/**
 *
 * @author vimarteleto
 */
public class Cliente {
    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo;
    
    public Cliente() {        
    }
    
    public Cliente(int numeroConta,int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this. numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;        
    }

       
    public float realizarDeposito(float deposito) {
        return this.saldo += deposito;        
    }
    
    public void realizarSaque(float saque) {
        if (this.saldo >= saque) {
            this.saldo -= saque;
    }
        else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void dadosCliente() {
        System.out.println(
            "Número da conta: " + numeroConta + ". Número da agencia: " + numeroAgencia +
            ". Nome do cliente: " + nome + ". Saldo atual: " + saldo + "."
        );        
    }
    
}
