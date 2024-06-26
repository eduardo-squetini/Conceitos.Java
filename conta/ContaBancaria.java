package conta;

public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    //getters e setters
    public ContaBancaria(){
        this.saldo = 0.0;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    // depositar
    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor
                    + ". Saldo atual R$ " + saldo);
        } else {
            System.out.println("O valor é inválido");
        }
    }

    // sacar

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor +
                    ". Saldo atual R$ " + saldo);
        }

    }
}
