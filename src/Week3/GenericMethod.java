package Week3;

public class GenericMethod {

    // Öncelikle array yazdıracak generic metodumu tanımlıyorum.

        public static <E> void printArray (E [] arr){

            for (E entry : arr) {
                System.out.println(entry);
            }
        }

        // Şimdi main metodumuzu başlatabilir, bastırılacak arrayleri tanımlayabiliriz.

        public static void main(String[] args) {

            // İlk array'imiz String olsun.

            String[] strArray = {"Yaren", "Buse", "Ceren", "Ayça", "Ezgi", "İrem", "Aleyna", "Bilge"};

            //Diğer array'imiz ise Double olsun.

            Double[] doubleArray = {2.5, 6.7, 1.9, 4.3, 3.8};


            printArray(strArray);

            System.out.println("\n");
            printArray(doubleArray);
        }
    }
