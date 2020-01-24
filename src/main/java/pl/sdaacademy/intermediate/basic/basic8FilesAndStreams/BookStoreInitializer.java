package pl.sdaacademy.intermediate.basic.basic8FilesAndStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BookStoreInitializer {

    public List<Book> initBookStore() {
        List<Book> booksList = new ArrayList<>();
        String filePath = getClass().getClassLoader().getResource("books.txt").getFile();
        File booksFile = new File(filePath);
        try {
            Scanner scanner = new Scanner(booksFile);
            while (scanner.hasNextLine()) {
                String bookLine = scanner.nextLine();
                StringTokenizer st = new StringTokenizer(bookLine, "|");
                String title = st.nextToken();
                String author = st.nextToken();
                int yearPublished = Integer.valueOf(st.nextToken());
                int numberOfPages = Integer.valueOf(st.nextToken());
                double price = Double.valueOf(st.nextToken());
                Genre genre = Genre.valueOf(st.nextToken());
                Book book = Book.builder()
                        .title(title)
                        .author(author)
                        .yearPublished(yearPublished)
                        .numberOfPages(numberOfPages)
                        .price(price)
                        .genre(genre)
                        .build();
                booksList.add(book);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return booksList;
    }
}
