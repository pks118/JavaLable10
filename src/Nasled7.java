class Figura3 {
    private double width;
    private double height;
    private double radius;
    Figura3 (double w, double h){
        width = w;
        height = h;
    }
    Figura3 (double r){
        radius = r;
    }
    double getWidth(){return width;}
    double getHeight(){return height;}
    double getRadius(){return radius;}
    void setWidth(double w){width = w;}
    void setHeight(double h){height = h;}
    void setRadius(double r){radius = r;}

}

class Tryugol3 extends Figura3 {
    String style;
    Tryugol3 (String s, double w, double h){
        super(w, h);
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

class Krug3 extends Figura3 {
    String style;
    Krug3 (String s, double r){
        super(r);
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

public class Nasled7 {
    public static void main(String[] args) {
        Tryugol3 tr2 = new Tryugol3("равн", 4.0, 4.0);
        Tryugol3 tr1 = new Tryugol3("прям", 8.0, 12.0);
        Krug3 kr1 = new Krug3("Сфера", 4.0);
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
