package ex4;

import java.util.Scanner;

public class Lab10_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны четырёхугольника: a1, a2, a3, a4");
        Quadrogolnik4 qr1 = new Quadrogolnik4(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        qr1.show1();

        System.out.println();

        System.out.println("Введите радиус круга");
        Kryg4 kr1 = new Kryg4("круглый",sc.nextDouble());
        kr1.show1();
        System.out.println("Площадь круга " +kr1.area() + ". Окружность " + kr1.perimetr());
        
        System.out.println("Введите стороны треугольника: a1,a2,a3 ");
        Treygolnik4 tr2 = new Treygolnik4(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Описание треугольника №1: ");
        tr2.show1();
    }
}

