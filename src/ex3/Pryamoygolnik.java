package ex3;

class Pryamoygolnik extends Figure {
    String style;
    Pryamoygolnik( double h, double w, String s) {
        setWidth(w);
        setHeight(h);
        style = s;
    }

    double perimetr() {
        return getWidth() * 2 + getHeight() * 2;
    }
    double area() {
        return getWidth() * getHeight();
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
