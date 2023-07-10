import model.Cliente;
import service.Conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato service.Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
