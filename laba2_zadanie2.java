import java.io.PrintStream;
import java.util.Scanner;
public class laba2_zadanie2 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args){
        // Вводим n с клавиатуры
        int n = in.nextInt();
        // Создаём переменную, в которой будем хранить десятичное значение исходного числа
        int dec_number = 0;
        for (int i = 0; i < n; i++){
            // Переводим каждую цифру троичного числа в десятичную запись и добавляем
            //                это значение в переменную  dec_number
            dec_number += Math.pow(3,i);
        }
        out.print(dec_number);
    }
}