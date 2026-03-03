package ex1;

class Kryg extends Figure {

    void setDiametr(double d) {
        width = d;
        height = d;
    }

    double area() {
        return width * width * Math.PI / 8;
    }

    double perimetr() {
        return width*Math.PI;
    }

    void show1() {
        System.out.println("Круг. Радиус круга - " + width);
    }
}