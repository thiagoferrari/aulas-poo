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
public class TesteRio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rio obj1 = new Rio("Sapucaí", 50.2f, false);
        
        Rio obj2 = new Rio();
        obj2.nome = "Canoas";
        obj2.nivel = 60.8f;
        obj2.poluido = true;
        
        obj1.chover(9.8f);
        obj2.ensolarar(20.8f);
        
        obj1.limpar();
        obj2.sujar();
        
        obj1.mostrar();
        obj2.mostrar();       
    
    } 
}
