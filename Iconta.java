package Digital_bank;

import Digital_bank.Account.Conta;

public interface Iconta{
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);
    
}
