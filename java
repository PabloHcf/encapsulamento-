public class Main {
    public static void main(String[] args) {
        // Criando uma instância de ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria(12345, "João Silva");

        // Realizando depósito
        minhaConta.depositar(1000);

        // Realizando saque
        minhaConta.sacar(500);

        // Exibindo saldo atual
        System.out.println("Saldo atual: " + minhaConta.getSaldo());
    }
}
