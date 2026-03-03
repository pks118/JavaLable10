package ex3;

class Kryg2 extends Figure2 {
    String style;
    Kryg2(String s, double w) {
        width = w;
        style = s;
    }

    double perimetr() {
        return width * Math.PI;
    }

    double area() {
        return width * width * Math.PI / 8;
    }
    void show1() {
        System.out.println("Круг. Радиус круга - " + width);
    }
}
