public class Test_hippo{
    public static void main(String args[]){
        hippo h1 = new hippo();
        h1.size=10;
        System.out.println(h1.size);
        h1.sing();

        hippo h2=h1;
        h2.size=90;
        System.out.println(h2.size);
        h2.sing();

        hippo h3 = new hippo();
        h3.size=50;
        System.out.println(h3.size);
        h3.sing();

        h1=new hippo();
        System.out.println(h1.size);

        dhaksu d1 = new dhaksu();
        d1.speak("lusu",30);
        d1.age=30;
        System.out.println(d1.age);
    }
}

class hippo{
    int size;
    public void sing(){
        System.out.println("I am singing...");
    }
}

class dhaksu{
    int age;
    public void speak(String n,int age){
        System.out.println("I am dhaksu and i am " + n + " i am "+age+ " old");
    }
} 