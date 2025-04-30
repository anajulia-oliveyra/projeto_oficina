/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

    public class clienteRepository {
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
