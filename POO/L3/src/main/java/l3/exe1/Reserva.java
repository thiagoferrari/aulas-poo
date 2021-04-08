package l3.exe1;



public class Reserva {
  private int codigo;
  private String data;
  private float valor;
  // associação
  private Voo voo;
  private Passageiro passageiro;

  public Reserva() {
  }

  public Reserva(int codigo, String data, float valor, Voo voo, Passageiro passageiro) {
    this.setCodigo(codigo);
    this.setData(data);
    this.setValor(valor);
    this.setVoo(voo);
    this.setPassageiro(passageiro);
  }

  public int getCodigo() {
    return codigo;
  }

  public final void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getData() {
    return data;
  }

  public final void setData(String data) {
    this.data = data;
  }

  public float getValor() {
    return valor;
  }

  public final void setValor(float valor) {
    this.valor = valor;
  }

  public Voo getVoo() {
    return voo;
  }

  public final void setVoo(Voo voo) {
    this.voo = voo;
  }

  public Passageiro getPassageiro() {
    return passageiro;
  }

  public final void setPassageiro(Passageiro passageiro) {
    this.passageiro = passageiro;
  }

  public String toString() {
    return "Reserva {" +
      "codigo: " + codigo +
      ", data: '" + data + '\'' +
      ", valor: " + valor +
      ", \n voo: " + voo +
      ", \n passageiro: " + passageiro +
      '}';
  }

}


