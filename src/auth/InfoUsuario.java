package auth;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class InfoUsuario {

    private static final String CAMINHO = "usuarios.json";

    public static void adicionarUsuario(String nome, String email, String senha, String cargo) {
        try {
            JSONArray usuarios = lerUsuarios();

            JSONObject novoUsuario = new JSONObject();
            novoUsuario.put("nome", nome);
            novoUsuario.put("email", email);
            novoUsuario.put("senha", senha);
            novoUsuario.put("cargo", cargo);

            usuarios.put(novoUsuario);
            salvarUsuarios(usuarios);

            System.out.println("Usuário adicionado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void excluirUsuario(String email) {
        try {
            JSONArray usuarios = lerUsuarios();
            JSONArray novosUsuarios = new JSONArray();

            boolean encontrado = false;
            for (int i = 0; i < usuarios.length(); i++) {
                JSONObject usuario = usuarios.getJSONObject(i);
                if (!usuario.getString("email").equalsIgnoreCase(email)) {
                    novosUsuarios.put(usuario);
                } else {
                    encontrado = true;
                }
            }

            if (encontrado) {
                salvarUsuarios(novosUsuarios);
                System.out.println("Usuário removido com sucesso.");
            } else {
                System.out.println("Usuário não encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void editarUsuario(String email, String novoNome, String novaSenha, String novoCargo) {
        try {
            JSONArray usuarios = lerUsuarios();
            boolean encontrado = false;

            for (int i = 0; i < usuarios.length(); i++) {
                JSONObject usuario = usuarios.getJSONObject(i);
                if (usuario.getString("email").equalsIgnoreCase(email)) {
                    usuario.put("nome", novoNome);
                    usuario.put("senha", novaSenha);
                    usuario.put("cargo", novoCargo);
                    encontrado = true;
                    break;
                }
            }

            if (encontrado) {
                salvarUsuarios(usuarios);
                System.out.println("Usuário editado com sucesso.");
            } else {
                System.out.println("Usuário não encontrado.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static JSONArray lerUsuarios() throws Exception {
        if (!Files.exists(Paths.get(CAMINHO))) {
            return new JSONArray();
        }

        String conteudo = new String(Files.readAllBytes(Paths.get(CAMINHO)));
        if (conteudo.isEmpty()) return new JSONArray();
        return new JSONArray(conteudo);
    }

    private static void salvarUsuarios(JSONArray usuarios) throws Exception {
        Files.write(Paths.get(CAMINHO), usuarios.toString(4).getBytes());
    }
}
