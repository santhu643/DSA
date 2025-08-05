public class Tester{
    public static void main(String args[]){
        Child c1 = new Child();
        System.out.println("The default value of Integer : "+ c1.a);
        System.out.println("The default value of String : "+ c1.str);
        System.out.println("The default value of Boolean : "+ c1.bool);
    }
}

class Child{
    int a;
    String str;
    boolean bool;
}