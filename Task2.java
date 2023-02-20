import java.util.ArrayList;

// Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (int i = 2; i < 1001; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if (count==0){
                myList.add(i);  
            }   
        }
        System.out.println(myList);
    }   
}
