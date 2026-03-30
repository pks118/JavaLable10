package ex5;

import java.util.Scanner;

class Transport {
    private int maxSpeed;
    private String toplivo;

    Transport(int maxSpeed, String toplivo) {
        this.maxSpeed = maxSpeed;
        this.toplivo = toplivo;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getToplivo() {
        return toplivo;
    }

    public void showInfo() {
        System.out.println("Макс. скорость: " + maxSpeed + " км/ч, Тип топлива: " + toplivo);
    }
}

class NazemniTransport extends Transport {
    private int koles;
    private int pass;

    NazemniTransport(int maxSpeed, String toplivo, int koles, int pass) {
        super(maxSpeed, toplivo);
        this.koles = koles;
        this.pass = pass;
    }

    public int getKoles() {
        return koles;
    }

    public int getPass() {
        return pass;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Колес: " + koles + ", пассажиров: " + pass);
    }
}

class Car extends NazemniTransport {
    private int obem;
    private int rasxod;
    Car(int maxSpeed, String toplivo, int koles, int pass, int rasxod, int obem) {
        super(maxSpeed, toplivo, koles, pass);
        this.obem = obem;
        this.rasxod = rasxod;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Объём: " + obem + " см3" + ", Расход: " + rasxod + " л/100км");
    }

    int range() {
        return rasxod * obem;
    }

    double rashod(int km) {
        return (double) (km * rasxod) / 100;
    }
}

public class Main {

    private static int inputInt(Scanner sc, String promt){
        System.out.println("Введите "+ promt +":");
        while (!sc.hasNextInt()) {
            try {
                System.out.println("Повторите ввод:");
                sc.next();
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
        return sc.nextInt();
    }
    private static String choiceToplivo(Scanner sc){
        int choise;
        while (true){
            System.out.println("1) Бензин\n2) Дизель");
            choise = inputInt(sc, "(1, 2)");
            switch (choise){
                case 1:
                    return "Бензин";
                case 2:
                    return "Дизель";
                default:
                    System.out.println("Введено другое значение.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxSpeed = inputInt(sc, "макс. скорость (км/ч)");
        String toplivo = choiceToplivo(sc);
        int koles = inputInt(sc, "колёса (шт)");
        int pass = inputInt(sc, "пассажиров (кол-во)");
        int rasxod = inputInt(sc, "расход (л)");
        int obem = inputInt(sc, "объем (см3)");
        Transport transport = new Transport(maxSpeed, toplivo);
        NazemniTransport landVehicle = new NazemniTransport(maxSpeed, toplivo, koles, pass);
        Car car = new Car(maxSpeed, toplivo, koles, pass, rasxod, obem);
        System.out.println("Vehicle");
        transport.showInfo();
        System.out.println("\nGroundVehicle");
        landVehicle.showInfo();
        System.out.println("\nCar");
        car.showInfo();
        System.out.println("Запас хода: " + car.range() + " км");
        System.out.println("Расход топлива на 300 км: " + car.rashod(300) + " л");
    }
}

