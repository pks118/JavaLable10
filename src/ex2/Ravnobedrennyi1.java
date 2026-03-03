package ex2;

class Ravnobedrennyi1 extends Treygolnik1 {

    String style = "разносторонний (возможно, прямоугольный)";

    String ravnobed() {
        if (width == height || width == storona3 || height == storona3)
            style = "равнобедренный";
        return style;
    }
}
