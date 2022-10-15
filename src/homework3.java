import java.util.Scanner;
/*For20◦. Дано целое число N (> 0). Используя один цикл, найти сумму
1! + 2! + 3! + . . . + N!
(выражение N! — N–факториал — обозначает произведение всех целых
чисел от 1 до N: N! = 1·2·. . .·N). Чтобы избежать целочисленного пере-
полнения, проводить вычисления с помощью вещественных переменных
и вывести результат как вещественное число.*/

public class homework3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число n>0");
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        long factorial = 1;
        long sum = 0;
        for (int i=1; i<=n; i++){
            factorial= i* factorial;
            sum = sum + factorial;
        }
        System.out.println(sum);
    }
}
