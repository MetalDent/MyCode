// CREATE TABLE  `dbname`.`trn_imgs` (
//   `img_id` int(10) unsigned NOT NULL auto_increment,
//   `img_title` varchar(45) collate latin1_general_ci NOT NULL,
//   `img_data` blob NOT NULL,
//   PRIMARY KEY  (`img_id`)
// );

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import java.sql.*

public class InsertImage{
 
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
 
            File image = new File("C:/honda.jpg");
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