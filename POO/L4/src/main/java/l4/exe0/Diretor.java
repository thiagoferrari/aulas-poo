package l4.exe0;

// extends herda os atributos protected e public da classe pai
public class Diretor extends Funcionario {
  private float bonus;

  public Diretor() {
    super();
  }

  public Diretor(String nome, String cpf, float salario, float bonus) {
    // super faz a chamada ao atributo de super classe
    super(nome, cpf, salario);
    this.setBonus(bonus);
  }

  public float getBonus() {
    return bonus;
  }

  public final void setBonus(float bonus) {
    this.bonus = bonus;
  }

  public float salarioFinal() {
    return salario + bonus;
  }

  @Override
  public String toString() {
    return "Diretor{" + super.toString() +
      " bonus=" + bonus +
      " salario final=" + salarioFinal() +
      '}';
  }
}
