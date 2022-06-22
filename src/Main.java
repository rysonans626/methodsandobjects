public class Main {
    public static void main(String[] args) {
        Book Moomin = new Book("Moomin", "Toove Jansson", 1969);
        System.out.println("Moomin.name = " + Moomin.name);
        System.out.println("Moomin.author = " + Moomin.author);
        System.out.println("Moomin.getAge() = " + Moomin.getName());
        System.out.println("Moomin.getAge() = " + Moomin.getAuthor());
        Moomin.setAge(2000);
        System.out.println("Moomin.age = " + Moomin.age);
        Author Toove = new Author("Toove", "Jansson");
        System.out.println("Toove.Name = " + Toove.Name);
        System.out.println("Toove.LastName = " + Toove.LastName);
    }
}