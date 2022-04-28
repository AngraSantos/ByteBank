package programa;

public class Conta {

    private String agencia;
    private String numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta(String agencia, String numeroConta, Cliente cliente) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static void depositar(Conta conta, double valorDepositado) {
        conta.setSaldo(conta.getSaldo() + valorDepositado);
    }

    public static void sacar(Conta conta, double valorSacado) {
        conta.setSaldo(conta.getSaldo() - valorSacado);
    }

    public static void tranferir(Conta contaA, Conta contaB, double valorTansferido) {
        contaA.setSaldo(contaA.getSaldo() - valorTansferido);
        contaB.setSaldo(contaB.getSaldo() + valorTansferido);
    }

}
