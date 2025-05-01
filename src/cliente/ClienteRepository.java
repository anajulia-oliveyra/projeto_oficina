
package cliente;

import java.util.ArrayList;
import java.util.List;

    public class ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();
    
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public List<Cliente> listarClientes(){
        return clientes;
    }
    
    public Cliente buscarClientePorNome(String nome){
        for (Cliente cliente : clientes){
            if (cliente.getNome().equalsIgnoreCase(nome)){
                return cliente;
            }
        }
        return null;
    }
}
