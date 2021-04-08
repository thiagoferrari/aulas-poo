package l2.exe1;


public class Cliente {
    private String numeroConta;
    private  String numeroAgencia;
    private String nome;
    private float saldo;

    public Cliente() {

    }

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroAgencia(numeroAgencia);
        this.setNumeroConta(numeroConta);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    // setters
    public final void setNumeroAgencia(String numeroAgencia) {
        if(numeroAgencia.length() == 6 && numeroAgencia.indexOf("-") == 4) {
            this.numeroAgencia = numeroAgencia;
        }
        else {
            System.out.println("Agência inválida");
        }
    }
    public final void setNumeroConta(String numeroConta) {
        if(numeroConta.length() == 8 && numeroConta.indexOf("-") == 6){
            this.numeroConta = numeroConta;
        }
        else {
            System.out.println("Conta inválida");
        }
    }
    public final void setNome(String nome) {
        if(nome.length() <= 30) {
            this.nome = nome;
        }
        else {
            System.out.println("O nome deve ter no máximo 30 caracteres");
        }
    }
    public final void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void realizarDeposito(float deposito) {
         this.setSaldo(this.saldo + deposito);
    }
    public void realizarSaque(float saque) {
        if(this.saldo >= saque) {
            this.saldo -= saque;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    // getters
    public String getNumeroConta() {
        return this.numeroConta;
    }
    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }
    public String getNome() {
        return this.nome;
    }
    public float getSaldo() {
        return this.saldo;
    }

    public void dadosCliente() {
        System.out.println(
                "Número da conta: " + getNumeroConta() + ". Número da agencia: " + getNumeroAgencia() + ". Nome do cliente: " +
                        getNome() + ". Saldo atual: " + getSaldo() + ".");
    }
}
