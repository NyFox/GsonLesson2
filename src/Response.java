
public class Response {
    private String id;

    private String first_name;

    private String sex;

    private String status;

    private String last_name;

    private String bdate;

    private String online;

    private String online_mobile;

    private String online_app;

    private Country country;

    private City city;

    private String hidden;

    private Counters counters;

    public Counters getCounters() {

        return counters;
    }

    public void setCounters(Counters counters) {
        this.counters = counters;
    }

    public String getHidden(){
        return hidden;
    }

    public void setHidden(String hidden){
        this.hidden = hidden;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOnline_app() {
        return online_app;
    }

    public void setOnline_app(String online_app) {
        this.online_app = online_app;
    }

    public String getOnline_mobile() {
        return online_mobile;
    }

    public void setOnline_mobile(String online_mobile) {
        this.online_mobile = online_mobile;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getFirst_name ()
    {
        return first_name;
    }

    public void setFirst_name (String first_name)
    {
        this.first_name = first_name;
    }

    public String getSex ()
    {
        return sex;
    }

    public void setSex (String sex)
    {
        this.sex = sex;
    }

    public String getLast_name ()
    {
        return last_name;
    }

    public void setLast_name (String last_name)
    {
        this.last_name = last_name;
    }

    public String getBdate ()
    {
        return bdate;
    }

    public void setBdate (String bdate)
    {
        this.bdate = bdate;
    }

    public String getOnline ()
    {
        return online;
    }

    public void setOnline (String online)
    {
        this.online = online;
    }

    public Country getCountry ()
    {
        return country;
    }

    public void setCountry (Country country)
    {
        this.country = country;
    }

    public City getCity ()
    {
        return city;
    }

    public void setCity (City city)
    {
        this.city = city;
    }

    ///*
    @Override
    public String toString()
    {
        //return "ClassPojo [id = "+id+", first_name = "+first_name+", last_name = "+last_name+"]";
        return String.format("Id:%s First Name:%s Last Name:%s", getId(), first_name, last_name);
    }
   //*/
}
