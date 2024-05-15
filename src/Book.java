public class Book {
    private final String name;
    private final Author author;
    private int publicationYear;

    public Book(String name, int publicationYear, Author author) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString (){
        return "Название книги: " + name + ", год публикации: " + publicationYear + ", автор: " + author;
    }
}