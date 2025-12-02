class Figura2 {
    private double width;
    private double height;
    private double radius;
    double getWidth(){return width;}
    double getHeight(){return height;}
    double getRadius(){return radius;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}
    void setRadius(double r){radius = r;}

}

class Tryugol2 extends Figura2 {
    String style;
    Tryugol2 (String s, double w, double h){
        setWidth(w);
        setHeight(h);
        style = s;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void show1() {System.out.println("Ширина и высота - " + getWidth() + " и " + getHeight());}
    void show2() {
        System.out.println("Треугольник - " + style);
    }
}

class Krug2 extends Figura2 {
    String style;
    Krug2 (String s, double r){
        setRadius(r);
        style = s;
    }
    double area() {
        return Math.PI*Math.pow(getRadius(),2);
    }
    void show1() {System.out.println("Радиус - " + getRadius());}
    void show2() {
        System.out.println("Круг - " + style);
    }
}

class Prymougol2 extends Figura2 {
    String style;
    Prymougol2 (String s, double w, double h){
        setWidth(w);
        setHeight(h);
        style = s;
    }
    double area() {
        return getWidth() * getHeight();
    }
    void show1() {System.out.println("Ширина и высота - " + getWidth() + " и " + getHeight());}
    void show2() {
        System.out.println("Прямоугольник - " + style);
    }
}

public class Nasled6 {
    public static void main(String[] args) {
        Tryugol2 tr2 = new Tryugol2("равн", 4.0, 4.0);
        Tryugol2 tr1 = new Tryugol2("прям", 8.0, 12.0);
        Krug2 kr1 = new Krug2("Сфера", 4.0);
        Prymougol2 pr1 = new Prymougol2("Квадрат", 4.0, 4.0);

        System.out.println("Описание треугольника 1: ");
        tr1.show1();
        tr1.show2();
        System.out.println("Площадь треугольника = " + tr1.area());

        System.out.println();

        System.out.println("Описание треугольника 2: ");
        tr2.show1();
        tr2.show2();
        System.out.println("Площадь треугольника = " + tr2.area());

        System.out.println();

        System.out.println("Описание круга 1: ");
        kr1.show1();
        kr1.show2();
        System.out.println("Площадь круга = " + kr1.area());

        System.out.println();

        System.out.println("Описание прямоугольника 1: ");
        pr1.show1();
        pr1.show2();
        System.out.println("Площадь прямоугольника = " + pr1.area());

    }
}
