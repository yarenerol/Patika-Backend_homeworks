package Week5.InnerClasses;

public class Employee {


    // Outer class'ta isim ve soyisim bilgilerini koyalım.
    private String employeeName;
    private String employeeSurname;
    private ContactInfo contact;    // Bu nesne ise ContactInfo inner class'ından geliyor.

    // Constructor;

    public Employee(String employeeName, String employeeSurname, String phoneNumber, String eMail) {
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.contact = new ContactInfo(phoneNumber, eMail);
    }

    // İletişim bilgilerini getirecek bir getter metodu;

    public ContactInfo getContact() {
        return contact;
    }

    //Şimdi de iletişim bilgilerinin yer aldığı inner class'ı oluşturalım.

    public class ContactInfo {

        String phoneNumber;
        String eMail;

        //Constructor;

        public ContactInfo(String phoneNumber, String eMail) {
            this.phoneNumber = phoneNumber;
            this.eMail = eMail;
        }



        // Dış sınıftan çalışan isim soyismi kullanan bastırma metodu tanımlayalım

        public void displayContactInfo () {

            System.out.println("Employee name: " + employeeName + "\n" +
                    "Employee surname: " + employeeSurname + "\n" +
                    "Phone number: " + phoneNumber + "\n" +
                    "e-Mail: " + eMail);
        }
    }


    //Şimdi bir main class oluşturalım.

    public static void main(String[] args) {

        // Kendimiz birkaç kullanıcı oluşturalım.

        Employee employee1 = new Employee("Yaren", "Erol Yılmaz", "5303211914", "yarenerol1@icloud.com");
        Employee employee2 = new Employee("Burak", "Yılmaz", "5414331134", "burakyilmaz017@gmail.com");
        Employee employee3 = new Employee("Ali", "Karaduman", "5435412789", "ali_karaduman@icloud.com");
        Employee employee4 = new Employee("İlke", "Akbay", "5324561328", "ilkkeakkbay@gmail.com");


        // Sıra bastırma işlemine geldi.

        employee1.getContact().displayContactInfo();
        System.out.println("\n");
        employee2.getContact().displayContactInfo();
        System.out.println("\n");
        employee3.getContact().displayContactInfo();
        System.out.println("\n");
        employee4.getContact().displayContactInfo();

    }

}
