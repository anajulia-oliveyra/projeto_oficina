package auth;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Login {
    private List<Usuario> usuarios;

    public Login(String caminhoJson) {
        usuarios = new ArrayList<>();
        try (InputStream is = new FileInputStream(caminhoJson)) {
            JSONTokener tokener = new JSONTokener(is);
            JSONArray array = new JSONArray(tokener);

            for (int i = 0; i < array.length(); i++) {
                JSONObject obj = array.getJSONObject(i);
                String nome = obj.getString("nome");
                String login = obj.getString("login");
                String senha = obj.getString("senha");
                CargoUsuario cargo = CargoUsuario.valueOf(obj.getString("cargo").toUpperCase());

                usuarios.add(new Usuario(nome, login, senha, cargo));
            }
        } catch (Exception e) {
            System.out.println("Erro ao carregar usuários: " + e.getMessage());
        }
    }

    public Usuario autenticar(String login, String senha) {
        for (Usuario u : usuarios) {
            if (u.getLogin().equals(login) && u.getSenha().equals(senha)) {
                return u;
            }
        }
        return null;
    }
}
