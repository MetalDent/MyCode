import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class q20 {
 
    public static void main(String a[]){
     
        try {
            InetAddress[] myHost = InetAddress.getAllByName("www.google.com");
            for(InetAddress host:myHost){
                System.out.println(host.getHostAddress());
            }
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}