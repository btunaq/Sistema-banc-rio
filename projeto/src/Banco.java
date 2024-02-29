import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome; // Adicionando o nome do banco
    private List<Conta> contas;
    private List<Historico> historicos;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.historicos = new ArrayList<>();
    }

    public void adicionarHistorico(Historico historico) {
        historicos.add(historico);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<Historico> getHistoricos() {
        return historicos;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        System.out.println("Informações das contas do Banco " + nome + ":");
        for (Conta conta : contas) {
            System.out.println("Cliente: " + conta.getCliente().getNome() +
                    " | Número da conta: " + conta.getNumero() +
                    " | Saldo: R$" + conta.getSaldo() +
                    " | Limite: R$" + (conta.getCliente() instanceof PessoaJuridica ? conta.getCliente().getLimite().getLimitePessoaJuridica() : conta.getCliente().getLimite().getLimitePessoaFisica()) +
                    " | Banco: " + nome);
        }
        System.out.println("");
    }

    public void listarHistoricos() {
        System.out.println("\nTodos os históricos do banco " + nome + ":");
        for (Historico historico : historicos) {
            System.out.println("Cliente: " + historico.getConta().getCliente().getNome() +
                    " | Número da Conta: " + historico.getNumeroConta() +
                    " | Tipo: " + historico.getTipo() +
                    " | Valor: R$" + historico.getValor() +
                    " | Saldo Anterior: R$" + historico.getSaldoAnterior() +
                    " | Saldo Posterior: R$" + historico.getSaldoPosterior());
        }
    }

    public Conta encontrarContaPorNumero(String numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numeroConta)) {
                return conta;
            }
        }
        return null; 
    }
}
