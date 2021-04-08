package l2.exe1;



public class TesteCliente {

    public static void main(String[] args) {
        Cliente obj1 = new Cliente("123456-8", "1234-6",  "Vinícius", 100f);

        obj1.realizarDeposito(200.5f);
        obj1.realizarSaque(100.5f);

        obj1.dadosCliente();
    }
}
