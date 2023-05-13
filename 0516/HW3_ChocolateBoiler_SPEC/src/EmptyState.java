public class EmptyState implements State{

    @Override
    public State fill() {
        System.out.println("Fill chocolate");
        return new FilledState();
    }

    @Override
    public State boil() {
        return this;
    }

    @Override
    public State drain() {
        return this;
    }
}
