public class person{
    public static void main(String args[]){
        p1 obj = new p1(85 ,"Santhiya");
        obj.perform();
    }
}

class p1{
    int rollno;
    String name;
    public p1(int rollno, String name ){
        this.rollno=rollno;
        this.name=name;
    }

    public void perform(){
        System.out.println("Hi..I'm "+name+" . My roll number is "+rollno+".");
    }
}