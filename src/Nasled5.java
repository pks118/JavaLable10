class Figura1 {
    private double width;
    private double height;
    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}
}

class Tryugol1 extends Figura1 {
    double area() {
        return getWidth() * getHeight() / 2;
    }
}

class TypeTreugol1 extends Tryugol1 {
    String style;
    void show2() {
        System.out.println("Треугольник - " + style);
    }
}

class Vivod1 extends TypeTreugol1 {
    void show1() {
        System.out.println("Ширина и высота - " + getWidth() + " и " + getHeight());
    }
}

public class Nasled5 {
    public static void main(String[] args) {
        Vivod1 tr1 = new Vivod1();
        Vivod1 tr2 = new Vivod1();

        tr1.setWidth(4.0);
        tr1.setHeight(4.0);
        tr1.style = "равнобедренный";

        tr2.setWidth(8.0);
        tr2.setHeight(12.0);
        tr2.style = "прямоугольный";

        System.out.println("Описание треугольника 1: ");
        tr1.show1();
        tr1.show2();
        System.out.println("Площадь треугольника = " + tr1.area());

        System.out.println();

        System.out.println("Описание треугольника 2: ");
        tr2.show1();
        tr2.show2();
        System.out.println("Площадь треугольника = " + tr2.area());

    }
}