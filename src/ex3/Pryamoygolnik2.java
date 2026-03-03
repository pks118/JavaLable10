package ex3;

class Pryamoygolnik2 extends Figure2 {
    String style;
    Pryamoygolnik2(String s, double h, double w) {
        width = w;
        height = h;
        style = s;
    }

    double perimetr() {
        return width * 2 + height * 2;
    }
    double area() {
        return width * height;
    }

    void show1() {
        System.out.println("Прямоугольник. Ширина и высота " + width + " и " + height);
    }
}
