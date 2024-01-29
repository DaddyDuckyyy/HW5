import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int monthNumber = in.nextInt();
        switch (monthNumber) {
            case 1, 2, 12 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Неправильный номер");
        }
        in.close();
    }
}
