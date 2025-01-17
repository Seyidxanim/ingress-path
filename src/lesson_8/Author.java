package lesson_8;

public class Author {
    private String authorName;

    private boolean isAlive;

    private String dateOfBirth;


    public Author(String authorName, boolean isAlive, String dateOfBirth) {
        this.authorName = authorName;
        this.isAlive = isAlive;
        this.dateOfBirth = dateOfBirth;
    }

    String getAuthorName() {
        return authorName;
    }

    boolean getIsAlive() {
        return isAlive;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    @Override
    public String toString() {
        return "authorName: " + authorName + "," + " isAlive: " + isAlive + "," + " dataOfBirth: " + dateOfBirth;
    }
}
