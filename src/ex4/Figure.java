package ex4;

class Figure {
    protected double width;
    protected double height;

    Figure(double w, double h) {
        width = w;
        height = h;
    }

    Figure(double w) {
        width = w;
    }

    void show() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}
