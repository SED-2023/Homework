public abstract class Handler {
    private Handler successor;
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public boolean handle(Transaction transaction) {
        if(successor != null)
            return successor.handle();
        else
            return false;
    }

}
