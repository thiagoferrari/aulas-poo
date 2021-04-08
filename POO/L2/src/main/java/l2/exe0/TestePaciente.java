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
public class TestePaciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente obj1 = new Paciente();
        obj1.setNome("Pedro");
        obj1.setIdade(17);
        obj1.setAltura(1.8f);
        obj1.setPeso(69.5f);
        
        System.out.println("Nome: " + obj1.getNome() + ". Idade: " + obj1.getIdade() + 
                ". Peso: " + obj1.getPeso() + ". Altura: " + obj1.getAltura() + ".");
    }
    
}
