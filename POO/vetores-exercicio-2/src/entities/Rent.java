package entities;

public class Rent {
    private String email;
    private String name;

    public Rent(){

    }
    public Rent(String name, String email) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return name
                + ", "
                +email;
    }
}
