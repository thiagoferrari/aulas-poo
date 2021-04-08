package l4.exe1;

public class Casa extends Moradia {
  private float tamanhoQuintal;
  private boolean churrasqueira;

  public Casa() {
    super();
  }

  public Casa(String dono, String endereco, float tamanhoQuintal, boolean churrasqueira) {
    super(dono, endereco);
    this.setTamanhoQuintal(tamanhoQuintal);
    this.setChurrasqueira(churrasqueira);
  }

  public final void setTamanhoQuintal(float tamanhoQuintal) {
    this.tamanhoQuintal = tamanhoQuintal;
  }

  public final void setChurrasqueira(boolean churrasqueira) {
    this.churrasqueira = churrasqueira;
  }

  public float getTamanhoQuintal() {
    return tamanhoQuintal;
  }

  public boolean isChurrasqueira() {
    return churrasqueira;
  }

  @Override
  public String toString() {
    return "Casa{" +
      "tamanhoQuintal=" + tamanhoQuintal +
      ", churrasqueira=" + churrasqueira +
      "Moradia{" + super.toString() +
      '}';
  }


  public String mensagemVenda() {
    return "Casa vendida com sucesso";
  }
}

