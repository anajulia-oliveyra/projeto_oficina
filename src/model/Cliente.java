/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Cliente {
    private String nome;
    private String endereço;
    private String telefone;
    private String email;
    private String cpf;
    
    public Cliente(String nome, String endereço, String telefone, String email, String cpf){
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpfAnonimizado(){
        if (cpf != null){
            String cpfLimpo = cpf.replace(".", "").replace("-", "");
            
            if (cpfLimpo.length() == 11){
                return cpfLimpo.substring(0, 3) + ".***.***-" + cpfLimpo.substring(9);
            }
        }
        return "***";
    }
     
    @Override
    public String toString(){
        return '{' +
                "Cliente{" +
                "Nome = " + nome + '\'' +
                ", Endereco = " + endereço + '\'' +
                ", Telefone = " + telefone + '\'' +
                ", Email = " + email + '\'' +
                ", Cpf = " + getCpfAnonimizado() + '\'' +'}';
}
}

