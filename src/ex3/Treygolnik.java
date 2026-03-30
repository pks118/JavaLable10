package ex3;

class Treygolnik extends Figure {
    protected String name;
    private double stor;
    Treygolnik(double w, double h, double a, String style) {
        name = style;
        setWidth(w);
        setHeight(h);
        stor = a;
    }
    Treygolnik(double w, double h, String style) {
        name = style;
        setWidth(w);
        setHeight(h);
    }
    Treygolnik(double w, String style) {
        name = style;
        setWidth(w);
        setHeight(w);
        stor = w;
    }

    double area() {
        return Math.sqrt(perimetr() * (perimetr() - getWidth()) * (perimetr() - getHeight()) * (perimetr() - stor));
    }

    double perimetr() {
        return getWidth() + getHeight() + stor;
    }

    void show () {
        System.out.println("===== Треугольник =====" + "\nДлина: " + getHeight() + "\nШирина: " + getWidth());
        System.out.println("Периметр: " + perimetr() + "\nПлощадь: " + area());
        System.out.println("Тип треугольника: "+ name);
    }

    public static Treygolnik toTreygolnikOrNull(double a, double b , double c, String s){
        if ((a > 0 && b > 0 && c > 0)&&(a + b > c || b + c > a || a + c > b))
            return new Treygolnik(a, b, c, s);
        else return null;
    }
}
