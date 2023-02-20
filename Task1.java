import java.util.Scanner;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
//n! (произведение чисел от 1 до n)

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число n:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int summ = 0;
        int mult = 1;
        for (int i = 1; i <= num; i++) {
            summ += i;
            mult *= i;
        }
        System.out.printf("сумма = %d, произведение = %d", summ, mult);
        sc.close();
    }

}