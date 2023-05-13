public class ChocolateBoiler {
    static ChocolateBoiler instance;
    private State state;
    private ChocolateBoiler(){};
    public static ChocolateBoiler getInstance(){
        if(instance == null){
            instance = new ChocolateBoiler();
            instance.state = new EmptyState();
        }
        return instance;
    }

    public void fill(){
        state = state.fill();
    }

    public void boil(){
        state = state.boil();
    }

    public void drain(){
        state = state.drain();
    }
}
