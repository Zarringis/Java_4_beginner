package zarringis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вашу фамилию: ");
        String surname = in.nextLine();
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.print("Введите ваш вес (кг): ");
        int weight = in.nextInt();
        System.out.print("Введите ваш рост (м): ");
        double height = in.nextDouble();
        double bmi = weight/(height*height);
        System.out.printf("%s %s, ваш индекс массы тела равен: %.2f кг/м^2\n", surname, name, bmi);
        in.close();

    }
}
