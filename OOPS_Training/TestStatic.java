class Static{
    int rollno;
    static int count=10;

    public Static() {
        System.out.println("Constructor called");
        System.out.println("Count: " + count);
    }
    {
        System.out.println("Count: " + count);
        System.out.println("Instance initializers");
        count=20;
    }
    {
        System.out.println("Count: " + count);
        System.out.println("Instance initializers-2");
        count=40;
    }
    static {
        System.out.println("Count: " + count);
        System.out.println("Instance initializers-2");
        count=30;
    }
}
class TestStatic {
    public static void main(String[] args) {
        Static s = new Static();
        System.out.println(s);
        System.out.println("Count: " + Static.count);
    }
}