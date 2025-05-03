package cliente;

import Agenda.Agenda;
import java.util.Arrays;

public class ClienteView{
    public static void main(String[] args){
        
        Agenda agen = new Agenda(
                Arrays.asList("08:00", "10:00", "14:00"),
                Arrays.asList("15/06", "22/06", "02/07")
        );
        
        Cliente clie = new Cliente("Carla", "Rua carvalho", "3898870-7070", "carla@gmail.com", "123.987.456-99", agen);
        
        clie.consultarStatusVeiculo();
        clie.realizarPagamento(true);
    }
}
