import java.util.Scanner;
class Getinputfromuser
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("You entered string "+s);
        int a = in.nextInt();
        System.out.println("You entered integer "+a);
        float b = in.nextFloat();
        System.out.println("You entered float "+b);
    }
}
/*
There are three different ways to read the input from Java Console, they are –
1.Using Java Bufferedreader Class
2.Scanner Class in Java
3.Console Class in Java
*/