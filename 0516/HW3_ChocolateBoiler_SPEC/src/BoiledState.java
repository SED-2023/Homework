public class BoiledState implements State{

    private ChocolateBoiler chocolateBoiler;

    public BoiledState(ChocolateBoiler chocolateBoiler) {
        this.chocolateBoiler = chocolateBoiler;
    }
    @Override
    public void fill() {
        
    }

    @Override
    public void boil() {
        
    }

    @Override
    public void drain() {
        System.out.println("Drain the boiled chocolate");
        this.chocolateBoiler.setState(chocolateBoiler.getEmptyState());
    }
}
