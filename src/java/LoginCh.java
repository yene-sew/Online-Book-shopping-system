import java.sql.*;

public class LoginCh {

    public static boolean validate(String name, String pass) {
        boolean status = false;
        try {

            DataBase dbcon = new DataBase();
            Connection con = dbcon.connMethod();
            PreparedStatement ps = con.prepareStatement("select * from LOGINTBL where USERNAME=? and PASSWORD=?");
            ps.setString(1, name);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}