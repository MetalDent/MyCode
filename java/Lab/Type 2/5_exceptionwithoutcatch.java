class withoutCatch {
    public static void main(String a[]) {
        try{
            int x = 10/0;
        } finally{
            System.out.println("In finally block");
        }
    }
}