import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        DisplayColumn display = new DisplayColumn();
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        System.out.println("Введите действие: ");
        String action = sc2.nextLine();

        switch (action) {
            case "+":
                display.columnViewPlus(a, b, calc.calcPlus(a, b));
                break;

            case "-":
                display.columnViewMinus(a, b, calc.calcMinus(a, b));
                break;
        }
    }
}
