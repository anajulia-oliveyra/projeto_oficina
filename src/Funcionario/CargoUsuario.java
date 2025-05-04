package funcionario;

public enum CargoUsuario {
    ADMINISTRADOR,
    COLABORADOR,
    MECANICO;
    
    public static CargoUsuario fromString(String s){
        return CargoUsuario.valueOf(s.toUpperCase());
    }
}