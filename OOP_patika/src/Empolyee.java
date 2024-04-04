class Empolyee {
    //nitelikler
    String name;
    double salary;
    int workHours;
    int hireYear;

    //yapıcı metot(construactor)
    Empolyee(//paramteres
             String name,
             double salary,
             int workHours,
             int hireYear
    ) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) return (this.salary * 0.03);
        else return 0;
    }

    double bonus() {
        if (this.workHours > 40) return ((this.workHours - 40) * 30);
        else return 0.0;
    }

    double raiseSalary() {
        int year = 2023;
        int artis = 0;
        if (year - this.hireYear < 10) artis += this.salary * 0.05;
        else if (year - this.hireYear > 9 && year - this.hireYear < 20) artis += this.salary * 0.1;
        else artis += this.salary * 0.15;
        return artis;
    }

    void getEmpolyeeInfo() {
        System.out.println("Adı                                           :" + this.name + "\n" +
                "Maaşı                                         :" + this.salary + "\n" +
                "Çalışma Saati                                 :" + this.workHours + "\n" +
                "Başlangıç Yılı                                :" + this.hireYear + "\n" +
                "Vergi                                         :" + +tax() + "\n" +
                "Bonus                                         :" + bonus() + "\n" +
                "Maaş Artışı                                   :" + raiseSalary() + "\n" +
                "Vergi Ve Bonuslar İle Birlikte Maaş           :" + (this.salary - tax() + bonus()) + "\n" +
                "Toplam Maaş                                   :" + ((this.salary - tax() + bonus()) + raiseSalary()) + "\n"
        );
    }

}

class EmpoyeeMain {
    public static void main(String[] args) {
        Empolyee empolyee1 = new Empolyee("Kemal", 2000, 45, 1985);
        empolyee1.getEmpolyeeInfo();
    }
}
