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
public class TesteCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // vamos instanciar os objetos da classe Carro
        // para criar objeto:
            // tipo_objeto nome_objeto = new tipo_objeto()
        Carro obj1 = new Carro();
        obj1.ano = 2018;
        obj1.modelo = "Onix";
        obj1.marca = "Chevrolet";
        obj1.motor = false;
        obj1.velAtual = 0;
        
        Carro obj2 = new Carro(2016, "Palio", "Fiat", true, 50);
        
        Carro obj3 = new Carro(2020, "Gol", "VW", false, 0);

        
        // mostrar o resultado
        obj1.mostra();
        obj2.mostra();
        obj3.mostra();
        
        obj1.ligar();
        
        obj1.acelerar(80);
        obj2.frear(30);
        
        obj2.desligar();
        obj3.ligar();
        
        obj1.mostra();
        obj2.mostra();
        obj3.mostra();
        
        
    }
    
}
