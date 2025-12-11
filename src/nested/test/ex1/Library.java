package nested.test.ex1;

public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.count = 0;
    }

    void addBook(String title, String author) {

        if (this.count >= this.books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        this.books[count++] = new Book(title, author);
    }

    void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book1 : this.books) {
            System.out.println("도서 제목: " + book1.title +
                    ", 저자 : " + book1.author);
        }
    }

    private static class Book {

        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    }
}
