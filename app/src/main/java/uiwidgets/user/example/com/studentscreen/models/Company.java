package uiwidgets.user.example.com.studentscreen.models;

public class Company {

    private int logo;
    private String name;


    private String address;

    public Company(int logo, String name) {
        this.logo = logo;
        this.name = name;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
