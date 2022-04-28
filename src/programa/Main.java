package programa;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Angra","12345678901",
                "rua do cafe, 1", "11955558888");
        Cliente cliente2 = new Cliente("Maria", "09876543212",
                "Rua da leite, 2", "11977776666");

        Conta conta1 = new Conta("1234", "1020-3", cliente1);
        Conta conta2 = new Conta("4321", "6050-4", cliente2);

        System.out.println("***********************************************************");
        System.out.println("dados do cliente 1");
        System.out.println("nome cliente: " + cliente1.getNome());
        System.out.println("cpf cliente: " + cliente1.getCpf());
        System.out.println("telefone cliente: " + cliente1.getTelefone());
        System.out.println("endereço cliente: " + cliente1.getEndereco());
        System.out.println("*************************************************************");
        System.out.println("dados do cliente 2");
        System.out.println("nome cliente: " + cliente2.getNome());
        System.out.println("cpf cliente: " + cliente2.getCpf());
        System.out.println("telefone cliente: " + cliente2.getTelefone());
        System.out.println("endereço cliente: " + cliente2.getEndereco());

        System.out.println("***********************************************************");
        System.out.println("dados da conta 1");
        System.out.println("numero da conta: " + conta1.getNumeroConta());
        System.out.println("numero da agencia: " + conta1.getAgencia());
        System.out.println("saldo: " + conta1.getSaldo());
        System.out.println("nome do cliente: " + conta1.getCliente().getNome());
        System.out.println("***********************************************************");
        System.out.println("dados da conta 2");
        System.out.println("numero da conta: " + conta2.getNumeroConta());
        System.out.println("numero da agencia: " + conta2.getAgencia());
        System.out.println("saldo: " + conta2.getSaldo());
        System.out.println("nome do cliente: " + conta2.getCliente().getNome());

        System.out.println("***********************************************************");
        System.out.println("Saldo atual conta 1: " + conta1.getSaldo());
        Conta.depositar(conta1, 1500.00);
        System.out.println("Saldo após deposito: " + conta1.getSaldo());

        System.out.println("***********************************************************");
        System.out.println("Saldo atual conta 2: " + conta2.getSaldo());
        Conta.depositar(conta2,1000.00);
        System.out.println("Saldo após deposito: " + conta2.getSaldo());

        System.out.println("***********************************************************");
        System.out.println("Saldo atual conta 1: " + conta1.getSaldo());
        Conta.sacar(conta1,500.00);
        System.out.println("Saldo após saque: " + conta1.getSaldo());

        System.out.println("***********************************************************");
        System.out.println("Saldo atual conta 2: " + conta2.getSaldo());
        Conta.sacar(conta2,250.00);
        System.out.println("Saldo após saque: " + conta2.getSaldo());

        System.out.println("***********************************************************");
        System.out.println("Saldo atual conta 1: " + conta1.getSaldo());
        Conta.tranferir(conta1, conta2,10.00);
        System.out.println("Saldo após transferencia: " + conta1.getSaldo());

        System.out.println("***********************************************************");
        System.out.println("Saldo atual conta 2: " + conta2.getSaldo());
        Conta.tranferir(conta2 ,conta1, 20.00);
        System.out.println("Saldo após transferencia: " + conta2.getSaldo());
    }
}
