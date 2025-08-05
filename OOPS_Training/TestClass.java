public class TestClass {
    public static void main(String[] args) {
        TestChild tc = new TestChild(10, 11); 

        System.out.println("a: " + tc.getA());
        System.out.println("b: " + tc.getB());
        System.out.println("getname(): " + tc.getname());

        tc.display();
        tc.display(tc.getA());

        
    }
}

final class TestChild {

    private final int a;
    private final int b;

    public TestChild(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getname() {
        return b + 11;
    }

    final void display() {
        System.out.println("Final Method");
    }

    final void display(int a) {
        System.out.println("Final method with argument " + a);
    }
}
