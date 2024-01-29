import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = in.nextInt();
        if (year >= 1584) {
            if ((year % 400 == 0) || (year % 4 == 0) || (year % 100 != 0)) {
                System.out.println("Год високосный");
            } else {
                System.out.println("Год невисокосный");
            }
        } else {
            System.out.println("Год невисокосный");
        }
        in.close();
    }
}
