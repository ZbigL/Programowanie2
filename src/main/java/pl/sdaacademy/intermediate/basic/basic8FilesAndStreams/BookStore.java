package pl.sdaacademy.intermediate.basic.basic8FilesAndStreams;

import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class BookStore {
    List<Book> books;

    BookStore() {
        this.books = (new BookStoreInitializer()).initBookStore();
    }

    List<Book> findBooksByTitle(String title) {
        return this.books.stream()
                .filter(book -> book.title.equals(title))
                .collect(Collectors.toList());
    }

    List<Book> findBooksByAuthor(String author) {
        return this.books.stream()
                .filter(book -> book.author.equals(author))
                .collect(Collectors.toList());
    }

    List<Book> findBooksByYearPublished(int year) {
        return this.books.stream()
                .filter(book -> book.yearPublished == year)
                .collect(Collectors.toList());
    }

    List<Book> findBooksByNumberOfPages(int numberOfPages) {
        return this.books.stream()
                .filter(book -> book.numberOfPages == numberOfPages)
                .collect(Collectors.toList());
    }

    List<Book> findBooksByPrice(double price) {
        return this.books.stream()
                .filter(book -> Double.valueOf(book.price).equals(Double.valueOf(price)))
                .collect(Collectors.toList());
    }

    List<Book> findBooksByGenre(Genre genre) {
        return this.books.stream()
                .filter(book -> book.genre.equals(genre))
                .collect(Collectors.toList());
    }


}


//    Napisz metody w klasie BookStore do zwrócenia list książek:
//        - do wyszukiwania książek po tytule
//        - do wyszukiwania ksiązek po autorze
//        - do wyszukiwania książek po roku wydania
//        - do wyszukiwania książek po liczbie stron
//        - do wyszukiwania książek po cenie
//        - do wyszukiwania książek po gatunku
//        Każda metoda powinna zwrócić listę wyszukanych książek.
