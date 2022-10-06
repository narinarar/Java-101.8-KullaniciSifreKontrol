import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String username, password, answer, newPassword, checkUsername, checkPassword;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adını belirleyiniz: ");
        username = scanner.nextLine();
        System.out.print("Şifrenizi belirleyiniz: ");
        password = scanner.nextLine();

        System.out.print("Kullanıcı adınız giriniz: ");
        checkUsername = scanner.nextLine();
        System.out.print("Şifrenizi giriniz.");
        checkPassword = scanner.nextLine();

        if (username.equals(checkUsername) && password.equals(checkPassword)) {
            System.out.print("Giriş yaptınız.");
        } else {
            System.out.print("Şifrenizi sıfırlamak ister misiniz. Evet ya da Hayır.");
            answer = scanner.nextLine();
            if (answer.equals("Evet") || answer.equals("evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = scanner.nextLine();
                if (newPassword.equals(password)) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
                    newPassword = scanner.nextLine();
                    System.out.println("Şifreniz başarıyla güncellendi");
                } else {
                    System.out.print("Şifre oluşturuldu.");
                }
            }
        }


    }
}