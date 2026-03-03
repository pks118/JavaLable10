package ex1;
import java.util.Scanner;
public class Lab10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Treygolnik tr1 = new Treygolnik();
        Treygolnik tr2 = new Treygolnik();

        System.out.println("Введите ширину треугольника №1 ");
        tr1.width = sc.nextDouble();
        System.out.println("Введите высоту треугольника ");
        tr1.height = sc.nextDouble();
        sc.nextLine();
        System.out.println("Введите тип треугольника ");
        tr1.style = sc.nextLine();
        System.out.println("Введите другие стороны треугольника, чтобы посчитать периметр (ширина - первая сторона): a2, a3 ");
        tr1.a2 = sc.nextDouble();
        tr1.a3 = sc.nextDouble();

        System.out.println("Описание треугольника №1: ");
        tr1.show1();
        System.out.println("Площадь треугольника = " + tr1.area() + ". Периметр треугольника = " + tr1.perimetr());

        System.out.println();

        Kryg kr1 = new Kryg();
        System.out.println("Введите диаметр круга ");
        kr1.setDiametr(sc.nextDouble());
        sc.nextLine();
        System.out.println("Описание круга: ");
        kr1.show1();
        System.out.println("Площадь круга = " + kr1.area() + ". Периметр круга = " + kr1.perimetr());

        System.out.println();

        Pryamoygolnik pr1 = new Pryamoygolnik();
        System.out.println("Введите ширину прямоугольника ");
        pr1.width = sc.nextDouble();
        System.out.println("Введите высоту прямоугольника ");
        pr1.height = sc.nextDouble();
        sc.nextLine();

        pr1.show1();
        System.out.println("Площадь прямоугольника = " + pr1.area() + ".Периметр прямоугольника = " + pr1.perimetr());
    }
}
