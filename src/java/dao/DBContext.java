package dao;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Admin;


public class DBContext implements DatabaseInfo {

    public static Connection getConnect() {
        try {
            Class.forName(DRIVERNAME);
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver" + e);
        }
        try {
            Connection con = DriverManager.getConnection(DBURL, USERDB, PASSDB);
            return con;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
        return null;
    }
//-----------------------------------------------------------------------
    public static Admin check(String user, String pass){
        String sql = "select * from Admin where Username=? and Password=?";
        try (Connection con = getConnect()){
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, user);
            stmt.setString(2, pass);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                return new Admin(user, pass, rs.getInt("role"));
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
//-------------------------------------------------------------------------------------------

//---------------------------------------------------------

//---------------------------------------------------------------------------

}
