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
public class TesteCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(1, 100, "Vinicius", 200.5f);
        Cliente obj2 = new Cliente(2, 200, "João", 500);
        Cliente obj3 = new Cliente(3, 300, "Paulo", 100.8f);
        
        obj1.realizarDeposito(200);
        obj1.realizarSaque(100.4f);
        
        obj2.realizarDeposito(50.8f);
        obj2.realizarSaque(80.4f);
        
        obj3.realizarDeposito(10);
        obj3.realizarSaque(100.8f);
        
        obj1.dadosCliente();
        obj2.dadosCliente();
        obj3.dadosCliente();
        
        
    }
    
}
