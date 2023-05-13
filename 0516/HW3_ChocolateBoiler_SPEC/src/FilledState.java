public class FilledState implements BoilerState{

    @Override
    public BoilerState fill() {
        return this;
    }

    @Override
    public BoilerState boil() {
        return new BoiledState();
    }

    @Override
    public BoilerState drain() {
        return this;
    }
}
