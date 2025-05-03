package Serviço;

import java.time.LocalDateTime;
import cliente.Cliente;
import cliente.Veiculo;
import Funcionario.Funcionario;        

public class Agendamento {
    private Cliente cliente;
    private Cliente Veiculo;
    private Funcionario Funcionario;
    private String descricaoProblema;
    private LocalDateTime dataHora;
    private String status;
    
    public Agendamento(Cliente cliente, Cliente veiculo, Funcionario funcionario, String descricaoProblema, LocalDateTime dataHora, String status){
        this.cliente = cliente;
        this.Veiculo = veiculo;
        this.Funcionario = funcionario;
        this.descricaoProblema = descricaoProblema;
        this.dataHora = dataHora;
        this.status = "Agendado";
    }
    
    @Override
    public String toString(){
        return "Agendamento: " +
                "\nCliente: " + cliente.getNome() +
                "\nFuncionario: " + Funcionario.getNome() +
                "\nProblema: " + descricaoProblema +
                "\nDataHora: " + dataHora +
                "\nStatus: " + status;
    }
}
