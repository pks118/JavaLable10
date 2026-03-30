package ex3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Прямоугольник ======");
        System.out.print("Введите ширину прямоугольника: ");
        double width = sc.nextDouble();
        System.out.print("Введите высоту прямоугольника: ");
        double height = sc.nextDouble();
        System.out.print("Введите тип прямоугольника:");
        String style = sc.nextLine();
        Pryamoygolnik pr1 = Pryamoygolnik.toPryamoygolnikOrNull(width, height, style);
        sc.nextLine();
        if (pr1 != null) {
            pr1.show();
        } else {
            System.out.println("Прямоугольника не существует!");
        }

    }
}

