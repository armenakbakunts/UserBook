package smallProject.storage;

import smallProject.model.Book;

public class BookStorage {

    private Book[] books = new Book[10];

    private int size = 0;

    public void add(Book book) {
        if (size >= books.length)
            extend();
        books[size] = book;
        size++;
    }


    private void extend() {
        Book[] newBookList = new Book[books.length + 5];
        for (int i = 0; i < books.length; i++) {
            newBookList[i] = books[i];
        }
        books = newBookList;
    }
}
