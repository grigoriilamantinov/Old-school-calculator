import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        FormatterToColumn formatter = new FormatterToColumn();
        System.out.println("Вы ввели первое число: 95418");
        System.out.println("Вы ввели второе число: 54");
        int a = 95418;
        int b = 54;
        System.out.print("Ваше действие: ");
        String action = sc.nextLine();

        switch (action) {
            case "+":
                formatter.columnViewPlus(a, b, calc.addition(a, b));
                break;
            case "-":
                formatter.columnViewMinus(a, b, calc.subtraction(a, b));
                break;
            case "/":
                formatter.columnViewDiv(a, b, calc.division(a, b));
                break;
            default:
                System.out.println("Такое действие совершить нельзя");
                break;
        }
    }
}
