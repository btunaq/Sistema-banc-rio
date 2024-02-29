public class Limite {
    private double limitePessoaFisica;
    private double limitePessoaJuridica;

    public Limite() {
        // Inicialize os limites com valores padrão ou ajuste conforme necessário
        this.limitePessoaFisica = 10000.0;
        this.limitePessoaJuridica = 500000.0;
    }

    public double getLimitePessoaFisica() {
        return limitePessoaFisica;
    }

    public double getLimitePessoaJuridica() {
        return limitePessoaJuridica;
    }

    public void ajustarLimites(boolean isPessoaJuridica) {
        if (isPessoaJuridica) {
            this.limitePessoaJuridica = 500000.0;
        } else {
            this.limitePessoaFisica = 10000.0;
        }
    }

    // Outro método para declarar limites, se necessário
    public void declararLimites(double novoLimitePessoaFisica, double novoLimitePessoaJuridica) {
        this.limitePessoaFisica = novoLimitePessoaFisica;
        this.limitePessoaJuridica = novoLimitePessoaJuridica;
    }
}
