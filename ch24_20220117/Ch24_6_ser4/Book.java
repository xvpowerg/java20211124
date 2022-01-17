package ch24_20220117.Ch24_6_ser4;
import java.io.Serializable;
public class Book implements Serializable{
    private String isbn;
    private String name; 

    public Book(String isbn, String name) {
        this.isbn = isbn;
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", name=" + name + '}';
    }
    
    
}
