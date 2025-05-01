
package funcionario;

/**
 *
 * @author ADM
 */
public class Funcionario {
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

public class Funcionario {
    private String nome;
    private String CPF;
    private String cargo;
    private TipoUsuario tipoUsuario;
    
    public Funcionario(String nome, String CPF, String cargo, TipoUsuario tipoUsuario){
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

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
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

