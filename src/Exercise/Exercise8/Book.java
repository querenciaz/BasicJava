package Exercise.Exercise8;

public abstract class Book {

    private int number;
    private String title;
    private String author;
    private static int countOfBooks = 1;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        number = countOfBooks;
        countOfBooks++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Book) {
            return false;
        }
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author);
        // return this.title.equals(((Book) obj).getTitle())
        //      && this.author.equals(((Book) obj).getAuthor());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public abstract int getLateFee(int lateDays);

    public String toString() {
        return String.format("관리번호 : %d번, 제목: %s, 작가: %s(일주일 연체료: %,d원)", number, title, author, getLateFee(7));
    }
    // d = 숫자, s = 문자, f = 부동소수점
}

