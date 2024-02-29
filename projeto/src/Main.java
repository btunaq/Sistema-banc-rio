public class Main {
    public static void main(String[] args) {
        // Criando a instância de Limite
        Limite limite = new Limite(); // Os limites padrão serão utilizados

        // Criando bancos
        Banco bancoX = new Banco("BancoX");
        Banco bancoY = new Banco("BancoY");

        // Criando clientes
        PessoaFisica clienteMaria = new PessoaFisica("Maria", "123.456.789-09", 987654321, "maria@example.com", limite);
        PessoaFisica clienteJoao = new PessoaFisica("João", "987.654.321-00", 123456789, "joao@example.com", limite);

        PessoaFisica clienteAna = new PessoaFisica("Ana", "111.222.333-44", 333222111, "ana@example.com", limite);
        PessoaFisica clientePedro = new PessoaFisica("Pedro", "555.666.777-88", 777666555, "pedro@example.com", limite);

        // Criando cliente pessoa jurídica
        PessoaJuridica clienteJuridico = new PessoaJuridica("Empresa XYZ", "12.345.678/0001-99", 999999999, "empresa@example.com", limite);
        PessoaJuridica clienteJuridico2 = new PessoaJuridica("Empresa ABC", "98.765.432/0001-10", 888888888, "empresa2@example.com", limite);

        // Criando contas correntes e poupanças para os clientes nos respectivos bancos
        Conta correnteMaria = new Corrente(bancoX, "001", 1500.0, "Corrente", clienteMaria, false);
        Conta poupancaMaria = new Poupanca(bancoX, "002", 2000.0, "Poupança", clienteMaria, false);

        Conta correnteJoao = new Corrente(bancoY, "003", 1000.0, "Corrente", clienteJoao, false);
        Conta poupancaJoao = new Poupanca(bancoY, "004", 500.0, "Poupança", clienteJoao, false);

        Conta correnteAna = new Corrente(bancoX, "005", 3000.0, "Corrente", clienteAna, false);
        Conta poupancaAna = new Poupanca(bancoX, "006", 4000.0, "Poupança", clienteAna, false);

        Conta correntePedro = new Corrente(bancoY, "007", 2000.0, "Corrente", clientePedro, false);
        Conta poupancaPedro = new Poupanca(bancoY, "008", 1000.0, "Poupança", clientePedro, false);

        Conta juridica = new Corrente(bancoX, "009", 50000.0, "Jurídica", clienteJuridico, true);
        Conta juridica2 = new Corrente(bancoY, "010", 30000.0, "Jurídica", clienteJuridico2, true);

        // Adicionando contas aos bancos
        bancoX.adicionarConta(correnteMaria);
        bancoX.adicionarConta(poupancaMaria);
        bancoX.adicionarConta(correnteAna);
        bancoX.adicionarConta(poupancaAna);
        bancoX.adicionarConta(juridica);

        bancoY.adicionarConta(correnteJoao);
        bancoY.adicionarConta(poupancaJoao);
        bancoY.adicionarConta(correntePedro);
        bancoY.adicionarConta(poupancaPedro);
        bancoY.adicionarConta(juridica2);

        // Exibindo informações das contas antes das operações
        System.out.println("Informações das contas antes das operações:\n");
        bancoX.listarContas();
        bancoY.listarContas();

        //Realizando mais operações nas contas
        correnteMaria.saque(50.0);
        poupancaMaria.deposito(300.0);
        correnteJoao.transferencia(bancoX, "001", 200.0); // Transferência entre contas correntes
        poupancaAna.saque(200.0);
        juridica.deposito(10000.0);
        correntePedro.transferencia(bancoY, "010", 500.0); // Transferência entre conta corrente e jurídica
        poupancaPedro.deposito(150.0);
        correnteAna.saque(1000.0);

        // Exibindo informações das contas após as operações adicionais
        System.out.println("\nInformações das contas após as operações adicionais:\n");
        bancoX.listarContas();
        bancoY.listarContas();

        // Exibindo todos os históricos dos bancos após as operações adicionais
        System.out.println("\nHistóricos dos bancos após as operações adicionais:\n");
        bancoX.listarHistoricos();
        bancoY.listarHistoricos();
    }
}
