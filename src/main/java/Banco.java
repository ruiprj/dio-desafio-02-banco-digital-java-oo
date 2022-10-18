import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Banco {

    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

    public void listarClientes() {
        System.out.println("========== Clientes ==========");

        String clientes = "";
        for (Cliente cliente : this.clientes) {
            clientes = cliente.getNome() + " | " + clientes;
        }
        clientes = clientes.substring(0, clientes.length() - 3);

        System.out.println(clientes);
    }

}
