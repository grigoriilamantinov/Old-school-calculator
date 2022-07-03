import java.util.Scanner;

public class App {
    public static void main(String[] args) {
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
                formatter.columnViewPlus(a, b, Calculator.add(a, b));
                break;
            case "-":
                formatter.getColumnViewMinus(a, b, Calculator.sub(a, b));
                break;
            case "/":
                formatter.columnViewDiv(a, b, Calculator.div(a, b));
                break;
            default:
                System.out.println("Такое действие совершить нельзя");
                break;
        }
    }
}
