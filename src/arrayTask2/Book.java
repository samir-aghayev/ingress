package arrayTask2;

import java.util.*;

public final class Book implements Comparable<Book> {
    private final List<Author> authors;
    private final String bookName;
    private final Integer pageCount;
    private final Boolean isForSale;
    private final String description;



    public Book(List<Author> authors, String bookName, Integer pageCount, Boolean isForSale, String description) {
        this.authors = List.copyOf(authors);
        this.bookName = bookName;
        this.pageCount = pageCount;
        this.isForSale = isForSale;
        this.description = description;
    }

    public List<Author> getAuthors() {
        return List.copyOf(authors);
    }

    public String getBookName() {
        return bookName;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public Boolean getForSale() {
        return isForSale;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Book{authors=%s, bookName='%s', pageCount=%d, isForSale=%s, description='%s'}".formatted(authors, bookName, pageCount, isForSale, description);
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.pageCount, o.pageCount);
    }
}
