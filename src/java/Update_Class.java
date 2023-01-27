
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class Update_Class {
        private String book;
    private String author;
    private String price;
    private String category;
    private String bookid;

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }
   public void upDateMethod(){
      try{
      
       DataBase dbcon = new DataBase();
            Connection con = dbcon.connMethod();
       
          String sql = "UPDATE ADDTBL SET bookname=?, authorNAME=?, price=?, category=? WHERE bookid=?";
           
             PreparedStatement ps = con.prepareStatement(sql);
          
           ps.setString(1, book);
           ps.setString(2, author);     
           ps.setString(3, price);
           ps.setString(4, category);
           ps.setString(5, bookid);
           ps.executeUpdate();        
      
      }
      catch(SQLException e )    
      {
      
      System.out.print(e);
      
      }
    
   }
}

    

