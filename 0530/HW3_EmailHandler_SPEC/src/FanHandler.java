public class FanHandler extends Handler {
    Handler nextHandler;

    public FanHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Email email) {
        if (email.type.equals("FAN")) {
            System.out.println("Forward to CEO.");
        }
        if (nextHandler != null) {
            nextHandler.handle(email);
        }
    }
}
