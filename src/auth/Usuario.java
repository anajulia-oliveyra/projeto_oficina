
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auth;


public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private CargoUsuario cargo;
    
    public Usuario(String nome, String login, String senha, CargoUsuario cargo){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public CargoUsuario getCargo() {
        return cargo;
    }

    public void setCargo(CargoUsuario cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public String toString(){
        return "Usuario{ " +
                "Nome = '" + nome + '\'' +
                ", Login = '" + login + '\'' +
                ", Cargo = '" + cargo +
                '}';
    }
}