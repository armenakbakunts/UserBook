package smallProject.storage;
import smallProject.model.Book;
import smallProject.model.User;

public class BookStorage {
UserBookStorage uBS=new UserBookStorage();
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

    public Book[] userBooks(User currentUser){
        uBS.setIndex(0);
        for (int i = 0; i < uBS.userBook.length; i++) {
            uBS.userBook[i]=null;
        }
        for (int i = 0; i < size; i++) {
            if(currentUser.getEmail().equals(books[i].getAuthor().getEmail())) {
                uBS.add2(books[i]);
            }
        }
        return uBS.userBook;
    }
    public void AllBook() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }
}