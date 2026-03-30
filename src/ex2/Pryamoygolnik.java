package ex2;

class Pryamoygolnik extends Figure {
    String style;
    Pryamoygolnik(double a, double b, String s) {
        setWidth(a);
        setHeight(b);
        style = s;
    }

    double area() {
        return getWidth() * getHeight();
    }

    double perimetr() {
        return 2 * (getWidth() + getHeight());
    }

    void show() {
        System.out.println("===== Прямоугольник =====" + "\nДлина: " + getHeight() + "\nШирина: " + getWidth());
        System.out.println("Периметр: " + perimetr() + "\nПлощадь: " + area());
        System.out.println("Тип прямоугольникка: "+style);
    }

    public static Pryamoygolnik toPryamoygolnikOrNull(double a, double b, String s) {
        if (a > 0 && b > 0)
            return new Pryamoygolnik(a, b, s);
        else return null;
    }
}
