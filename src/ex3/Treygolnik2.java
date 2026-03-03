package ex3;

class Treygolnik2 extends Figure2 {
    protected String name;
    private double storona3;
    Treygolnik2(String style, double w, double h, double a) {
        name = style;
        width = w;
        height = h;
        storona3 = a;
    }

    Treygolnik2(String style, double w, double h) {
        name = style;
        width = w;
        height = h;
    }
    Treygolnik2(String style, double w) {
        name = style;
        width = w;
        height = w;
        storona3 = w;
    }


    double area() {
        return Math.sqrt(perimetr() * (perimetr() - width) * (perimetr() - height) * (perimetr() - storona3));
    }

    double perimetr() {
        return width + height + storona3;
    }

    void showTreygolnik() {
        System.out.println("Треугольник " + name);
    }
}
