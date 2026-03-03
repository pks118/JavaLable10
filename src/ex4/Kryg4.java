package ex4;

class Kryg4 extends Figure4 {
    String style;

    double area() {
        return Math.pow(width, 2) * Math.PI;
    }

    Kryg4(String s, double r) {
        super(r);
        style = s;
    }

    double perimetr() {
        return width * Math.PI;
    }
    void show1() {
        System.out.println("Круг. Радиус круга " + width);
    }
}
