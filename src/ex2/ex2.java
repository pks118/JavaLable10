package ex2;
import java.util.Scanner;
public class ex2 {
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

        System.out.println();

        System.out.println("====== Круг ======");
        System.out.print("Введите радиус круга: ");
        width = sc.nextDouble();
        Kryg kr1 = Kryg.toKrygOrNull(width);
        sc.nextLine();
        if (kr1 != null) {
            kr1.show();
        } else {
            System.out.println("Круг не существует!");
        }

        System.out.println();

        System.out.println("====== Треугольник ======");
        System.out.print("Введите сторону 1: ");
        double a = sc.nextDouble();
        System.out.print("Введите сторону 2: ");
        double b = sc.nextDouble();
        System.out.print("Введите сторону 3: ");
        double c = sc.nextDouble();
        System.out.print("Введите тип треугольника:");
        style = sc.nextLine();
        Treygolnik tr1 = Treygolnik.toTreygolnikOrNull(a, b, c,  style);
        sc.nextLine();
        if (tr1 != null) {
            tr1.show();
        } else {
            System.out.println("Круг не существует!");
        }
    }
}
