
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Order_Manage {
   public List<Order_Java>list;
   public List<Order_Java>getlist() throws ClassNotFoundException, SQLException{
       list=new ArrayList<>();
       
       try{
           Statement st;
           
           DataBase dbc = new DataBase();
           Connection con=dbc.connMethod();
           
           st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from ORDERTBL");
           while(rs.next()){
               String var11=rs.getString("BOOKNAME");
               String var21=rs.getString("BOOKID");
               String var31=rs.getString("USERNAME");
               String var41=rs.getString("PASSWORD");

               
               list.add(new Order_Java(var11,var21,var31,var41));

           }
       }
       catch(SQLException ex){
           
       }
       return list;
       
   }
   
}
