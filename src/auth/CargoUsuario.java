
package auth;

/**
 *
 * @author Ana Carolina e Ana Júlia
 */
public enum CargoUsuario {
    ADMINISTRADOR,
    ATENDENTE,
    MECANICO;
    
    public static CargoUsuario fromString(String s){
        return CargoUsuario.valueOf(s.toUpperCase());
    }
}