public class BoiledState implements BoilerState{

    @Override
    public BoilerState fill() {
        return this;
    }

    @Override
    public BoilerState boil() {
        return this;
    }

    @Override
    public BoilerState drain() {
        return new EmptyState();
    }
}
