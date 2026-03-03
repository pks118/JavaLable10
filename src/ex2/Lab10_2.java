package ex2;
import java.util.Scanner;

public class Lab10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ravnostoronnyi1 tr1 = new Ravnostoronnyi1();
        Ravnostoronnyi1 tr2 = new Ravnostoronnyi1();

        System.out.println("Введите ширину треугольника №1 ");
        tr1.width = sc.nextDouble();
        System.out.println("Введите высоту треугольника ");
        tr1.height = sc.nextDouble();
        System.out.println("Введите другие стороны треугольника, чтобы посчитать периметр: a2, a3 ");
        tr1.storona3 = sc.nextDouble();

        System.out.println();

        System.out.println("Описание треугольника №1: ");
        tr1.show1();
        System.out.println("Равнобедренный треугольник? - "+tr1.ravnobed());
        System.out.println("Равносторонний треугольник? - "+tr1.ravnostor());
        System.out.println("Площадь треугольника = " + tr1.area() + ". Периметр треугольника = " + tr1.perimetr());

        System.out.println();

        Kryg1 kr1 = new Kryg1();
        System.out.println("Введите диаметр круга ");
        kr1.width = sc.nextDouble();
        sc.nextLine();
        System.out.println("Введите тип круга ");
        kr1.style = sc.nextLine();
        System.out.println("Описание круга: ");
        kr1.show1();
        System.out.println("Площадь круга = " + kr1.area() + ". Периметр круга = " + kr1.perimetr());

        System.out.println();

        Pryamoygolnik1 pr1 = new Pryamoygolnik1();
        System.out.println("Введите ширину прямоугольника ");
        pr1.width = sc.nextDouble();
        System.out.println("Введите высоту прямоугольника ");
        pr1.height = sc.nextDouble();
        sc.nextLine();
        System.out.println("Введите тип прямоугольника ");
        pr1.style = sc.nextLine();

        pr1.show1();
        System.out.println("Площадь прямоугольника = " + pr1.area() + ". Периметр прямоугольника = " + pr1.perimetr());
    }
}