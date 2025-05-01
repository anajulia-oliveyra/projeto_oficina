
package cliente;


public class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    private Cliente dono;
    
    public Veiculo(String placa, String modelo, String marca, int ano, String cor, Cliente dono){
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.dono = dono;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }
    
    
    @Override
    public String toString(){
        return "Veiculo{ " +
                "Placa = '" + placa + '\'' +
                ", Modelo = '" + modelo + '\'' +
                ", Marca = '" + marca + '\'' +
                ", Ano = '" + ano + '\'' +
                ", Cor = '" + cor + '\'' +
                ", Dono = '" + dono.getNome() +'\'' +
                '}';
    }
    
}
