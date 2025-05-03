
package auth;

/**
 *
 * @author Ana Julia e Ana Carolina
 */
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.InputStream;

public class Login {

    private JSONArray usuarios;

    public Login(String caminhoJson) {
        try (InputStream is = new FileInputStream(caminhoJson)) {
            JSONTokener tokener = new JSONTokener(is);
            usuarios = new JSONArray(tokener);
        } catch (Exception e) {
            System.out.println("Erro ao ler JSON: " + e.getMessage());
            usuarios = new JSONArray(); // evita null pointer
        }
    }

    public JSONObject autenticar(String email, String senha) {
        for (int i = 0; i < usuarios.length(); i++) {
            JSONObject usuario = usuarios.getJSONObject(i);
            if (usuario.getString("email").equals(email) && usuario.getString("senha").equals(senha)) {
                return usuario;
            }
        }
        return null;
    }
}
