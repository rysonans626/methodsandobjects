import java.time.Year;

public class Book {
    String name;
    String author;
    int age;
    public  Book (String name, String author, int age){
        this.name = name;
        this.author = author;
        this.age= age;
    }
    public String getName() {
        return this.name;
    }
    public int getAuthor(){
        return this.age;
    }
    public void setAge (int age){
        this.age = age;
    }
}
