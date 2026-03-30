package ex4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стороны четырёхугольника:");
        Chetirehugolnyk qr1 = new Chetirehugolnyk(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        qr1.show();

        System.out.println();

        System.out.println("Введите радиус круга");
        Kryg kr1 = new Kryg("круг",sc.nextDouble());
        kr1.show();
        System.out.println("Площадь круга " +kr1.area() + ". Окружность " + kr1.perimetr());
        
        System.out.println("Введите 3 стороны треугольника: ");
        Treygolnik tr2 = new Treygolnik(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Описание треугольника1: ");
        tr2.show();
    }
}

