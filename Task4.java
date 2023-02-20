// Задано уравнение вида q + w = e, (q, w, e >= 0). 
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

public class Task4 {
    public static void main(String[] args) {
        String sc = "1? + ?2 = 8?".replace('?', '0');
        String[] arr = sc.toString().split(" ");

        String first = arr[0];
        String second = arr[2];
        String third = arr[4];

        for (int i = 0; i < 9; i++) {
            int firstNumber = Integer.parseInt(first);
            if (firstNumber > 9 && firstNumber % 10 == 0 && firstNumber < 100)
                firstNumber += i;
            else if (firstNumber < 10)
                firstNumber += i * 10;
            for (int j = 0; j < 9; j++) {
                int secondNumber = Integer.parseInt(second);
                if (secondNumber > 9 && secondNumber % 10 == 0 && secondNumber < 100)
                    secondNumber += j;
                else if (secondNumber < 10)
                    secondNumber += j * 10;
                for (int k = 0; k < 9; k++) {
                    int thirdNumber = Integer.parseInt(third);
                    if (thirdNumber > 9 && thirdNumber % 10 == 0 && thirdNumber < 100)
                        thirdNumber += k;
                    else if (thirdNumber < 10)
                        thirdNumber += k * 10;
                    if (firstNumber + secondNumber == thirdNumber)
                        System.out.printf("%s + %s = %s\n", firstNumber, secondNumber, thirdNumber);
                        // break;
                }
            }
        }
    }
}