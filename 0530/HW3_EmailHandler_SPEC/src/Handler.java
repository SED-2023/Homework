public abstract class Handler {
    Handler nextHandler;

    public void handle(){};

    public abstract void handle(Email email);
}
