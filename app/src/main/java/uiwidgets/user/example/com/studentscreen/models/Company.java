package uiwidgets.user.example.com.studentscreen.models;

import android.graphics.drawable.Drawable;

public class Company {

    private Drawable logo;
    private String name;


    private String address;

    public Company(Drawable logo, String name, String address) {
        this.logo = logo;
        this.name = name;
        this.address = address;
    }

    public Drawable getLogo() {
        return logo;
    }

    public void setLogo(Drawable logo) {
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
