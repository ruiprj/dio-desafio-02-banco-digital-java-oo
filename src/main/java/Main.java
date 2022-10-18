import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente rui = new Cliente();
        rui.setNome("Rui");

        Cliente chapolim = new Cliente();
        chapolim.setNome("Chapolim Colorado");

        List<Cliente> clientes = Arrays.asList(rui, chapolim);
        banco.setClientes(clientes);

        banco.listarClientes();

        Conta cc = new ContaCorrente(rui);
        Conta poupanca = new ContaPoupanca(chapolim);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
