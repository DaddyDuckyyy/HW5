import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите расстояние доставки: ");
        int deliveryDistance = in.nextInt();
        if (deliveryDistance<=100) {
            int days = 1;
            if (deliveryDistance>20){
                days++;
            }
            if (deliveryDistance>60){
                days++;
            }
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
        in.close();
    }
}
