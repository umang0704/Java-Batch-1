 
package oops;
class Book{
    private String bookName;
    private int bookPrice;
    private String authorName;
    
    public void setBookName(String name){
        bookName = name;
    }
    public void setBookPrice(int price){
        bookPrice = price;
    }
    public void setBookAuthor(String name){
        authorName = name;
    }
    
    public String getBookName(){
        return bookName;
    }
    
    public int getBookPrice(){
        return bookPrice;
    }
    
    public String getAuthorName(){
        return authorName;
    }
}
 
public class OOP_Practice1 {
    public static void main(String[] args) {
        Book obj = new Book(); 
        obj.setBookName("History");
        obj.setBookPrice(100);
        obj.setBookAuthor("XYZ");
        System.out.println(obj.getBookName());
        System.out.println(obj.getBookPrice());
        System.out.println(obj.getAuthorName()); 
   }
}
