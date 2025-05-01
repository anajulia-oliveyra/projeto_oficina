/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import cliente.Cliente;
import cliente.ClienteRepository;

public class ClienteView {

public class main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(
            "Ana Carolina",
            "Rua quatro, 123",
            "(38) 99999-9999",
            "ana@email.com",
            "123.456.789-00"
        );
        
        System.out.println(cliente);
        
        ClienteRepository repositorio = new ClienteRepository();
        
        Cliente cliente1 = new Cliente("Ana Carolina", "Rua for", "(38) 99999-9999", "ana@email.com", "123.456.789-00");
        Cliente cliente2 = new Cliente("Ana Julia", "Rua B", "(38) 98888-8888", "julia@email.com", "987.654.321-00");
        
        repositorio.adicionarCliente(cliente1);
        repositorio.adicionarCliente(cliente2);
        
         for (Cliente c : repositorio.listarClientes()) {
            System.out.println(c);
        }
}
}
}
