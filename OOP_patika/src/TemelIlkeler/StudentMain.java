package TemelIlkeler;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Mustafa","Ahmet","123","Nigde",85);
        Student s2 = new Student("Sorest","Dayya","234","İstanbul",110);
        Student s3 = new Student("NoName","Nawa","243","Ankara",85);
        Instruactor t1 = new Instruactor("Taner","Tuncer","CENG");
        //course has a Instractor (sınıfın bir öğretmeniv ardır) composition - aggretation
        //inheritancae(kaltıım) is a
        Course mat = new Course("MAT101","MAT",t1);
       //Student[] sts = {s1,s2,s3};
       //System.out.println(mat.calcAverage(sts));

        System.out.println(mat.getInstruactor().getName());//composition
    }
}
