package smallProject.service;

import smallProject.model.Book;
import smallProject.model.User;
import smallProject.storage.BookStorage;

public class BookService {

    private final BookStorage bookStorage = new BookStorage();

    public void add(Book book) {
        bookStorage.add(book);
    }

    public Book[] getByUser(User currentUser) {
        return bookStorage.userBooks(currentUser);
    }
  public void AllBook(){
        bookStorage.AllBook();
  }

}