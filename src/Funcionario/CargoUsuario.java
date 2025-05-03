package auth;

public enum CargoUsuario {
    ADMINISTRADOR,
    ATENDENTE,
    MECANICO;
    
    public static CargoUsuario fromString(String s){
        return CargoUsuario.valueOf(s.toUpperCase());
    }
}