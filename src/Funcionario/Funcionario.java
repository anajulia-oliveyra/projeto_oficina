package Funcionario;

import org.json.JSONObject;
        
        
public class Funcionario {
    private String nome;
    private String CPF;
    private String cargo;
    private CargoUsuario tipoUsuario;
    
    public Funcionario(String nome, String CPF, String cargo, CargoUsuario tipoUsuario){
        this.nome = nome;
        this.CPF = CPF;
        this.cargo = cargo;
        this.tipoUsuario = tipoUsuario;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public CargoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(CargoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    @Override
    public String toString(){
        return "Funcionario {" +
                "Nome = '" + nome + '\'' +
                ", CPF = '" + CPF + '\'' +
                ", Cargo = '" + cargo +
                '}';
    }
}

