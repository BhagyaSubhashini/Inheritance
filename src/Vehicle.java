public class Vehicle {
    void drive(){
        System.out.println("drive");
    }
    void vehicleBreak(){
        System.out.println("break");
    }
    void reverse(){
        System.out.println("reverse");
    }
}
class Car extends Vehicle{
    void motorRacing(){
        System.out.println("racing");
    }
}
class ModernCar extends Car{
    void flying(){
        System.out.println("flying");
    }
}
class Boat extends Vehicle{
    void surf(){
        System.out.println("surfing");
    }
}
class ModernBoat extends Boat{
    void landRiding(){
        System.out.println("landriding");
    }
}
class TestOutput{
    public static void main(String[] args) {
        ModernCar mc = new ModernCar();
        ModernBoat mb= new ModernBoat();
        mc.drive();
        mc.vehicleBreak();
        mc.reverse();
        mc.motorRacing();
        mc.flying();
        mb.drive();
        mb.vehicleBreak();
        mb.reverse();
        mb.surf();
        mb.landRiding();
    }
}