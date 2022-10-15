import java.util.Scanner;

public class homework2 {
   /*For30 Дано целое число N (> 1) и две вещественные точки на числовой оси:
    A, B (A < B). Отрезок [A, B] разбит на N равных отрезков. Вывести H —
    длину каждого отрезка, а также значения функции F(X ) = 1 − sin(X ) в
    точках, разбивающих отрезок [A, B]:
    F(A), F(A + H), F(A + 2·H), . . . , F(B).*/
    public static void main(String[] args) {
        System.out.println("Введите значения А и значение В (A<B)");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Введите число (n- колличество равных отрезков(n>1))");
        int n = scanner.nextInt();
        double h = (b-a)/n;
        System.out.printf("Длина каждого отрезка = %f", h);
        for (int  i = 0 ; i<=n; i++){
          double x = a + h*i;
         double f = 1 - Math.sin(x);
            System.out.printf("F(%f)=%f %n", x, f);}





    }
}
