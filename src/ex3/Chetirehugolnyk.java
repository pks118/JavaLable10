package ex3;

class Chetirehugolnyk extends Figure {
    String style;
    private double stor3, stor4;

    void setStor3(double a) {
        stor3 = a;
    }

    void setStor4(double b) {
        stor4 = b;
    }

    public double getStor3() {
        return stor3;
    }

    public double getStor4() {
        return stor4;
    }

    Chetirehugolnyk(double h, double w, double a, double b, String s) {
        setWidth(w);
        setHeight(h);
        stor3 = a;
        stor4 = b;
        style = s;
    }

    Chetirehugolnyk(double h, double w, double a, String s) {
        setWidth(w);
        setHeight(h);
        stor3 = a;
        stor4 = a;
        style = s;
    }

    Chetirehugolnyk(double h, double w, String s) {
        setWidth(w);
        setHeight(h);
        stor3 = h;
        stor4 = w;
        style = s;
    }

    Chetirehugolnyk(double h, String s) {
        setWidth(h);
        setHeight(h);
        stor3 = h;
        stor4 = h;
        style = s;
    }


    double perimetr() {
        return getWidth() * 2 + getHeight() * 2;
    }

    double area() {
        return getWidth() * getHeight();
    }

    void show() {
        System.out.println("===== Четырехугольник =====" + "\nДлина: " + getHeight() + "\nШирина: " + getWidth());
        System.out.println("Периметр: " + perimetr() + "\nПлощадь: " + area());
        System.out.println("Тип четырехугольника: " + style);
    }

    public static Chetirehugolnyk toChetirehugolnykOrNull(double a, double b, double width, double height) {
        if (width == height && width == a && width == b)
            return new Chetirehugolnyk(height, "Квадрат");
        else if (width == height && width != a &&
                width != b &&
                a != b || width == a &&
                width != height &&
                width != b &&
                height != a &&
                height != b &&
                a != b || a == b &&
                a != width &&
                a != height &&
                width != height &&
                width != b &&
                b != height)
            return new Chetirehugolnyk(b, width, height, "Трапеция");
        else if (width == height && a == b || width == a && height == b
                || width == b && height == a) {
            return new Chetirehugolnyk(width, height, "Прямоугольник");
        } else {
            return new Chetirehugolnyk(a, b, width, height, "Произвольный четырёхугольник");
        }
    }
}
