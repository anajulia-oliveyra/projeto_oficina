package pagamento;

import java.time.LocalDate;

public class Pagamento {
    private int id;
    private double valor;
    private String forma;
    private boolean pago;
    private LocalDate dataPagamento;
    
    public Pagamento(int id, double valor, String forma){
        this.id = id;
        this.valor = valor;
        this.forma = forma;
        this.pago = false;
        this.dataPagamento = null;
    }
    
    public void realizarPagamento(){
        this.pago = true;
        this.dataPagamento = LocalDate.now();
        System.out.println("Pagamento realizado!");
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public String getForma() {
        return forma;
    }

    public boolean isPago() {
        return pago;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    
}
