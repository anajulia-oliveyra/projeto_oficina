package cliente;

public class OrdemdeServiçoView {
    public static void main(String[] args){
        OrdemdeServiço servico = new OrdemdeServiço(1, "Troca de oleo");
        
        servico.gerarOrddemServico();
    }
}
