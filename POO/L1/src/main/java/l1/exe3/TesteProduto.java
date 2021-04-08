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
public class TesteProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto obj1 = new Produto() ;
        obj1.id = 100;
        obj1.descricao = "Celular";
        obj1.quantidade = 10;
        obj1.preco = 1499.99f;
        
        Produto obj2 = new Produto(200, "Notebook", 20, 3499.99f);
        
        obj1.comprar(5);
        obj2.comprar(3);
        
        obj1.vender(2);
        obj1.vender(7);
        
        obj1.subir(200);
        obj2.subir(100);
        
        obj1.descer(300);
        obj2.descer(400);
        
        obj1.mostrar();
        obj2.mostrar();
    }
    
}
