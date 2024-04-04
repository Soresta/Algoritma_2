package TemelIlkeler;

public class Instruactor {
    private String name;
    private String surname;
    private String deparment;

    public Instruactor(String name, String surname, String deparment) {
        this.name = name;
        this.surname = surname;
        this.deparment = deparment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }
}
