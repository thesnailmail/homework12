public class Book {
    String nameOfTheBook;
    Authors author;
    int yearOfPublish;

    public Book(String nameOfTheBook, Authors author, int yearOfPublish) {
        this.nameOfTheBook = nameOfTheBook;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
    }

    public String getNameOfTheBook() {
        return this.nameOfTheBook;
    }

    public String getAuthor() {
        return this.author.getFirstName() + " " + this.author.getLastName();
    }

    public int getYearOfPublish() {
        return this.yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }
}