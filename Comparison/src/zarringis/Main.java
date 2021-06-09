package zarringis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        boolean c = (a > 4) || (b < 7);
        boolean d = (a > 4) | (b < 7);
        boolean e = (a > 4) && (b < 7);
        boolean f = (a > 4) & (b < 7);
        boolean g = (a > 4) ^ (b < 7);


        System.out.printf("Условие (a > 4) || (b < 7) равно: %s\n", c);
        System.out.printf("Условие (a > 4) | (b < 7) равно: %s\n", d);
        System.out.printf("Условие (a > 4) && (b < 7) равно: %s\n", e);
        System.out.printf("Условие (a > 4) & (b < 7) равно: %s\n", f);
        System.out.printf("Условие (a > 4) ^ (b < 7) равно: %s\n", g);
        in.close();
    }
}
