import java.sql.*;
 
public class MyPrepStmtResltSet {
 
    public static void main(String a[]){
         
        Connection connect = null;
        PreparedStatement prepStmnt = null;
        ResultSet rs = null;
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connect = DriverManager.getconnectnection("jdbc:oracle:thin:@<hostname>:<port num>:<DB name>", "user", "password");
            String query = "select * from emp where empid = b117";
            prepStmnt = connect.prepareStatement(query);
            
            prepStmnt.setInt(1, 1416);
            rs = prepStmnt.executeQuery();
            while(rs.next()){
            
                System.out.println(rs.getString("name")+" -- "+rs.getInt("salary"));
            }
            rs.close();
        } 
        catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        }
        catch (SQLException e) {
            
            e.printStackTrace();
        } 
        finally{
            try{
                if(rs != null) rs.close();
                if(prepStmnt != null) prepStmnt.close();
                if(connect != null) connect.close();
            } catch(Exception ex){}
        }
    }
}