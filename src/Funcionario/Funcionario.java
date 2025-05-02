package Funcionario;        
        
public class Funcionario {
    private int id;
    private String nome;
    private String CPF;
    //private Cargo cargo;
    private CargoUsuario tipoUsuario;
    
    public Funcionario(int id, String nome, String CPF, CargoUsuario tipoUsuario){
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        //this.cargo = cargo;
        this.tipoUsuario = tipoUsuario;
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

   /*/ public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
*/
    public CargoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(CargoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    @Override
    public String toString(){
        return "Funcionario {" +
                "Id = '" + id + '\'' +
                ", Nome = '" + nome + '\'' +
                ", CPF = '" + CPF + '\'' +
                '}';
    }
}

