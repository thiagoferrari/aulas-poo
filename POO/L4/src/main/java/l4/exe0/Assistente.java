package l4.exe0;

// extends herda os atributos protected e public da classe pai
public class Assistente extends Funcionario {
  private float valeTransporte;

  public Assistente() {
    super();
  }

  public Assistente(String nome, String cpf, float salario, float valeTransporte) {
    // super faz a chamada ao atributo de super classe
    super(nome, cpf, salario);
    this.setValeTransporte(valeTransporte);
  }

  public float getValeTransporte() {
    return valeTransporte;
  }

  public final void setValeTransporte(float valeTransporte) {
    this.valeTransporte = valeTransporte;
  }

  public float salarioFinal() {
    return salario + valeTransporte;
  }

  @Override
  public String toString() {
    return "Assistente{" + super.toString() +
      " vale transporte=" + valeTransporte +
      " salario final=" + salarioFinal() +
      '}';
  }
}
