package ex4;

class Treygolnik extends Figure {
    protected String style;
    private double stor;
    Treygolnik(double w, double h, double a) {
        super(w, h);
        stor = a;
        style = checkType();
    }

    String checkType() {
        if (width==height && width== stor)
            return "Равносторонний треугольник";
        else if (width == height || height == stor || width == stor)
            return "Равнобедренный треугольник";
        else return "Разносторонний треугольник";
    }

    double perimetr() {
        return width + height + stor;
    }

    double area() {
        return Math.sqrt(perimetr() * (perimetr() - width) * (perimetr() - height) * (perimetr() - stor));
    }

    void show() {
        System.out.println("Фигура: " +checkType() + ". Площадь: "+area() + ". Периметр: "+perimetr());
    }
}
