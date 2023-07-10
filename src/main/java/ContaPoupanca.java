import model.Cliente;
import service.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato service.Conta Poupança ===");
        super.imprimirInfosComuns();
    }

}
