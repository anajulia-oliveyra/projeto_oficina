package Funcionario;

import java.time.LocalDate;
import java.time.LocalTime;

public class ControlePontos {
    private String nome;
    private String id;
    private String cpf;
    private LocalDate data;
    private LocalTime hora;
    
    public ControlePontos(String nome, String id, String cpf){
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void baterPonto(){
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
        System.out.println("Ponto registrado para " + nome + "(ID: " + id + ")");
        System.out.println("Data: " + data + " | Hora: " + hora);
    }
    
    
    
}
