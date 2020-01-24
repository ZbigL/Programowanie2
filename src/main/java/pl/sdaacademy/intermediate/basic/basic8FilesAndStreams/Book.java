package pl.sdaacademy.intermediate.basic.basic8FilesAndStreams;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Book {
    String title;
    String author;
    int yearPublished;
    int numberOfPages;
    double price;
    Genre genre;


}
