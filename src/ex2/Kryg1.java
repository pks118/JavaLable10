package ex2;

class Kryg1 extends Figure1 {
    String style;

    double area() {
        return Math.pow(width, 2) * Math.PI / 2;
    }

    double perimetr() {
        return width * Math.PI;
    }

    void show1() {
        System.out.println("Круг. Радиус круга - " + width);
    }
}
