public class ComplaintHandler extends Handler {
    Handler nextHandler;

    public ComplaintHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Email email) {
        if (email.type.equals("COMPLAINT")) {
            System.out.println("Forward to legal department.");
        }
        if (nextHandler != null) {
            nextHandler.handle(email);
        }
    }
}
