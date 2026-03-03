package ex3;

import java.util.Scanner;

public class Lab10_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите стороны треугольника: a1,a2,a3 ");
        Treygolnik2 tr1 = new Treygolnik2("Разносторонний" ,sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Описание треугольника №1: ");
        tr1.show1();
        tr1.showTreygolnik();
        System.out.println("Площадь треугольника = " + tr1.area() + ". Периметр треугольника = " + tr1.perimetr());

        System.out.println();
        System.out.println("Введите стороны равнобедренного треугольника: a1,a2 ");
        Treygolnik2 tr2 = new Treygolnik2("Равнобедренный" ,sc.nextDouble(), sc.nextDouble());

        System.out.println("Описание треугольника №2: ");
        tr2.show1();
        tr2.showTreygolnik();
        System.out.println("Площадь треугольника = " + tr2.area() + ". Периметр треугольника = " + tr2.perimetr());

        System.out.println();

        System.out.println("Введите сторону равностороннего треугольника: a ");
        Treygolnik2 tr3 = new Treygolnik2("Равносторонний" ,sc.nextDouble());

        System.out.println("Описание треугольника №3: ");
        tr3.show1();
        tr3.showTreygolnik();
        System.out.println("Площадь треугольника = " + tr3.area() + ". Периметр треугольника = " + tr3.perimetr());

        System.out.println();

        System.out.println("Введите: радиус круга ");
        Kryg2 kr1 = new Kryg2("круглый",sc.nextDouble());
        System.out.println("Описание круга: ");
        kr1.show1();
        System.out.println("Площадь круга = " + kr1.area() + ". Периметр круга = " + kr1.perimetr());

        System.out.println();

        System.out.println("Введите: ширину прямоугольника, высоту прямоугольника");
        Pryamoygolnik2 pr1 = new Pryamoygolnik2("с прямыми углами", sc.nextDouble(), sc.nextDouble());
        pr1.show1();
        System.out.println("Площадь прямоугольника = " + pr1.area() + ".Периметр прямоугольника = " + pr1.perimetr());

    }
}

