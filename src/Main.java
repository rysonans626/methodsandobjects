public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Toove", "Jansson");
        Author author2 = new Author("Fedor", "Dostoevskiy");
        Book book1 = new Book("Moomin", author1, 1969);
        Book book2 = new Book("Idiot", author2, 1867);
        System.out.println(book1.getName() + " " + book1.getAuthor().getName() + " " + book1.getAuthor().getLastName()+ " " + book1.getAge());
        System.out.println(book2.getName() + " " + book2.getAuthor().getName() + " " + book2.getAuthor().getLastName()+ " " + book2.getAge());
        book1.setAge(2004);
        System.out.println("изменненая дата публикации первой книги - " + book1.getAge());
    }
}