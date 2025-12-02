class Figura {
    double width;
    double height;

    void setDiametr(double d){
        width = d;
        height = d;
    }
    void show1() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}

class Tryugol extends Figura {
    String style;

    double area() {
        return width * height / 2;
    }

    void show2() {
        System.out.println("Треугольник - " + style);
    }
}

class Prymugol extends Figura {
    String style;

    double area() {
        return width * height;
    }

    void show2() {
        System.out.println("Прямоугольник - " + style);
    }
}
class Krug extends Figura {
    String style;

    double area() {
        return width * width * (Math.PI)/8;
    }

    void show2() {
        System.out.println("Круг - " + style);
    }
}

public class Nasled3 {
    public static void main(String[] args) {
        Tryugol tr1 = new Tryugol();


        tr1.width = 4.0;
        tr1.height = 4.0;
        tr1.style = "равнобедренный";

        System.out.println("Описание треугольника 1: ");
        tr1.show1();
        tr1.show2();
        System.out.println("Площадь треугольника = " + tr1.area());

        System.out.println();

        Prymugol pr1 = new Prymugol();
        pr1.width = 8.0;
        pr1.height = 12.0;
        pr1.style = "прямоугольный";

        System.out.println("Описание прямоугольника 1: ");
        pr1.show1();
        pr1.show2();
        System.out.println("Площадь прямоугольника = " + pr1.area());

        System.out.println();

        Krug kr1 = new Krug();
        kr1.setDiametr(8.0);
        kr1.style = "круглый";

        System.out.println("Описание круга 1: ");
        kr1.show1();
        kr1.show2();
        System.out.println("Площадь круга = " + kr1.area());

    }
}