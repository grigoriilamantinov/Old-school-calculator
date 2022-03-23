import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        FormatterToColumn formatter = new FormatterToColumn();
//        System.out.println("Введите первое число: ");
//        int a = sc.nextInt();
//        System.out.println("Введите второе число: ");
//        int b = sc.nextInt();
        int a = 95418;
        int b = 54;
        String action = "/";
        System.out.println("Введите действие: ");
        switch (action) {
            case "+":
                formatter.columnViewPlus(a, b, calc.calcPlus(a, b));
                break;

            case "-":
                formatter.columnViewMinus(a, b, calc.calcMinus(a, b));
                break;

            case "/":
                formatter.columnViewDiv(a, b, calc.calcDiv(a, b));
                break;
        }
    }
}
