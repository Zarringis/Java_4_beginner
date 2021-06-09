package zarringis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое число №1: ");
        int num1 = in.nextInt();
        System.out.print("Введите любое целое число №2: ");
        int num2 = in.nextInt();
        System.out.print("Введите любое целое число №3: ");
        int num3 = in.nextInt();
        int arithSum = num1+num2+num3;
        double arithAverage = arithSum / 3.0;
        System.out.printf("Ваше среднее арифметическое число равно: %.2f \n", arithAverage);
        System.out.printf("Ваша сумма всех трех чисел равна: %d", arithSum);
        in.close();


    }
}
