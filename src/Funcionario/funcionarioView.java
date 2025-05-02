package Funcionario;

import Agenda.agenda;
import java.util.Arrays;

public class funcionarioView {
    public static void main(String[]args){
        
        funcionarioController controller = new funcionarioController();
        
        agenda age = new agenda(
                Arrays.asList("08:00", "10:00", "14:00"),
                Arrays.asList("15/06", "22/06", "02/07")
        );
        
        Funcionario f1 = new Administrador(01, "Ana", "Administradora", "123.456.789-00", age);
        Funcionario f2 = new Mecanico(02, " Veloso", "Mecanico", "987.654.321-11", age);
        Funcionario f3 = new Atendente(03, "Julia", "Atendente", "321.456.987-99", age);
        
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