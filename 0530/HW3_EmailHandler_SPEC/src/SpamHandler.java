public class SpamHandler extends Handler {
    Handler nextHandler;

    public SpamHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Email email) {
        if (email.type.equals("SPAM")) {
            System.out.println("Put mail to the spam box.");
        }
        if (nextHandler != null) {
            nextHandler.handle(email);
        }
    }
}
