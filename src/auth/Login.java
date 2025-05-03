
package auth;

/**
 *
 * @author Ana Julia e Ana Carolina
 */
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Login {
    public static JSONObject autenticar(String email, String senha)
    {
        try 
        {
            String conteudo = new String(Files.readAllBytes(Paths.get("usuarios.json")));
            JSONArray usuarios = new JSONArray(conteudo);
            
            for (int i=0; i<usuarios.length(); i++)
            {
            JSONObject u = usuarios.getJSONObject(i);
            if(u.getString("email").equalsIgnoreCase(email) && 
                u.getString("senha").equals(senha)) 
                {
                    return u;
                }

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
        
    }
    
}
