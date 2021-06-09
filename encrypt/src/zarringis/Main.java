package zarringis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        long number = in.nextLong();
        System.out.print("Введите ключ для шифрования: ");
        long key = in.nextLong();
        long encrypt = (number ^ key);
        System.out.println("Зашифрованное число: " + encrypt);
        System.out.print("Введите ключ для расшифровки: ");
        long key1 = in.nextLong();
        long decrypt = encrypt ^ key1;
        System.out.print("Расшифрованное число: " + decrypt);

    }
}
