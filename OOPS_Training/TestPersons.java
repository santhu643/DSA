public class TestPersons {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 45);

        p1.eat();
        p1.sleep();

        p2.eat();
        p2.sleep();
    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        if (age < 40) {
            System.out.println(name + " eats light food.");
        } else {
            System.out.println(name + " eats heavy meals.");
        }
    }

    public void sleep() {
        if (age < 40) {
            System.out.println(name + " sleeps for 8 hours.");
        } else {
            System.out.println(name + " sleeps for 5 hours.");
        }
    }
}
