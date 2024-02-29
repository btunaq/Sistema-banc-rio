public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String id, int telefone, String email, Limite limite) {
        super(nome, id, telefone, email, limite);
    }

    public String getCpf() {
        return cpf;
    }
}
