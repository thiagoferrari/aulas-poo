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
public class TesteAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(10, "Vinicius", 27, 8.4f, 6.9f);
        System.out.println(obj1.dadosAluno());
        System.out.println(obj1.passou());
        
        Aluno obj2 = new Aluno(11, "João", 27, 7.1f, 5);
        System.out.println(obj2.dadosAluno());
        System.out.println(obj2.passou());
        
    }
    
}
