public class Book {
    private String name;
    private Author author;
    private int age;

    public Book(String name, Author author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
