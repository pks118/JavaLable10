package ex4;

class Figure4 {
    protected double width;
    protected double height;

    Figure4(double w, double h) {
        width = w;
        height = h;
    }

    Figure4(double w) {
        width = w;
    }

    void show1() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}
