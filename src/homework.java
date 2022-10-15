import java.util.Scanner;
/*For35. Дано целое число N (> 2). Последовательность целых чисел AK опре-
деляется следующим образом:
A1 = 1, A2 = 2, A3 = 3,
AK = AK−1 + AK−2 − 2·AK−3, K = 4, 5, . . . .
Вывести элементы A1, A2, . . . , AN .*/
public class homework {
    public static void main(String[] args) {
        System.out.println("Введите целове число n (>2) ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];

        arr[0]= 1;
        arr[1]=2;
        arr[2]=3;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        for (int k=3; k<=n-1; k++)
        { arr[k]=(arr[k-1] + arr[k-2] - 2* arr[k-3]);
            System.out.println(arr[k]);

        }
    }
}
