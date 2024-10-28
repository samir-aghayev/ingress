package arrayTask2;

import java.util.Date;

public class Author {
    private String authorName;
    private Boolean isAlive;
    private String dateOfBirth;

    public Author() {
    }

    public Author(String authorName, Boolean isAlive, String dateOfBirth) {
        this.authorName = authorName;
        this.isAlive = isAlive;
        this.dateOfBirth = dateOfBirth;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Author{authorName='%s', isAlive=%s, dateOfBirth='%s'}".formatted(authorName, isAlive, dateOfBirth);
    }
}
