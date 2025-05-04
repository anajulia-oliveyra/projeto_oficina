package funcionario;

import java.time.LocalDate;
import java.time.LocalTime;

public class ControlePonto {
    private String nome;
    private int id;
    private String cpf;
    private LocalDate data;
    private LocalTime hora;
    
    public ControlePonto(String nome, int id, String cpf){
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

