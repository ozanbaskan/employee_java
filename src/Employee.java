public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear)
    {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax()
    {
        if (this.salary < 1000)
        {
            return 0;
        }
        else
        {
            return this.salary * 3.0 / 100.0;
        }
    }

    double bonus()
    {
        if (this.workHours > 40)
        {
            return (this.workHours - 40.0) * 30;
        }
        else
        {
            return 0;
        }

    }

    double raiseSalary()
    {
        int workYear = 2021 - this.hireYear;
        if (workYear < 10)
        {
            return this.salary * 5.0 / 100.0;
        }
        else if (workYear >= 10 && workYear < 20)
        {
            return this.salary * 10.0 / 100.0;
        }
        else if ( workYear >= 20)
        {
            return this.salary * 15.0 / 100.0;
        }
        else
        {
            return 0;
        }

    }


    public void to_string()
    {
        System.out.println("Adı: " + this.name );
        System.out.printf("Maaşı: %.2f\n", this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.printf("Vergi: %.2f\n", this.tax());
        System.out.printf("Bonus: %.2f\n", this.bonus());
        System.out.printf("Maaş artışı: %.2f\n", this.raiseSalary());
        System.out.printf("Vergi ve bonuslar ile birlikte maaş: %.2f\n", this.salary - this.tax() + this.bonus());
        System.out.printf("Toplam maaş: %.2f\n", this.salary - this.tax() + this.bonus() + this.raiseSalary());

    }

}
