public class pen{
    public static void main(String args[]){
        pen1 p1 = new pen1();
        p1.setink(0);
        System.out.println("Ink quantity: " + p1.getink());
        p1.setname("Santhiya");
        System.out.println("Name : " + p1.getname());
        p1.setcolour("RED");
        System.out.println("Colour : " + p1.getcolour());
        p1.setprice(50.0124);
        System.out.println("price : " + p1.getprice());
    }
}

class pen1{

    private int quantity;
    private String name;
    private String colour;
    private double price;

    public void setink(int quantity){
        this.quantity = quantity;
    }
    public String getink(){
        if(quantity>0){
            return "The pen has sufficient ink.";
        }else{
            System.out.println( "The pen has no sufficient ink.");
            refill();
            return "The pen has no sufficient ink.";
        }
    }

    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }

    public void setcolour(String colour){
        this.colour = colour;
    }
    public String getcolour(){
        return colour;
    }

    public void setprice(double price){
        this.price = price;
    }
    public double getprice(){
        return price;
    }

    public void refill(){
        System.out.println("Pen is refilled.");
    }
}