import java.util.ArrayList;

public class Staff extends User{
    @Override
    public void addBook(String userName, String author, String subject) {

    }

    @Override
    public void removeBook(String userName, int bookId) {

    }

    @Override
    public void listBorrower(String userName, int bookId) {

    }

    @Override
    public void findChecked(String userName, int bookId) {

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
            for (int i: borrowBookList){
                Book book = bookSystem.getBook(id);
                user2.borrowedBooks.put(id, book);
            }
        } else {
            System.out.println("Can not check out since the number of books exceed the limitation of user can check-out");
        }
    }
}
