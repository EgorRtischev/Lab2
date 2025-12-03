import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;
public class laba2_zadanie4 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args){
        // Вводим n с клавиатуры
        int n = in.nextInt();
        // Создаём переменную current_number для хранения текущего числа и 
        //               вспомогательный boolean flag
        int current_number = 0;
        boolean flag = false;
        // Создаём HashMap, в качестве ключей которого будут значения элементов последовательности,
        //                 а в качестве value количество элементов с таким же значением
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i = 0; i < n; i++){
            current_number = in.nextInt();
            if (!numbers.containsKey(current_number)){
                numbers.put(current_number, 1);
            }
            else{
                numbers.replace(current_number, numbers.get(current_number) + 1);
            }
        }
        for (int value = 10; value <= 100; value++){
            if (numbers.containsKey(value)){
                if (numbers.get(value) == value){
                    flag = true;
                    out.print(value + " ");
                }
            }
        }
        if (!flag){
            out.print("NO");
        }
    }
}