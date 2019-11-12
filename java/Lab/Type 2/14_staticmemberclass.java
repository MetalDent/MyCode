 class Main {
 
    public static class InnerClass {
 
        public void printStatus() {
            System.out.println("Hey I am inside static member class");
        }
    }
 
    public static void main(String a[]) {
        TestClass obj = new TestClass();
        obj.testMemberClass();
    }
}
 
class TestClass {
 
    public void testMemberClass() {
        Main.InnerClass obj2 
                    = new Main.InnerClass();
        obj2.printStatus();
    }
}