
public class Order_Java {
        private String title;
        private String id;
        private String user;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
  
    

    


public Order_Java(String title,String id,String user,String password){
    this.title=title;
    this.id=id;
    this.user=user;
    this.password=password;

}
}