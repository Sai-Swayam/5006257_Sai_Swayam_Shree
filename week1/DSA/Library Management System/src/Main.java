import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static int linearSearch(String book, ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).title.equals(book)) {
                System.out.println("Book is present at shell number " + i);
                return i;
            }

        }
        System.out.println("We currently dont have this book");
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, String target, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            int res = books.get(mid).title.compareTo(target);
            if (res == 0)
                return mid;
            else if (res < 0) {
                return binarySearch(books, target, mid + 1, end);
            }
            else
                return binarySearch(books, target, start, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Harry Potter and the Chamber of Secrets", "J.K. Rowling"));
        books.add(new Book(2, "Dune", "Frank Herbert"));
        books.add(new Book(3, "The Maze Runner", "James Dashner"));
        books.add(new Book(4, "The Da Vinci Code", "Dan Brown"));
        books.add(new Book(5, "Blade Runner", "Philip K. Dick"));
        books.add(new Book(6, "Jurassic Park", "Michael Crichton"));
        books.add(new Book(7, "Ready Player One", "Ernest Cline"));

        Collections.sort(books, (Book a, Book b) -> {
            return a.title.compareTo(b.title);
        });

        for (Book b : books) System.out.println(b.title);
        int i1 = linearSearch("Blade Runner", books);
        int i2 = binarySearch(books, "Harry Potter and the Chamber of Secrets", 0, books.size()-1);
        System.out.println(i1 + ", " + i2);
    }
}