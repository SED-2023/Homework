import java.util.ArrayList;
import java.util.Arrays;

public class BorrowerHandler extends Handler {
    public boolean handle(Transaction transaction) {
        if(allow(transaction)) {
            return true;
        }
        else {
            return super.handle(transaction);
        }
    }

    private boolean allow(Transaction transaction){
        if (!(transaction.getUser() instanceof Borrower)) return false;
        String[] allowActions={"findCheckout", "listAuthor", "listSubject"};
        ArrayList<String> actions = new ArrayList<String>(Arrays.asList(allowActions));
        return actions.contains(transaction.getAction());
    }
}
