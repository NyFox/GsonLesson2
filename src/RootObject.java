import java.util.List;

public class RootObject extends Response{
    public List<Response> response;
    public List<Counters> response2;

    public List<Response> getResponse() {
        /*
        for (Response search: response) {
            System.out.println("Id user: " + search.getId());
            System.out.println("First Name: " + search.getFirst_name());
            System.out.println("Last Name: " + search.getLast_name());
        }
        */
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }
}
