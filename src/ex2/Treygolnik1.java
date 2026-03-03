package ex2;

class Treygolnik1 extends Figure1 {
    protected double storona3;

    double area() {
        return width * height / 2;
    }

    double perimetr() {
        return width + height + storona3;
    }

    void show1() {
        System.out.println("Стороны треугольника: " + width + ", " + height + ", " + storona3);
    }
}
