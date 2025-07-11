public class comparision{
    public static void main(String args[]){
         String a="Santhu";
         //immutable
         String b="Santhu";
         
         if(a==b){
            System.out.println("It has same reference");
         }else{
            System.out.println("It does not have same reference");
         }

         if(a.equals(b)){
            System.out.println("It has same value");
         }else{
            System.out.println("It does not have same value");
         }

         String c = new String("Santhu");
         String d = new String("Santhu");

         if(c==d){
            System.out.println("It has same reference");
         }else{
            System.out.println("It does not have same reference");
         }

         if(c.equals(d)){
            System.out.println("It has same value");
         }else{
            System.out.println("It does not have same value");
         }
    }
}