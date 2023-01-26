
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Display_Manage {
   public List<Display_Java>list;
   public List<Display_Java>getlist() throws ClassNotFoundException, SQLException{
       list=new ArrayList<>();
       
       try{
           Statement st;
           
           DataBase dbc = new DataBase();
           Connection con=dbc.connMethod();
           
           st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from ADDTBL");
           while(rs.next()){
               String var1=rs.getString("BOOKNAME");
               String var2=rs.getString("AUTHORNAME");
               String var3=rs.getString("PRICE");
               String var4=rs.getString("CATEGORY");
               
               list.add(new Display_Java(var1,var2,var3,var4));

           }
       }
       catch(SQLException ex){
           
       }
       return list;
   }
}
