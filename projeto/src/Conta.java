
abstract class Conta {
    private String numero;
    private double saldo;
    private String tipo;
    private Cliente cliente;
    protected Banco banco;
    private Limite limite;

    public Conta(Banco banco, String numero, double saldoInicial, String tipo, Cliente cliente, boolean isPessoaJuridica) {
        this.banco = banco;
        this.numero = numero;
        this.saldo = saldoInicial;
        this.tipo = tipo;
        this.cliente = cliente;

        this.limite = new Limite();
        this.limite.ajustarLimites(isPessoaJuridica);
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimitePessoa() {
        return limite.getLimitePessoaFisica();  // Usando limite para pessoa física como padrão
    }

    public abstract void saque(double valor);

    public abstract void deposito(double valor);

    public abstract void transferencia(Banco banco, String idContaDestino, double valor);

    public Banco getBanco() {
        return banco;
    }
}
