package ex2;

class Figure {
    private double width;
    private double height;

    void setWidth(double w){
        width = w;
    }
    void setHeight(double h){
        height = h;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    void show() {
        System.out.println("Ширина и высота " + width + " и " + height);
    }
}
