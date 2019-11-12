class static_member {
     
    public static String staticVar = "You can access me!!!";
    private String privVar = "You cannot access me";
     
    public static class ChildClass{
         
        public void myMethod(){
       
            System.out.println(staticVar);
            
        }
    }
     
    public static void main(String a[]){
       static_member.ChildClass cc = new static_member.ChildClass();
        cc.myMethod();
    }
}