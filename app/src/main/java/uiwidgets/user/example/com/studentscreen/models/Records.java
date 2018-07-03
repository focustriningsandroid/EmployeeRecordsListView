package uiwidgets.user.example.com.studentscreen.models;

public class Records {


    private int id;
    private Employee employee;
    private Company comany;
    private Category category;

    public Records(Employee employee, Category category, Company company, int id) {
        setId(id);
        setEmployee(employee);
        setCategory(category);
        setComany(company);
    }



    public Company getComany() {
        return comany;
    }

    public void setComany(Company comany) {
        this.comany = comany;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
