package l4.exe0;


import java.util.ArrayList;

public class Teste {

  public static void exemplo(Funcionario obj) {
    System.out.println(obj.toString());
  }

  public static void main(String[] args) {

    Gerente obj1 = new Gerente("Vinicius", "123456", 1500.5f, 100.25f);
    Diretor obj2 = new Diretor("Marteleto", "123456", 2000, 500.5f);
    Assistente obj3 = new Assistente("Silveira", "123654", 1000.25f, 50);

    /*
    System.out.println(ger1.toString());
    System.out.println(dir1.toString());
    System.out.println(ass1.toString());
    */

    exemplo(obj1);

    // criando um vetor
    ArrayList<Funcionario> vetor = new ArrayList();
    // adicionando os objetos no vetor
    vetor.add(obj1);
    vetor.add(obj2);
    vetor.add(obj3);

    for(Funcionario f: vetor) {
      System.out.println(f.toString());
    }
  }
}
