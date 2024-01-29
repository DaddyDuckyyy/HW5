import java.util.Scanner;

public class OS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите вашу ОС: 0 - iOS, 1 - Android");
        int clientOS = in.nextInt();
        System.out.println("Укажите год вашей ОС");
        int clientDeviceYear = in.nextInt();
        if (clientOS == 0) {
            if (clientDeviceYear<=2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear<=2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        in.close();
    }
}
