package Digital_bank.Account;

public class ContaPoupança extends Conta{
    private int agencia;
    private int conta;
    private double saldo;

    public ContaPoupança(){

    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        
    }
}
