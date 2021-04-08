/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1.exe4;

/**
 *
 * @author vimarteleto
 */
public class Rio {
    String nome;
    float nivel;
    boolean poluido;
    
    public Rio() {
        
    }
    
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public float chover(float x) {
        return this.nivel += x;
    }
    
    public float ensolarar(float x) {
        return this.nivel -= x;
    }
    
    public void limpar() {
        this.poluido = false;
    }
    
    public void sujar() {
        this.poluido = true;
    }
    
    public void mostrar() {
        System.out.println(
                "Rio: " + nome + ". Nível: " + nivel + ". Poluído: " + poluido + "."
        );
    }
            
}
