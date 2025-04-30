/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

public class Agendamento {
    private Cliente cliente;
    private Veículo veículo;
    private Funcionario funcionario;
    private LocalDateTime dataHora;
    private String descricaoDoProblema;
    
    public Agendamento(Cliente cliente, Veículo veículo, Funcionario funcionario, LocalDateTime dataHora, String descricaoDoProblema){
        this.cliente = cliente;
        this.veículo = veículo;
        this.funcionario = funcionario;
        this.dataHora = dataHora;
        this.descricaoDoProblema = descricaoDoProblema;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public Veículo getVeículo() {
        return veículo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getDescricaoDoProblema() {
        return descricaoDoProblema;
    }
    
    public String toString(){
        return "Agendamento {" +
                "Cliente = " + cliente.getNome() +
                ", Veículo = " + veículo.getModelo() +
                ", Funcionario = " + funcionario.getNome() +
                ", DataHora = " + dataHora +
                ", Problema = " + descricaoDoProblema + '\'' +
                '}';
    }
}
