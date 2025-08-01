public class animal{
    public static void main(String args[]){
        cow c1 = new cow();
        c1.calculate(5,6);
    }
}

class cow{
    public void calculate(int morng,int eve){
        if(morng>=5 && eve>=5){
            System.out.println("The cow give morng "+morng+ "liter and "+ eve+"liter .This cow is best to buy.");
        }else if(morng<=5 && eve<=5){
            System.out.println("The cow give morng "+morng+ "liter and "+ eve+"liter .This cow will not provide sufficient milk.");
        }else{
            System.out.println("The cow give morng "+morng+ "liter and "+ eve+"liter.This cow will not provide sufficient milk at morng.");
        }
    }
} 
