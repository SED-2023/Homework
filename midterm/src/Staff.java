import java.util.ArrayList;
import java.util.Map;

public class Staff extends User{

    public String type = "Staff";
    public Staff(String name) {
        this.name = name;
    }
    @Override
    public void addBook(BookSystem bookSystem, String author, String subject) {
        bookSystem.addBook(author, subject);
    }

    @Override
    public void removeBook(BookSystem bookSystem, int bookId) {
        bookSystem.removeBook(bookId);
    }

    @Override
    public void listBorrower(BookSystem bookSystem, int bookId) {
        bookSystem.listBorrower(bookId);
    }

    @Override
    public void findChecked(User user2) {
        // TODO: sout need to sort by book id
        if (user2.borrowedBooks.size() == 0) {
            return;
        }
        for(Map.Entry<Integer, Book> u: user2.borrowedBooks.entrySet()){
            System.out.println("ID: " + u.getValue().id + " Author: " + u.getValue().author + " Subject: " + u.getValue().subject);
        }
    }

    @Override
    public void returnBook(String userName, int bookId, BookSystem bookSystem, User user2) {
        Book book = bookSystem.getBook(bookId);
        if (bookSystem.checkBookExist(bookId) == false){
            System.out.println("Can not return since the book is not exist");
            return;
        }
        bookSystem.getBook(bookId).isCheckedOut = false;
        user2.borrowedBooks.remove(bookId, book);
    }

    @Override
    public void checkOut(User user1, User user2, ArrayList<Integer> borrowBookList, BookSystem bookSystem) {
        if ( borrowBookList.size() <= user2.predefinedBorrowBookNumber - user2.borrowedBooks.size() + 1){
            for (int i: borrowBookList){
                if ( bookSystem.checkBookExist(i) == false ){
                    System.out.println("Can not check out since the book is checked out");
                    return;
                }
            }
            for (int id: borrowBookList){
                Book book = bookSystem.getBook(id);
                book.lastCheckoutUser = user2.name;
                user2.borrowedBooks.put(id, book);
            }
        } else {
            System.out.println("Can not check out since the number of books exceed the limitation of user can check-out");
        }
    }
}
