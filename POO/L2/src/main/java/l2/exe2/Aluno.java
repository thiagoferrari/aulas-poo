package l2.exe2;

import java.time.format.SignStyle;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private int p1;
    private int p2;

    public Aluno() {

    }
    public Aluno(int numeroAluno, String nome, int idade, int p1, int p2) {
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    // setter
    public final void setNumeroAluno(int numeroAluno) {
        if(String.valueOf(numeroAluno).length() == 6) {
            this.numeroAluno = numeroAluno;
        } else {
            System.out.println("Número de aluno inválido");
        }
    }
    public final void setNome(String nome) {
        if(nome.length() <= 30) {
            this.nome = nome;
        } else {
            System.out.println("O nome deve ter no máximo 30 caracteres");
        }
    }
    public final void setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }
    public final void setP1(int p1) {
        if(p1 > 0) {
            this.p1 = p1;
        } else {
            System.out.println("Nota 1 inválida");
        }
    }
    public final void setP2(int p2) {
        if(p2 > 0) {
            this.p2 = p2;
        } else {
            System.out.println("Nota 2 inválida");
        }
    }

    public int notaFinal() {
        int nota = (getP1() + getP2())/2;
        System.out.println("A nota final é " + nota + ".");
        return nota;
    }
    public void dadosAluno() {
        System.out.println("Número aluno: " + getNumeroAluno() + ", Nome: " + getNome() + ", Idade: " + getIdade());
    }
    public void passou() {
        if(notaFinal() >= 6) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }

    // getters
    public int getNumeroAluno() {
        return this.numeroAluno;
    }
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public int getP1() {
        return p1;
    }
    public int getP2() {
        return p2;
    }
}




