import java.util.List;

public class Author {
    private int id;
    private String name;
    private String lastName;

    private Book book;

   // private List<Book> books;
// tight coupling
    public Author(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", book=" + book +
                '}';
    }
}
