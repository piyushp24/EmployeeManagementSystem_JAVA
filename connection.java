
package employee.management.system;
import java.sql.*;
public class connection {
    
    Connection c;
    Statement s;         // both are interfaces
    public connection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem","root", "panditpv2401@vp");
            s = c.createStatement();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
