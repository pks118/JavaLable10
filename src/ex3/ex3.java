package ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Четырехугольник ======");
        System.out.print("Введите ширину четырехугольника: ");
        double width = sc.nextDouble();
        System.out.print("Введите высоту четырехугольника: ");
        double height = sc.nextDouble();
        System.out.print("Введите сторону a четырехугольника: ");
        double a = sc.nextDouble();
        System.out.print("Введите сторону b четырехугольника: ");
        double b = sc.nextDouble();
        Chetirehugolnyk pr1 = Chetirehugolnyk.toChetirehugolnykOrNull(width, height, a, b);
        sc.nextLine();
        if (pr1 != null) {
            pr1.show();
        } else {
            System.out.println("Прямоугольника не существует!");
        }

    }
}

