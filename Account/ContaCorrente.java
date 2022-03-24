package Digital_bank.Account;

public class ContaCorrente extends Conta{
    
    public void imprimirExtrato(){
        System.out.println("*** Extrato conta corrente ***");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.getSaldo()));
    }
    
}
