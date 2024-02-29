public class Historico {
    private Conta conta;
    private String numeroConta; 
    private double saldoAnterior;
    private String tipoDeMovimento;
    private double valor;
    private double saldoPosterior;

    public Historico(Conta conta, String numeroConta, double saldoAnterior, String tipoDeMovimento, double valor, double saldoPosterior) {
        this.conta = conta;
        this.numeroConta = numeroConta;
        this.saldoAnterior = saldoAnterior;
        this.tipoDeMovimento = tipoDeMovimento;
        this.valor = valor;
        this.saldoPosterior = saldoPosterior;
    }

    public Conta getConta() {
        return conta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public String getTipo() {
        return tipoDeMovimento;
    }

    public double getValor() {
        return valor;
    }

    public double getSaldoPosterior() {
        return saldoPosterior;
    }
}
