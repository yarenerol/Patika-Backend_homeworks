package Week2;

import java.util.Scanner;

public class PasswordControl {
    public static void main(String[] args) {

        // Öncelikle kullanıcıdan bir şifre girişi isteyelim.

        Scanner input = new Scanner(System.in);
        System.out.print("Şifrenizi giriniz: ");
        String password = input.nextLine();

        // Şimdi kontrol edilecek koşulları boolean'lara atayalım.


            boolean isPasswordLengt = password.length() >= 8;
            boolean isThereSpace = (password.contains(" "));
            boolean isFirstCharUpperCase = (Character.isUpperCase(password.charAt(0)));
            boolean isLastCharSymbol = (password.endsWith("?"));

        // Atadığımız boolean değerleri if döngüsüyle kontrol edelim.

        if (!isPasswordLengt){
            System.out.println("Şifre geçersiz!");
        } else if (isThereSpace) {
            System.out.println("Şifre geçersiz!");
        } else if (!isFirstCharUpperCase) {
            System.out.println("Şifre geçersiz!");
        } else if (!isLastCharSymbol) {
            System.out.println("Şifre geçersiz!");
        }else {
            System.out.println("Şifre geçerli!");
        }

        input.close();
    }
}
