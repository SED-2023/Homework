public class FilledState implements State{

    @Override
    public State fill() {
        return this;
    }

    @Override
    public State boil() {
        System.out.println("Boil chocolate");
        return new BoiledState();
    }

    @Override
    public State drain() {
        return this;
    }
}
