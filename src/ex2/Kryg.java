package ex2;

class Kryg extends Figure {
    Kryg(double radius) {
        setWidth(radius);
    }
    String style;

    double area() {
        return Math.PI * getWidth() * getWidth();
    }

    double perimetr() {
        return 2 * getWidth() * Math.PI;
    }

    void show() {
        System.out.println("===== Круг =====" + "\nРадиус: " + getWidth());
        System.out.println("Периметр: " + perimetr() + "\nПлощадь: " + area());
    }

    public static Kryg toKrygOrNull(double a){
        if (a > 0)
            return new Kryg(a);
        else return null;
    }
}