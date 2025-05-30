import java.util.ArrayList;

public class Library {
    
    private Book book;
    private ArrayList<Book> books = new ArrayList<Book>();

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String ISBN) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(ISBN)) {
                books.remove(i);
            }
        }
    }

    public Book[] searchBook(String title) {
        ArrayList<Book> find = new ArrayList<Book>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                find.add(book);
            }
            
        }
        Book[] arr = find.toArray(new Book [find.size()]);
            return arr;
    }

    public Book[] displayBooks() {
        Book[] arr = this.books.toArray(new Book [this.books.size()]);
        return arr;
    }

}

/**
 * 
Search for books by title (returning all matches) (searchBook, returns an array of books)
Display all books in the library (displayBooks, returns an array of books)
 */