package Week5.Records;

public class Main {

    public static void main(String[] args) {

        // Student record'da oluşturduğumuz haliyle 4 öğrenci tanımlayalım.
        // Son öğrenciyi bilerek daha önce oluşturduğum bir öğrenciyle aynı yapacağım.
        // Bu sayede hashCode ve equals metotlarının doğru çalışıp çalışmadığını göstereceğim.

        Student student1 = new Student("Yaren", "Erol Yılmaz", 5610);
        Student student2 = new Student("Burak", "Yılmaz", 5302);
        Student student3 = new Student("Cantürk", "Güçlü", 5624);
        Student student4 = new Student("Niray", "Aydın", 4746);
        Student student5 = new Student("Yaren", "Erol Yılmaz", 5610);

        // Şimdi sırayla öğrencilerin bilgilerini yazdıralım.

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

        System.out.println("\n");

        // HashCode'larının doğru çalıştığından emin olmak için hashCode'ları yazdıralım.
        // student1 ile student5 aynı bilgilere sahip olduğu için hashCode'ları aynı olmalı.

        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());
        System.out.println(student5.hashCode());

        System.out.println("\n");

        // Şimdi de equals metodunun doğru çalışıp çalışmadığını kontrol edelim.
        // Çok uzatmamak için sadece true ve false geleceğini bildiğim iki ayrı değeri bastıracağım.

        System.out.println("student1 equals student2: " + student1.equals(student2));
        System.out.println("student1 equals student5: " + student1.equals(student5));
    }
}
