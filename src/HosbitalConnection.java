import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

class HospitalConnection {

    public static Connection GetConnection()
    {
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/Hosbital",
                    "system", "123456wajidM");

            return con;

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Hospital Connection failed!");
            return null;
        }
    }
}
