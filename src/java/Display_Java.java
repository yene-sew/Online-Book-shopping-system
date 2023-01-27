
public class Display_Java {
        private String book;
        private String author;
        private String price;
        private String category;
        private String bookid;
        
    public String getBook() {
        return book;
    }
      public String getBookid() {
        return bookid;
    }
   

    public String getAuthor() {
        return author;
    }
   
    public String getPrice() {
        return price;
    }
   

    public String getCategory() {
        return category;
    }
    

    


public Display_Java(String book,String author,String price,String category,String bookid){
    this.book=book;
    this.author=author;
    this.price=price;
    this.category=category;
    this.bookid=bookid;

}
}