
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class Login {
    private String User;
    private String Pass;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return Pass;
    } 

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    public String checkuser() throws SQLException, ClassNotFoundException {
      boolean valid = LoginCh.validate(User ,Pass);
        if (valid) {
              DataBase dbcon = new DataBase();
            Connection con = dbcon.connMethod();
            
            PreparedStatement ps = con.prepareStatement("select USERTYP from LOGINTBL where USERNAME=?");
            ps.setString(1, User);       
            ResultSet rs = ps.executeQuery();
            rs.next();
            String userType =rs.getString(1);

            if ("Admin".equals(userType)) {
                return "Admin_Page";
            } else {
                return "Order_Class";
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect",
                            "Retry"));
            return "Log_in";
        }
    }

    public String logout() {
        return "LoginPage";
    }
}  
    

