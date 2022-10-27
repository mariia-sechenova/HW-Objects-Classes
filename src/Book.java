public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = "KGBT";
        this.author = "Pelevin";
        this.year = Integer.parseInt("2022");
    }

    public Book(int year, String author) {
        this.year = year;
        this.author = author;
        System.out.println(this.year + " " + this.author);
    }

    public int getYear(int year) {

        return year;
    }

    public void setYear() {

        this.year = this.year;
    }

    public String getAuthor() {

        return this.author;
    }

    public void setAuthor() {

        this.author = this.author;
    }

    public String getTitle() {

        return this.title;
    }

    public void setTitle() {

        this.title = this.title;
    }

    private class Author {
        private final Author author;

        private Author(Author author) {

            this.author = author;
        }
    }
}
