package l3.exe0;

public class Testa {
    public static void main(String[] args) {
        Professor pro1 = new Professor("Vinicius", "123", "Mestre");
        Disciplina dis1 = new Disciplina("João", 10, pro1);
        System.out.println(dis1.mostra());
    }
}
