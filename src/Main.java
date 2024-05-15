public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Тилли", "Коул");
        Book book1 = new Book("Тысяча поцелуев, которые невозможно забыть", 2020, author1);

        System.out.println(book1);

        Author author2 = new Author("Тилли", "Коул");
        if (author1.equals(author2)) {
            System.out.println("Авторы одинаковые");
        } else {
            System.out.println("Авторы разные");
        }

        Book book2 = new Book("Тысяча поцелуев, которые невозможно забыть", 2024, author1);
        if (book1.equals(book2)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }

        System.out.println("Хэш код автора: " + author1.hashCode());

        System.out.println("Хэш код книги: " + book2.hashCode());
    }
}