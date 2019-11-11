import java.io.*;
import java.util.Random;


public class innerClassAnonymous {

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
// public class HelloWorldAnonymousClasses {
  
//     interface HelloWorld {
//         public void greet();
//         public void greetSomeone(String someone);
//     }
  
//     public void sayHello() {
        
//         class EnglishGreeting implements HelloWorld {
//             String name = "world";
//             public void greet() {
//                 greetSomeone("world");
//             }
//             public void greetSomeone(String someone) {
//                 name = someone;
//                 System.out.println("Hello " + name);
//             }
//         }
      
//         HelloWorld englishGreeting = new EnglishGreeting();
        
//         HelloWorld frenchGreeting = new HelloWorld() {
//             String name = "tout le monde";
//             public void greet() {
//                 greetSomeone("tout le monde");
//             }
//             public void greetSomeone(String someone) {
//                 name = someone;
//                 System.out.println("Salut " + name);
//             }
//         };
        
//         HelloWorld spanishGreeting = new HelloWorld() {
//             String name = "mundo";
//             public void greet() {
//                 greetSomeone("mundo");
//             }
//             public void greetSomeone(String someone) {
//                 name = someone;
//                 System.out.println("Hola, " + name);
//             }
//         };
//         englishGreeting.greet();
//         frenchGreeting.greetSomeone("Fred");
//         spanishGreeting.greet();
//     }

//     public static void main(String... args) {
//         HelloWorldAnonymousClasses myApp =
//             new HelloWorldAnonymousClasses();
//         myApp.sayHello();
//     }            
// }