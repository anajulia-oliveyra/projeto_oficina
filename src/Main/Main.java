
package Main;


//import org.json.JSONObject;

//public class Main {
    
//}


import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("nome", "João");
        obj.put("idade", 30);
        obj.put("cliente", true);

        System.out.println(obj.toString(2));
    }
}
