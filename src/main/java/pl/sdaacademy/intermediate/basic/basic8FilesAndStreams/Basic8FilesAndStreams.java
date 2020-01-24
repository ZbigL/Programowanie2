package pl.sdaacademy.intermediate.basic.basic8FilesAndStreams;

import java.util.List;
import java.util.stream.Collectors;

public class Basic8FilesAndStreams {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        List<String> allAuthors = bookStore.getBooks().stream()
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(allAuthors);

        int numberAllBooksOfAuthor = bookStore.findBooksByAuthor("Harlan Coben").size();
        System.out.println("number books Of Coben: " + numberAllBooksOfAuthor);

        double costFantasyOfNinetiesExpensiveThan40 = bookStore.findBooksByGenre(Genre.FANTASY).stream()
                .filter(book -> book.getYearPublished() >= 1990 && book.getYearPublished() <= 1999)
                .filter(book -> book.getPrice() > 40)
                .mapToDouble(Book::getPrice)
                .sum();
        System.out.println("costFantasyOfNinetiesExpensiveThan40  : " + costFantasyOfNinetiesExpensiveThan40);

        List<BookShortInfo> crimeOfCobenThinnerThan300 = bookStore.findBooksByGenre(Genre.CRIME_STORY).stream()
                .filter(book -> book.getAuthor().equals("Harlan Coben"))
                .filter(book -> book.getNumberOfPages() <= 300)
                .skip(2)
                .map(book -> BookShortInfo.builder()
                        .title(book.getTitle())
                        .author(book.getAuthor())
                        .yearPublished(book.getYearPublished())
                        .build())
                .collect(Collectors.toList());
        System.out.println("crimeOfCobenThinnerThan300 : " + crimeOfCobenThinnerThan300);

    }
}

//    W klasie Basic8FilesAndStreams utwórz obiekt BookStore, a następnie (wykorzystując kolejne operacje na strumieniach),
//    wypisz na konsolę:
//        - wszystkich autorów
//        - liczbę wszystkich książek danego autora
//        - łączny koszt książek FANTASY wydanych w latach 90, droższych niż 40zł.
//        - wszystkie książki z gatunku CRIME_STORY, których autorem jest Harlan Coben,
//          ale nie są grubsze niż 300 stron, za wyjątkiem pierwszych dwóch książek takich książek; następnie każdą ze znalezionych książek
//          zaprezentuj jako obiekt typu BookShortInfo (przekształć 1 obiekt w 2).