import java.io.*;
import java.util.Random;

class innerClassAnonymous {

    interface anonymousClass {
        
        void assignUsername();
    }

    public void assignUsername(int choice) {

        if(choice == 0) {

            anonymousClass assign = new anonymousClass() {

                void assignUsername() {    
                
                    Random rand = new Random();
                    double d = rand.nextDouble();
                    String username = String.valueOf(d);
                    System.out.println("username:" + username);
                }
            };
        }
        else if(choice == 1) {

            System.out.println("Enter username");
            BufferedReader inputUsername = new BufferedReader(new InputStreamReader(System.in));
            String username = inputUsername.readLine();
            System.out.println("username:" + username);
        }
        else {

            String username = "Invalid choice";
            System.out.println("username:" + username);
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter 0 for anonymous username\n 1 otherwise");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(input.readLine());
        innerClassAnonymous newUSer = new innerClassAnonymous();
        newUSer.assignUsername(choice);   
    }
}
