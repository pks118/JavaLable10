package ex2;

class Ravnostoronnyi1 extends Ravnobedrennyi1 {
    String style = "нет";

    String ravnostor() {
        if (width == height && width == storona3)
            style = "равносторонний";
        return style;
    }
}
