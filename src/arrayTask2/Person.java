package arrayTask2;

import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private List<Book> books;
    private Integer age;


    public Person() {
    }

    public Person(String name, List<Book> books, Integer age) {
        this.name = name;
        this.books = books;
        this.age = age;
    }


    public boolean addBook(Book book) {
        if (book.getForSale()) {
            books.add(book);
            return true;
        }
        return false;
    }

    public boolean deleteBook(String bookName) {
        for (Book book : books) {
            if (book.getBookName().equals(bookName)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    public Book findBookWithMaxPageCount() {
        if (!books.isEmpty()) {
            Collections.sort(books);
           return books.getLast();
        }
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='%s', books=%s, age=%d}".formatted(name, books, age);
    }
}
