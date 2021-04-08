/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1.exe3;

/**
 *
 * @author vimarteleto
 */
public class Produto {
    int id;
    String descricao;
    int quantidade;
    float preco;
    
    public Produto () {
        
    }
    
    public Produto(int id, String descricao, int quantidade, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public int comprar(int comprado) {
       return this.quantidade += comprado;
    }
    
    public int vender(int vendido) {
        return this.quantidade -= vendido;
    }
    
    public float subir(float aumento) {
        return this.preco += aumento;
    }
    
    public float descer(float queda) {
        return this.preco -= queda;
    }
    
    public void mostrar() {
        System.out.println(
            "ID: " + id + ". Descricao: " + descricao + ". Quantidade: " + 
            quantidade + ". Preço: " + preco + "."
        );
    }
}
