//access top level class variables
 
public class q16 {
     
    public static String staticVar = "You can access me!!!";
    private String privVar = "You cannot access me";
     
    public static class ChildClass{
         
        public void myMethod(){
       
            System.out.println(staticVar);
            
        }
    }
     
    public static void main(String a[]){
       q16.ChildClass cc = new q16.ChildClass();
        cc.myMethod();
    }
}