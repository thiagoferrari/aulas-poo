package l4.exe0;


public class Funcionario {
  // atributo protected pode ser acessado por uma classe filha
  protected String nome;
  protected String cpf;
  protected float salario;

  public Funcionario() {
  }

  public Funcionario(String nome, String cpf, float salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
  }


  public String toString() {
    return "Funcionario{" +
      "nome='" + nome + '\'' +
      ", cpf='" + cpf + '\'' +
      ", salario=" + salario +
      '}';
  }
}
