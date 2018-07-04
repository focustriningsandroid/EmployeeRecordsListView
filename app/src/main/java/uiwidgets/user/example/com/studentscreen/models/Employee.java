package uiwidgets.user.example.com.studentscreen.models;

import android.graphics.drawable.Drawable;

public class Employee {


    private Drawable flag;
    private String name;



    private int id;

    public Employee(Drawable flag, String name, int id) {
        this.id = id;
        this.flag = flag;
        this.name = name;
    }

    public Drawable getFlag() {
        return flag;
    }

    public void setFlag(Drawable flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
