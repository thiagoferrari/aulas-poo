package l4.exe0;

// extends herda os atributos protected e public da classe pai
public class Gerente extends Funcionario {
  public float comissao;

  public Gerente() {
    super();
  }

  public Gerente(String nome, String cpf, float salario, float comissao) {
    // super faz a chamada ao atributo de super classe
    super(nome, cpf, salario);
    this.setComissao(comissao);
  }

  public float getComissao() {
    return comissao;
  }

  public final void setComissao(float comissao) {
    this.comissao = comissao;
  }

  public float salarioFinal() {
    return salario + comissao;
  }

  @Override
  public String toString() {
    return "Gerente{" + super.toString() +
      " comissao=" + comissao +
      " salario final=" + salarioFinal() +
      '}';
  }
}
