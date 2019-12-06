class TestInterface implements OuterInterface.InnerInterface{

    public void implementMe(){
        System.out.println("Hey I have implemented successfully!!!");
    }
    
    public static void main(String a[]){
        TestInterface msi = new TestInterface();
        msi.implementMe();
    }
}

class OuterInterface{
    
    public static interface InnerInterface{
        public void implementMe();
    }
}
