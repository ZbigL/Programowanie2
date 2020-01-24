package pl.sdaacademy.intermediate.basic.basic8FilesAndStreams;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class BookShortInfo {
    private String title;
    private String author;
    private int yearPublished;
}
