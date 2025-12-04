package Nasled4;

import java.util.InputMismatchException;
import java.util.Scanner;

class Figura {
    private double width;
    private double height;
    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }
    void setWidth(double w) {
        width = w;
    }
    void setHeight(double h) {
        height = h;
    }
}

class Tryugol extends Figura {
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showTypeTreugol() {
        System.out.println("Треугольник - " + style);
    }
    void showHWTreugol() {
        System.out.println("Ширина и высота - " + getWidth() + " и " + getHeight());
    }
}
class Krug extends Figura {
    private String style;
    Krug(String s, double r){
        setWidth(r);
        style = s;
    }
    double area() {
        return Math.PI*Math.pow(getWidth(),2);
    }
    void showHWKrug() {System.out.println("Радиус - " + getWidth());}
    void showTypeKrug() {
        System.out.println("Окружность - " + style);
    }
}
class Pryamougol extends Figura {
    private String style;
    Pryamougol(String s, double w, double h){
        setWidth(w);
        setHeight(h);
        style = s;
    }
    double area() {
        return getWidth() * getHeight();
    }
    void showHWPryamougol() {System.out.println("Ширина и высота - " + getWidth() + " и " + getHeight());}
    void showTypePryamougol() {
        System.out.println("Четырехугольник - " + style);
    }
}
class Nasled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] type_Tryugol = {"равнобедренный", "остроуголный", "тупоугольный", "равносторонний", "равнобедренный", "разносторонний"};
        String [] type_Krug = {"единичный", "вписанный", "описанный", "касательный"};
        String [] type_Pryamougol = {"Прямоугольник", "Квадрат", "Ромб", "Параллелограмм"};
        Tryugol tr1 = new Tryugol();
        Tryugol tr2 = new Tryugol();
        System.out.println("Выход из программы 'y'");
        System.out.println("Треугольник 1");
        tr1.setWidth(inputZnach(sc, "ширину"));
        tr1.setHeight(inputZnach(sc, "высоту"));
        tr1.style = type_Object(sc, type_Tryugol);
        System.out.println("Треугольник 2");
        tr2.setWidth(inputZnach(sc, "ширину"));
        tr2.setHeight(inputZnach(sc, "высоту"));
        tr2.style = type_Object(sc, type_Tryugol);
        System.out.println("Окружность 1");
        Krug kr1 = new Krug(type_Object(sc, type_Krug), inputZnach(sc, "ширину"));
        System.out.println("Четырехугольник 1");
        Pryamougol pr1 = new Pryamougol(type_Object(sc, type_Pryamougol), inputZnach(sc, "ширину"), inputZnach(sc, "высоту"));

        System.out.println("Описание треугольника 1: ");
        tr1.showHWTreugol();
        tr1.showTypeTreugol();
        System.out.println("Площадь треугольника = " + tr1.area());
        System.out.println();
        System.out.println("Описание треугольника 2: ");
        tr2.showHWTreugol();
        tr2.showTypeTreugol();
        System.out.println("Площадь треугольника = " + tr2.area());
        System.out.println();
        System.out.println("Описание окружности 1: ");
        kr1.showHWKrug();
        kr1.showTypeKrug();
        System.out.println("Площадь окружности = " + kr1.area());
        System.out.println();
        System.out.println("Описание четырехугольника 1: ");
        pr1.showHWPryamougol();
        pr1.showTypePryamougol();
        System.out.println("Площадь окружности = " + pr1.area());
    }
    private static double inputZnach(Scanner sc, String storona){
        while (true) {
            try {
                System.out.print("Введите "+ storona + ":");
                String input_w = sc.nextLine();
                if(input_w.equals("y")) {
                    System.out.println("Выход из программы...");
                    System.exit(0);
                }
                return Double.parseDouble(input_w);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Ошибка ввода!(Повторный ввод)");
            }
        }
    }
    private static String type_Object(Scanner sc, String [] type_Object) {
        boolean flag = true;
        System.out.println("Введите тип:");
        while (true) {
            String input_style = sc.nextLine();
            if(input_style.equals("y")) {
                System.out.println("Выход из программы...");
                System.exit(0);
            }
            input_style = input_style.toLowerCase();
            for (int i = 0; i < type_Object.length; i++) {
                if (input_style.equals(type_Object[i])) {
                    return type_Object[i];
                }
                else flag = false;
            }
            if(!flag){
                System.out.println("Ошибка ввода!(Повторный ввод)");
            }
        }
    }
}