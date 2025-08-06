class Animal {
    String name="Praani";
    public void eat() {
        System.out.println("Animal "+name + " eating like an animal");
    }
    public void sleep() {
        System.out.println("Animal "+name + " sleeping with eyes closed");
    }
}
class Bird extends Animal {
    public void eat() {
        System.out.println("Bird " + name + " eating like a bird");
    }
    public void sleep() {
        System.out.println("Bird " + name + " sleeping with eyes open");
    }
}
class Ostrish extends Bird {
    public void sleep() {
        Animal a=new Animal();
        a.sleep();
    }
}
class Dog extends Animal {
    String name = "Doggo";
    public void bark() {
        System.out.println("Dod " + name + " Barking...");
    }
    public void eat() {
        System.out.println("Dog " + name + " eating like a dog");
    }
} 
class MariDog extends Dog {
    public void play() {
        System.out.println("MariDog is playing ");
    }
}
public class TestAnimal {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.eat();
        b.sleep();

        Animal a = new Animal();
        a.eat();
        a.sleep();

        Ostrish o = new Ostrish();
        System.out.println("Ostrich object created..");
        o.sleep();
        o.eat();       

        MariDog md = new MariDog();
        md.bark();
        md.play(); 
        md.eat();
        md.sleep();

        // Dog d = new Bird(); (compile time error it is not allowed to assign a parent class object to a child class reference)
        
    }
}