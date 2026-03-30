package ex4;

class Kryg extends Figure {
    String style;

    double area() {
        return Math.pow(width, 2) * Math.PI;
    }

    Kryg(String s, double r) {
        super(r);
        style = s;
    }

    double perimetr() {
        return width * Math.PI;
    }
    void show() {
        System.out.println("Круг. Радиус круга " + width);
    }
}
