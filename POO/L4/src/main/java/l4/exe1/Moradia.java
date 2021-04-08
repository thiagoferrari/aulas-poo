package l4.exe1;

// classe abstrata nao pode ser instanciada!!
public abstract class Moradia {
  protected String dono, endereco;

  public Moradia() {
  }

  public Moradia(String dono, String endereco) {
    this.setDono(dono);
    this.setEndereco(endereco);
  }

  public final void setDono(String dono) {
    this.dono = dono;
  }

  public final void setEndereco(String enredeco) {
    this.endereco = enredeco;
  }

  public String getDono() {
    return dono;
  }

  public String getEnredeco() {
    return endereco;
  }

  public String toString() {
    return "Moradia{" +
      "dono='" + dono + '\'' +
      ", enredeco='" + endereco + '\'' +
      '}';
  }
}

