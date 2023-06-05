public class ChocolateBoiler {
    static ChocolateBoiler instance;
    private State emptyState = new EmptyState(this);
    private State filledState = new FilledState(this);
    private  State boiledState = new BoiledState(this);
    private State state;

    private ChocolateBoiler(){};
    public static ChocolateBoiler getInstance(){
        if(instance == null){
            instance = new ChocolateBoiler();
            instance.state = new EmptyState(instance);
        }
        return instance;
    }

    public void fill(){
        state.fill();
    }

    public void boil(){
        state.boil();
    }

    public void drain(){
        state.drain();
    }

    public State getEmptyState() {
        return this.emptyState;
    }

    public State getFilledState() {
        return this.filledState;
    }

    public State getBoiledState() {
        return this.boiledState;
    }

    public void setState(State state) {
        this.state = state;
    }
}
