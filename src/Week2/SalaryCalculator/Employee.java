package Week2.SalaryCalculator;

public class Employee {

    // Yeni bir çalışan tanımlamak için gereken bilgileri yazalım.

    String name;
    int salary;
    int workHours;
    int hireYear;

    // Şimdi bu bilgilerle bir constructor oluşturalım.

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Aşağıda gerekli metotları tanımlayalım.

    // Vergi hesaplama metodu
    public double tax(){
        double tax;
        if (salary < 1000){
            tax = 0;

        } else {
            tax = salary * 0.03;
        }
        return tax;
    }

    // Bonus hesaplama metodu
    public double bonus (){
        int extraHourPrice;
        if (workHours > 40){
            extraHourPrice = (workHours - 40) * 30;

        } else {
            extraHourPrice = 0;
        }
        return extraHourPrice;
    }

    // Maaş artışı hesaplama metodu
    public double raiseSalary (){
        int yearsOfService = 2021 - hireYear;

        double raise = 0;
        if (yearsOfService < 10){
            raise = salary * 0.05;

        } else if (yearsOfService > 9 && yearsOfService <20){
            raise = salary * 0.1;

        } else if (yearsOfService > 19){
            raise = salary * 0.15;

        } return raise;
    }

    // Şimdi de çalışan bilgilerini bastıran bir metot tanımlayalım.
    // toString metodunu java'nın object klasöründen alarak override ediyoruz.

    @Override
    public String toString (){
        double tax = tax();             // Yukarıda tanımdağımız metotların returnlerini bir değişkene atıyorum.
        double bonus = bonus();         // Bu sayede bastırırken daha temiz bir kod olacak.
        double raise = raiseSalary();
        double totalSalary = salary - tax + bonus + raise;
        double salaryWithTaxAndBonus = salary - tax + bonus;

        return "Çalışan adı: " + name + "\n" +
                "Maaş: " + salary + "\n" +
                "Haftalık çalışma saati: " + workHours + "\n" +
                "İşe giriş yılı: " + hireYear + "\n" +
                "Vergi: " + tax + "\n" +
                "Bonus: " + bonus + "\n" +
                "Vergi ve bonuslarla maaş: " + salaryWithTaxAndBonus + "\n" +
                "Toplam maaş: " + totalSalary;
    }
}

