package Funcionario;

import org.json.JSONObject;
        
        
public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private CargoUsuario cargoUsuario;
    
    public Funcionario(){}
    
    public Funcionario (int id, String nome, String cpf, CargoUsuario cargoUsuario){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargoUsuario = cargoUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public CargoUsuario getCargoUsuario() {
        return cargoUsuario;
    }

    public void setCargoUsuario(CargoUsuario cargoUsuario) {
        this.cargoUsuario = cargoUsuario;
    }
    
    
}
