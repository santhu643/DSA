public class cow{
     public static void main(String args[]){
        TestCow c1 = new TestCow();
        TestCow c2 = c1;
        System.out.println(c1.name="dhaku");
        c1.moo();
        System.out.println(c2.name="santhu");
        System.out.println(c1.name);
        c2.moo();
    }
}

class TestCow{
    String name;
    public void moo(){
        System.out.println("I am cow and I am moo mooing "+name);
    }
}