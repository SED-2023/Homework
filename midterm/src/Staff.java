import java.util.ArrayList;

public class Staff extends User{

    public Staff(String name) {
        this.name = name;
    }
    @Override
    public void addBook(String userName, String author, String subject) {
        bookSystem.addBook(author, subject);
    }

    @Override
    public void removeBook(String userName, int bookId) {
        bookSystem.removeBook(bookId);
    }

    @Override
    public void listBorrower(String userName, int bookId) {
        bookSystem.listBorrower(bookId);
    }

    @Override
    public void findChecked(User user1, User user2) {
        // TODO: sout need to sort by book id
        for (var entry: borrowedBooks) {
            System.out.println("ID: " + entry.id + " Author: " + entry.author + " Subject: " + entry.subject);
        }
    }

    @Override
    public void returnBook(String userName, int bookId) {

    }

    @Override
    public void checkOut(Staff user1, Borrower user2, ArrayList<Integer> borrowBookList) {
        if ( borrowBookList.size() <= user2.predefinedBorrowBookNumber - user2.borrowedBooks.size()){
            for (int i: borrowBookList){
                if ( bookSystem.checkBookExist(i) == False ){
                    System.out.println("Can not check out since the book is checked out");
                    return;
                }
            }
            for (int id: borrowBookList){
                Book book = bookSystem.getBook(id);
                user2.borrowedBooks.put(id, book);
            }
        } else {
            System.out.println("Can not check out since the number of books exceed the limitation of user can check-out");
        }
    }
}
