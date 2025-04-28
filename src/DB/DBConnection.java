/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DB;
  import com.mysql.jdbc.Statement;
import java.sql.*;


/**
 *
 * @author hp
 */
public class DBConnection {

    public Connection con;
    public Statement st;
    public PreparedStatement pst;
    
    public ResultSet rst;
    public DBConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","Sidranoor12");
            st = (Statement) con.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
}
}

