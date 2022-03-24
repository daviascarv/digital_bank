package Digital_bank.Program;
import Digital_bank.Account.Conta;
import Digital_bank.Account.ContaCorrente;
import Digital_bank.Account.ContaPoupança;
public class Program {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupança();

        cc.transferir(100, cp);

        cc.imprimirExtrato();
    }
}
