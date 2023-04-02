public class Pet {
    String name;
    void eat(){
        System.out.println("I am eating biscuits");
    }
}
class Cat extends Pet{
    void info(){
        System.out.println("My name is " + name);
    }
}
class Main{
    public static void main(String[] args) {
        Cat kitty = new Cat();
        kitty.name="Kitty";
        kitty.info();
        kitty.eat();
    }
}