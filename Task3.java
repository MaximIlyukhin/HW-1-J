import java.util.Scanner;

// Реализовать простой калькулятор 
// Введите число 2 
// Введите операцию 1 + 2 - 3 * 4  
// Введите число 2 + 2 = 4

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        double number1 = sc.nextDouble();

        System.out.print("Введите знак(*,/,+,-):");
        String sign = sc.next();

        System.out.print("Введите число:");
        double number2 = sc.nextDouble();
        sc.close();

        switch (sign) {
            case "*":
                System.out.printf("%.2f * %.2f = %.2f", number1, number2, number1 * number2);
                break;
            case "/":
                if (number2 == 0)
                    System.out.println("На ноль делить нельзя!");
                else
                    System.out.printf("%.2f / %.2f = %.2f", number1, number2, number1 / number2);
                break;
            case "+":
                System.out.printf("%.2f + %.2f = %.2f", number1, number2, number1 + number2);
                break;
            case "-":
                System.out.printf("%.2f - %.2f = %.2f", number1, number2, number1 - number2);
                break;
        }

    }
}
