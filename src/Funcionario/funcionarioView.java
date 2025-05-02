package Funcionario;

public class funcionarioView {
    public static void main(String[]args){
        
        funcionarioController controller = new funcionarioController();
        
        Funcionario f1 = new Administrador(01, "Ana", "Administradora", "123.456.789-00");
        Funcionario f2 = new Mecanico(02, " Veloso", "Mecanico", "987.654.321-11") ;
        Funcionario f3 = new Atendente(03, "Julia", "Atendente", "321.456.987-99");
        
        controller.mostrarDados(f1);
        controller.acessarAgenda(f1);
        controller.executarAcoesExpecificas(f1);
        
        System.out.println("  ");
        
        controller.mostrarDados(f2);
        controller.realizarAgendamneto(f2);
        controller.executarAcoesExpecificas(f2);
        
        System.out.println("   ");
        
        controller.mostrarDados(f3);
        controller.acessarAgenda(f3);
        controller.executarAcoesExpecificas(f3);
    }
}