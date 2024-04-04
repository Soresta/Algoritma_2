package TemelIlkeler;

public class Course {
    private String courseName;
    private String code;
    private Instruactor instruactor;

    public Instruactor getInstruactor() {
        return instruactor;
    }

    public void setInstruactor(Instruactor instruactor) {
        this.instruactor = instruactor;
    }

    Course(String courseName, String code, Instruactor instruactor) {
        this.instruactor = instruactor;
        this.courseName = courseName;
        this.code = code;
    }

    public String getCourseName(String courseName) {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode(String code) {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    //course uses a student(Course sınıfı student sınıfa bağlı)(bağımlılık dependency)
    public double calcAverage(Student[] students){
        double average = 0.0;
        for (int i = 0; i < students.length; i++) {
            average += students[i].getNote();
        }

        return average/students.length;
    }
}
