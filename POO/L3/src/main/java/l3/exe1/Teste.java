package l3.exe1;


import java.util.Date;

public class Teste {
  public static void main(String[] args) {
    Passageiro pass1 = new Passageiro("Vinicius", "123456-8");
    Voo voo1 = new Voo(10, "Franca", "Rio de Janeiro");
    Reserva res1 = new Reserva(100, "21/04/2021", 100.5f, voo1, pass1);



    System.out.println(res1.toString());
  }
}
