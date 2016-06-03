import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.IOException;

public class Program {

    public static Object RunMainCode;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static final String vkIds = "kempelbr";
    public static final String token = "e4767bbe2c5f07c3e00368ae60c9be8a0df59b6368db256182facd0f70247d930fbbb509eef718a8bda13";
    public static final String acstoken = "&access_token=";
    public static Gson data = new GsonBuilder().create();

    public static void main(String[]args)throws IOException{

        //System.out.println("Please write id users:");

        //vkIds = reader.readLine();

        ExTryCacth();

        String json = "{\"response\":[{\"id\":344557113,\"first_name\":\"Стас\",\"last_name\":\"Лис\"," +
                "\"sex\":2,\"bdate\":\"27.8.1917\"," +
                "\"city\":{\"id\":49,\"title\":\"Екатеринбург\"}," +
                "\"country\":{\"id\":1,\"title\":\"Россия\"},\"online\":1}" +
                "]}";

        //RootObject response = data.fromJson(json, RootObject.class);

        //RootObject object = new RootObject();
    }

    public static void setRunMainCode(Object runMainCode) {
        RunMainCode = runMainCode;
    }

    public static Object getRunMainCode() throws Exception{
        //setRunMainCode(vkIds);

        InputStreamReader inReader = new InputStreamReader(
                new URL("https://api.vk.com/method/users.get?user_ids=" + vkIds + "&fields=bdate,online,sex,country,city," +
                        "status&v=5.50")
                        .openStream());
        RootObject cust6 = data.fromJson(inReader, RootObject.class);

        //System.out.println(cust6.getResponse());

        for (Response search : cust6.response) {

            //System.out.println("Information about users => [VK.COM SERVICE]:");
            System.out.println("Id: " + search.getId());
            System.out.println("Hidden: " + search.getHidden());
            System.out.println("Status: " + search.getStatus());
            System.out.println("First Name: "  + search.getFirst_name());
            System.out.println("Last Name: " + search.getLast_name());
            System.out.println("Birthday: " + search.getBdate());
            System.out.println("Online: " + search.getOnline());
            System.out.println("Online mobile: " + search.getOnline_mobile());
            System.out.println("Online app: " + search.getOnline_app());
            System.out.println("Sex: " + search.getSex());
            System.out.println("Country: " + search.getCountry());
            System.out.println("City: " + search.getCity());
            System.out.println("Counters: " + search.getCounters());

        }
        return RunMainCode;
    }

    static void ExTryCacth(){
        try {
            getRunMainCode();

        }catch (Exception error){
           System.out.println("Error: => " +  error.getMessage());
        }
    }


}
