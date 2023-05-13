public class EmptyState implements BoilerState{

    @Override
    public BoilerState fill() {
        System.out.println("Fill chocolate");
        return new FilledState();
    }

    @Override
    public BoilerState boil() {
        return this;
    }

    @Override
    public BoilerState drain() {
        return this;
    }
}
