package cliente;

import Agenda.agenda;

public class Cliente {
    private String nome;
    private String endereço;
    private String telefone;
    private String email;
    private String cpf;
    private Agenda.agenda agenda;
    
    public Cliente(String nome, String endereço, String telefone, String email, String cpf, agenda agenda){
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.agenda = agenda;
    }

    public String getNome() {
        return nome;
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
    
    public void consultarStatusVeiculo(){
        System.out.println(getNome() + " consultando status do veiculo.");
    }
    
    public void realizarPagamento(boolean pago){
        System.out.println(pago ? " Pagamento realizado." : "Pagamento ainda nao realizado");
    }

    @Override
    public String toString(){
        return '{' +
                "Cliente: " + nome +
                "\nEndreço: " + endereço +
                "\nTelefone: " + telefone +
                "\nEmail = " + email +
                "\nCpf: " + getCpfAnonimizado();
}
}

