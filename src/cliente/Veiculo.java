
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

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public Cliente getDono() {
        return dono;
    }
    
    

    public void obterDetalhes(){
        System.out.println("Veiculo de " + dono.getNome() + ":");
        System.out.println(marca + " " + modelo + " - " + cor + " - " + ano + " - Placa" + placa);
    }
    
}
