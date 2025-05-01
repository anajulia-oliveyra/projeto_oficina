/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auth;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author ADM
 */
public class AdicionarUsuario {
   public static void adicionarUsuario(String nome, String email, String senha, String cargo )
   {
       try
       {
          String caminho = "usuarios.json";
          String conteudo = new String(Files.readAllBytes(Paths.get(caminho)));
          JSONArray usuarios = new JSONArray(conteudo);
          
          JSONObject novoUsuario = new JSONObject();
          novoUsuario.put("nome",nome);
          novoUsuario.put("email",email);
          novoUsuario.put("senha",senha);
          novoUsuario.put("cargo", cargo);
          
          usuarios.put(novoUsuario);
          Files.write(Paths.get(caminho), usuarios.toString(4).getBytes());
          
          System.out.println("Usuário adicionado com sucesso");
          
       }
       catch (Exception e)
       {
           e.printStackTrace();  
       }
   }

}
