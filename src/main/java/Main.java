import model.Cliente;
import service.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente alexsander = new Cliente();
        alexsander.setNome("Alexsander");

        Conta cc = new ContaCorrente(alexsander);
        Conta poupanca = new ContaPoupanca(alexsander);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

