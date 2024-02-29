class Poupanca extends Conta {
    public Poupanca(Banco banco, String numero, double saldo, String tipo, Cliente cliente, boolean isPessoaJuridica) {
        super(banco, numero, saldo, tipo, cliente, isPessoaJuridica);
    }

    @Override
    public void saque(double valor) {
        if (valor > 0) {
            double novoSaldo = getSaldo() - valor;
            if (novoSaldo >= 0) {
                setSaldo(novoSaldo);
                getBanco().adicionarHistorico(new Historico(this, getNumero(), getSaldo() + valor, "SAQUE", valor, novoSaldo));
                System.out.println("Saque de R$" + valor + " na conta " + getNumero() + " realizado com sucesso. Novo saldo: R$" + novoSaldo);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    @Override
public void deposito(double valor) {
    if (valor > 0) {
        double novoSaldo = getSaldo() + valor;
        setSaldo(novoSaldo);
        getBanco().adicionarHistorico(new Historico(this, getNumero(), getSaldo() - valor, "DEPÓSITO", valor, novoSaldo));
        System.out.println("Depósito de R$" + valor + " na conta " + getNumero() + " realizado com sucesso. Novo saldo: R$" + novoSaldo);
    } else {
        System.out.println("Valor inválido para depósito.");
    }
}

    @Override
    public void transferencia(Banco banco, String numeroContaDestino, double valor) {
        if (valor > 0) {
            Conta contaDestino = banco.encontrarContaPorNumero(numeroContaDestino);

            if (contaDestino != null) {
                double novoSaldo = getSaldo() - valor;
                if (novoSaldo >= 0) {
                    setSaldo(novoSaldo);
                    contaDestino.deposito(valor);
                    getBanco().adicionarHistorico(new Historico(this, getNumero(), getSaldo() + valor, "SAQUE", valor, novoSaldo));
                    System.out.println("Transferência de R$" + valor + " da conta " + getNumero() + " para a conta " + numeroContaDestino + " realizada com sucesso.");
                } else {
                    System.out.println("Saldo insuficiente para realizar a transferência.");
                }
            } else {
                System.out.println("Conta de destino não encontrada.");
            }
        } else {
            System.out.println("Valor inválido para transferência.");
        }
    }
}
