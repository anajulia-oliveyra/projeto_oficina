package Agenda;

import java.util.List;
        
public class agenda {
    private List<String> horariosDisponiveis;
    private List<String> datasDisponiveis;
    
    public agenda(List<String> horariosDisponiveis, List<String> datasDisponiveis){
        this.horariosDisponiveis = horariosDisponiveis;
        this.datasDisponiveis = datasDisponiveis;
    }
    
    public void verificarDisponibilidadeElevadores(){
        System.out.println("Horarios disponiveis para o uso de elevadores: ");
        for(String horario : horariosDisponiveis){
            System.out.println("- " + horario);
        }
    }
    
    public void verificarDisponibilidadeMecanicos(){
        System.out.println("Datas disponiveis para atendimento do mecanico: ");
        for(String data : datasDisponiveis){
            System.out.println("- " + data);
        }
    }

    public List<String> getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    public List<String> getDatasDisponiveis() {
        return datasDisponiveis;
    }
    
    
}
