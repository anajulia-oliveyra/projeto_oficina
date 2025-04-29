
package model;

/**
 *
 * @author Ana Júlia Oliveira e Ana Carolina Pereira
 */
public class Peça {
    private int id;
    private String nome;
    private int quantidade;
    private double preco;
    
    public Peça(int id, String nome, int quantidade, double preco) 
    {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getQuantidade() 
    {
        return quantidade;
    }

    public void setQuantidade(int quantidade) 
    {
        this.quantidade = quantidade;
    }

    public double getPreco() 
    {
        return preco;
    }

    public void setPreco(double preco) 
    {
        this.preco = preco;
    }
    
    @Override
    public String toString() 
    {
        return "Peca{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
