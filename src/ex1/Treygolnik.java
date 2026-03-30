package ex1;

class Treygolnik extends Figure {
    Treygolnik(double a, double b, double c, String s) {
        width = a;
        a2 = b;
        a3 = c;
        style = s;
    }

    double a2;
    double a3;
    String style;

    double area() {
        return width * height / 2;
    }

    double perimetr() {
        return width + a2 + a3;
    }

    void show() {
        System.out.println("===== Треугольник =====" + "\nДлина: " + height + "\nШирина: " + width);
        System.out.println("Периметр: " + perimetr() + "\nПлощадь: " + area());
        System.out.println("Тип треугольника: " + style);
    }

    public static Treygolnik toTreygolnikOrNull(double a, double b, double c, String s) {
        if ((a > 0 && b > 0 && c > 0)&&(a + b > c || b + c > a || a + c > b))
            return new Treygolnik(a, b, c, s);
        else return null;
    }
}