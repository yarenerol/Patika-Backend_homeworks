package Week2.SalaryCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner ile kullanıcıdan bilgileri alıyoruz.

        Scanner input = new Scanner(System.in);
            System.out.println("Çalışan adı: ");
            String name = input.nextLine();

            System.out.println("Maaş: ");
            int salary = input.nextInt();

            System.out.println("Haftalık çalışma saati: ");
            int workHours = input.nextInt();

            System.out.println("İşe giriş yılı: ");
            int hireYear = input.nextInt();

            // Aldığımız bilgilerle yeni bir employee oluşturuyoruz.


        Employee employee = new Employee(name, salary, workHours,hireYear);

            // Oluşturduğumuz employee'nin bilgilerini bastırıyoruz.

        System.out.println(employee.toString());
    }
}
