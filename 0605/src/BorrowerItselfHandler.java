import java.util.ArrayList;
import java.util.Arrays;

public class StaffHandler extends Handler {
    public boolean handle(Transaction transaction) {
        if (allow(transaction)) {
            return true;
        } else {
            return super.handle(transaction);
        }
    }

    private boolean allow(Transaction transaction) {
        if (!transaction.getUser() instanceof Staff) return false;
        return !(transaction.getAction().equals("checkout"));
    }
}
