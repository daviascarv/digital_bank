package Digital_bank.Account;

import Digital_bank.Iconta;

public abstract class Conta implements Iconta{
    private static final int AGENCIA_PADRAO = 1;
    private static final int SEQUENCIAL = 1;
    
    protected int agencia;
    private int conta;
    private double saldo;
    protected int numero;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;        
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;        
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
}
