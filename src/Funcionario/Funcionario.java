package Funcionario;        

import Agenda.Agenda;

public class Funcionario {
    private int id;
    private String nome;
    private String CPF;
    private String cargo;
    private Agenda.Agenda agenda;
    private ControlePontos controlePontos;
    
    public Funcionario(int id, String nome, String CPF, String cargo, Agenda agenda){
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.cargo = cargo;
        this.agenda = agenda;
        this.controlePontos = new ControlePontos(nome, id, CPF);
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

   public void getcargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ControlePontos getControlePontos() {
        return controlePontos;
    }
    
    
    
    public void acessarAgenda(){
        System.out.println(getNome() + " acessando agenda");
    }
    
    public void realizarAgendamento(){
        System.out.println(getNome() + " realizando agendamento");
    }
    
    public void baterPonto(){
        controlePontos.baterPonto();
    }
    
    @Override
    public String toString(){
        return "Funcionario: " + nome +
                "\nCargo: " + cargo +
                "\nCPF: " + CPF +
                "\nID: " + id;
    }
}

