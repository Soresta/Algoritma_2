package TemelIlkeler;

public class Student {
    private String name;
    private String surName;
    private String id;
    private String adress;
    private int note;

    public Student(String name, String surName, String id, String adress, int note) {
        this.name = name;
        this.surName = surName;
        this.id = id;
        this.adress = adress;
        if (note > 100 || note < 0) {
            note = 0;
        }
        this.note = note;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
