package Nasled5;
class Transport{
    private String name;
}
class Car extends Transport{
    private int pass;
    private int obem;
    private int rasxod;
    Car(int p, int o, int r){
        pass = p;
        obem = o;
        rasxod = r;
    }
    int range(){
        return rasxod * obem;
    }
    double rasxod(int km){
        return (double) (km*rasxod)/2;
    }
}
public class MainTransport {
    public static void main(String[] args) {
        Car car1 = new Car(3, 4, 5);
    }
}
