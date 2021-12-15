package com.company.chapter5.Default_and_Static_Interface_Methods;

//Default interface methods - mozemy utworzyc metode statyczna w interface ktora bedzie miala cialo.
//Static interface methods - Wywoluje sie metode statyczna na interfacie a nie na objekcie
//Interface variables - z zalozenia sa public final static i wywoluje sie je na interfacie
interface Vehiclee {
    String getBrand();
    String speedUp();
    String slowDown();
    default String turnAlarmOn() { return "Turning the vehicle alarm on."; }
    default String turnAlarmOff() { return "Turning the vehicle alarm off."; }

    static int getHorsePower(int rpm, int torque) { return (rpm * torque) / 5252; }
    public final static int MAX_SPEED = 200; // Interface variable by default are public final static are redundant
}
class Carr implements Vehiclee {
    private String brand;
    // constructors/getters
    @Override
    public String getBrand() {
        return brand;
    }
    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }
    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }
}
public class DefaultAndStaticInterfaceMethods {
    public static void main(String[] args) {

        Vehiclee carr = new Carr();
        System.out.println(carr.getBrand());
        System.out.println(carr.speedUp());
        System.out.println(carr.slowDown());
        System.out.println(carr.turnAlarmOn());
        System.out.println(carr.turnAlarmOff());
        Vehiclee.getHorsePower(2500, 480);
        System.out.println(Vehiclee.MAX_SPEED);
    }
}
