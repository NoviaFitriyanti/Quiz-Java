package tokobuku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi==null){
            try{
                String url;
                url = "jdbc:mysql://localhost/tokoBuku";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, username, password);
            }catch (SQLException t){
                JOptionPane.showMessageDialog(null, "koneksi gagal "+t.getMessage());
            }
        }return koneksi;
    }static Object getConnection(){
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
