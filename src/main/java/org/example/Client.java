package org.example;

public class Client extends User {
    private String codeClient;

    public Client() {
    }

    public Client(String name, String email, String password, int age, double salary, String codeClient) {
        super(name, email, password, age, salary);
        this.codeClient = codeClient;
    }

    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    public void DetailCodeClient (){
        System.out.println("Le Code Client :" + this.codeClient);
    }


}
