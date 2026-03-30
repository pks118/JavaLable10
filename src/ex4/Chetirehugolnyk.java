package ex4;

import java.util.Scanner;

class Chetirehugolnyk extends Figure {
    private String style;
    private double stor3, stor4;
    private Scanner sc = new Scanner(System.in);

    Chetirehugolnyk(double w, double h, double a, double b) {
        super(w, h);
        stor3 = a;
        stor4 = b;
        style = type();
    }
    String type() {
        if (width==height && width== stor3 && width== stor4)
            return "Квадрат";
        else if (width == height &&
                width != stor3 &&
                width != stor4 &&
                stor3 != stor4 || width == stor3 &&
                width != height &&
                width != stor4 &&
                height != stor3 &&
                height != stor4 &&
                stor3 != stor4 || stor3 == stor4 &&
                stor3 != width &&
                stor3 != height &&
                width != height &&
                width != stor4 &&
                stor4 != height)
            return "Трапеция";
        else if (width==height && stor3 == stor4 || width== stor3 && height== stor4
                || width== stor4 && height== stor3) {
            return "Прямоугольник";
        }
        else {
            return "Произвольный четырёхугольник";
        }
    }

    double perimetr() {
        return width + height + stor3 + stor4;
    }
    double area() {
        double p = perimetr();
        return Math.sqrt(((p-width)*(p-height)*(p- stor3)*(p- stor4)));
    }
    void show() {
        System.out.println("Четырёхугольник - " + style + ". Ширина и высота - " + width + " и " + height + ". Площадь прямоугольника " +area() + ". Периметр " +perimetr());
    }
}
