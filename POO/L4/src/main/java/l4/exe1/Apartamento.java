package l4.exe1;

public class Apartamento extends Moradia {
  private int andar;
  private boolean sacada;

  public Apartamento() {
    super();
  }

  public Apartamento(String dono, String endereco, int andar, boolean sacada) {
    super(dono, endereco);
    this.setAndar(andar);
    this.setSacadao(sacada);
  }

  public int getAndar() {
    return andar;
  }

  public final void setAndar(int andar) {
    this.andar = andar;
  }

  public boolean isSacada() {
    return sacada;
  }

  public final void setSacadao(boolean sacada) {
    this.sacada = sacada;
  }

  @Override
  public String toString() {
    return "Apartamento{" +
      "andar=" + andar +
      ", sacadao=" + sacada +
      "Moradia{" + super.toString() +
      '}';
  }

  public String mensagemVenda() {
    return "Apartamento vendida com sucesso";
  }
}
