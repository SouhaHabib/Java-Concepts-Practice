package org.example;

public class Admin extends User{
    private String codeAdmin;
    double [] tab = new double [3];

    public Admin() {
    }

    public Admin(String name, String email, String password, int age, double salary, String codeAdmin) {
        super(name, email, password, age, salary);
        this.codeAdmin = codeAdmin;
    }

    public String getCodeAdmin() {
        return codeAdmin;
    }

    public void setCodeAdmin(String codeAdmin) {
        this.codeAdmin = codeAdmin;
    }

    public void DetailCodeAdmin (){
        System.out.println("Le Code Admin :" + this.codeAdmin);
    }

}
