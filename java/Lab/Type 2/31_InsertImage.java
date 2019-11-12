import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class InsertImage{
 
	public static void main(String[] args) throws SQLException {
		
		InsertImage imageTest = new InsertImage();
		imageTest.insertImg();
	}
 
	public Connection getConnection() {
		
		Connection connect = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "root", "password");
		} catch (Exception e) {

			System.out.println("Error Occured While Connecting: - " + e);
		}
		return connect;
	}
 
	public void insertImg() {
 
        Connection connect = null;
        PreparedStatement statement = null;
        FileInputStream inputStream = null;
 
        try {
 
            File image = new File("/home/metaldent/Pictures/Screenshot from 2019-08-18 13-44-07.png");
            inputStream = new FileInputStream(image);
 
            connect = getConnection();
            statement = connect.prepareStatement("insert into trn_imgs(img_title, img_data) " + "values(?,?)");
            statement.setString(1, "Honda Car");
            statement.setBinaryStream(2, (InputStream) inputStream, (int)(image.length()));
 
            statement.executeUpdate();
 
        } 
        catch (FileNotFoundException e) {

            System.out.println("FileNotFoundException: - " + e);
        } 
        catch (SQLException e) {
        
            System.out.println("SQLException: - " + e);
        } 
        finally {
 
            try {
                connect.close();
                statement.close();
            } 
            catch (SQLException e) {
                System.out.println("SQLException Finally: - " + e);
            }
        }
    }
}