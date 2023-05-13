public class BoiledState implements State{

    @Override
    public State fill() {
        return this;
    }

    @Override
    public State boil() {
        return this;
    }

    @Override
    public State drain() {
        System.out.println("Drain the boiled chocolate");
        return new EmptyState();
    }
}
