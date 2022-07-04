package smallProject.storage;

import smallProject.model.Book;

public class
UserBookStorage {
    Book[] userBook = new Book[10];
    private int index = 0;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void add2(Book book) {
        if (index >= userBook.length)
            extend2();
        userBook[index] = book;
        index++;
    }


    private void extend2() {
        Book[] newBookList = new Book[userBook.length + 5];
        for (int i = 0; i < userBook.length; i++) {
            newBookList[i] = userBook[i];
        }
        userBook = newBookList;
    }

}
