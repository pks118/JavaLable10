package ex1;

class Pryamoygolnik extends Figure {

    double area() {
        return width * height;
    }

    double perimetr() {
        return width*2+height*2;
    }
    void show1() {
        System.out.println("Прямоугольник. Ширина и высота " + width + " и " + height);
    }
}
