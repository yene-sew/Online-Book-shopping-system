
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped

public class Delete_Class {
    private String bookid;

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }
    
    public void DeleteBook(){
   
   try{
     DataBase dbcon = new DataBase();
      Connection con = dbcon.connMethod();

        PreparedStatement ps = con.prepareStatement("Delete from ADDTBL where BOOKID=?");
         ps.setString(1, bookid);   
       
           ps.executeUpdate();
   }
   catch(Exception e){
   
   System.out.print(e);
   }
   
   }
}
