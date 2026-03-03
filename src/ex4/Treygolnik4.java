package ex4;

class Treygolnik4 extends Figure4 {
    protected String style;
    private double storona3;
    Treygolnik4(double w, double h, double a) {
        super(w, h);
        storona3 = a;
        style = checkType();
    }

    String checkType() {
        if (width==height && width==storona3)
            return "Равносторонний треугольник";
        else if ((width==height && width!=storona3) || (height==storona3 && width!=height) || (width==storona3 && height!=storona3))
            return "Равнобедренный треугольник";
        else return "Разносторонний треугольник";
    }

    double perimetr() {
        return width + height + storona3;
    }

    double area() {
        return Math.sqrt(perimetr() * (perimetr() - width) * (perimetr() - height) * (perimetr() - storona3));
    }

    void show1() {
        System.out.println("Фигура: " +checkType() + ". Площадь: "+area() + ". Периметр: "+perimetr());
    }
}
