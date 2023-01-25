
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;

@ManagedBean

public class SignUp {
private String firstname;
private String lastname;
private String phone;
private String email;
private String username;
private String password;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
public void Insert(){ 
    DataBase db=new DataBase();
    Connection con=db.connMethod();
        try{

    PreparedStatement ps=con.prepareStatement("insert into USERTBL(FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER) values(?,?,?,?) ");
    ps.setString(1,firstname );
    ps.setString(2,lastname );
    ps.setString(3,phone );
    ps.setString(4,email );
    ps.executeUpdate();

    PreparedStatement ps2=con.prepareStatement("insert into LOGINTBL(USERNAME,PASSWORD,USERTYP) values(?,?,?) ");
    ps2.setString(1,username );
    ps2.setString(2,password );
    ps2.setString(3, "user" );

       
    ps2.executeUpdate();
       System.err.println("success");
        } catch ( SQLException e) {
        }
        
    }

}
 
