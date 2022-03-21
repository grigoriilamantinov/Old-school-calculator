import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        DisplayColumn display = new DisplayColumn();
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
//        System.out.println("Ваш ответ: " + calc.calcMinus(a,b));
        display.columnView(a,b,calc.calcMinus(a,b));




    }
}
