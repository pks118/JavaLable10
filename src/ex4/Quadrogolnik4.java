package ex4;

import java.util.Scanner;

class Quadrogolnik4 extends Figure4 {
    private String style;
    private double storona3, storona4;
    private Scanner sc = new Scanner(System.in);

    Quadrogolnik4(double w, double h, double a, double b) {
        super(w, h);
        storona3 = a;
        storona4 = b;
        style = checkType();
    }
    String checkType() {
        if (width==height && width==storona3 && width==storona4)
            return "Квадрат";
        else if ((width==height && width!=storona3 && width!=storona4 && height!=storona3 && height!=storona4 && storona3!=storona4) ||
                (width==storona3 && width!=height && width!=storona4 && height!=storona3 && height!=storona4 && storona3!=storona4) ||
                (storona3==storona4 && storona3!=width && storona3!=height && width!=height && width!=storona4 && storona4!=height))
            return "Равнобедренная трапеция";
        else if (width==height && storona3==storona4 || width==storona3 && height==storona4
                || width==storona4 && height==storona3) {
            System.out.println("Выберите тип фигуры: \n1. Прямоугольник.\n2. Параллелограмм");
            int vibor = sc.nextInt();
            if (vibor==1) return "Прямоугольник";
            else return "Параллелограмм";
        }
        else {
            System.out.println("Выберите тип фигуры: \n1. Трапеция.\n2. Произвольный четырёхугольник");
            int vibor = sc.nextInt();
            if (vibor==1) return "Трапеция";
            else return "Произвольный четырёхугольник";
        }
    }

    double perimetr() {
        return width + height + storona3 + storona4;
    }
    double area() {
        double p = perimetr();
        return Math.sqrt(((p-width)*(p-height)*(p-storona3)*(p-storona4)));
    }
    void show1() {
        System.out.println("Четырёхугольник - " + style + ". Ширина и высота - " + width + " и " + height + ". Площадь прямоугольника " +area() + ". Периметр " +perimetr());
    }
}
