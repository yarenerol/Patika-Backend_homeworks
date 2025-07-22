package Week1;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {

        // Öncelikle bir matris oluşturalım.

        Scanner satirSayisi = new Scanner(System.in);

        int[][] matrix = new int[2][3];

        // Şimdi satır satır gezerek kullanıcıdan matrisi doldurmasını isteyelim.

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println((i + 1) + ". satır " + (j + 1) + ". sütunu giriniz: ");
                matrix[i][j] = satirSayisi.nextInt();
            }

            // Şimdi de doldurulan matrisi bastıralım.
        }
        System.out.println("matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
        
        // Şimdi bir de transpozunu bastıralım. Bunun için i ve j yer değiştirmeli.

        System.out.println("transpoze:");
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%3d", matrix[j][i]);
            }
            System.out.println();
        }
    }
}
