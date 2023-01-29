
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import static javax.swing.text.html.HTML.Attribute.TITLE;

@ManagedBean

public class Order {
private String title;
private String id;
private String username;
private String password;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

  
public void Ordere(){ 
    DataBase db=new DataBase();
    Connection con=db.connMethod();
        try{

    PreparedStatement ps=con.prepareStatement("insert into ORDERTBL(BOOKNAME,BOOKID,USERNAME,PASSWORD) values(?,?,?,?) ");
    ps.setString(1,title );
    ps.setString(2,id );
    ps.setString(3,username );
    ps.setString(4,password );
    ps.executeUpdate();   

           System.err.println("success");
        } catch ( SQLException e) {
        }
        
    }

}
 
