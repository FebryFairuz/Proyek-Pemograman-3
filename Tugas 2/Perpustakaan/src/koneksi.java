import java.sql.*;

public class koneksi {
    private Connection koneksi;
    public static void dbOpen() {
        String nmDb = "jdbc:mysql://localhost:3306/perpustakaan";
        String nmUser = "root";
        String pass = "";
        try {            
            koneksi = DriverManager.getConnection(nmDb,nmUser,pass);
            
        }catch (Exception er) {
        }
    }
}
