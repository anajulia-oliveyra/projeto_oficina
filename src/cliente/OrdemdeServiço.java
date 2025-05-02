package cliente;

public class OrdemdeServiço {
    private int id;
    private String descricaoProblema;
    
    public OrdemdeServiço(int id, String descrecaoProblema){
        this.id = id;
        this.descricaoProblema = descricaoProblema;
    }
    
    public void gerarOrddemServico(){
        System.out.println("Ordem de servico " + id + " criada: " + descricaoProblema);
    }
}
