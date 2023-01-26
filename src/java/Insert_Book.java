
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Insert_Book {
    private String book;
    private String author;
    private String price;
    private String category;

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
    public void addbook(){
        
    
    DataBase dbc = new DataBase();
    Connection con=dbc.connMethod();
    try{
        String sql="insert into ADDTBL(BOOKNAME,AUTHORNAME,PRICE,CATEGORY) values(?,?,?,?)";
        PreparedStatement prst=con.prepareStatement(sql);
        prst.setString (1, book);
        prst.setString (2, author);
        prst.setString (3, price);
        prst.setString (4, category);
        prst.execute();
        System.err.println("yessss");       
    } catch(SQLException e)
    {
    }
    
}
}
