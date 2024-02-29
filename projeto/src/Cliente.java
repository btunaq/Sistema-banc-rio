abstract class Cliente {
    private String nome;
    private String id;
    private int telefone;
    private String email;
    private Limite limite;

    public Cliente(String nome, String id, int telefone, String email, Limite limite) {
        this.nome = nome;
        this.id = id;
        this.telefone = telefone;
        this.email = email;
        this.limite = limite;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Limite getLimite() {
        return limite;
    }
}
