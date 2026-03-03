package ex1;

class Treygolnik extends Figure {
    double a2;
    double a3;
    String style;

    double area() {
        return width * height / 2;
    }

    void show1() {
        System.out.println("Фигура треугольник. Тип " + style + "\nШирина (первая сторона) и высота " + width + " и " + height);
    }

    double perimetr() {
        return width+a2+a3;
    }
}