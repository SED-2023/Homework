public class FilledState implements State{

    private ChocolateBoiler chocolateBoiler;

    public FilledState(ChocolateBoiler chocolateBoiler) {
        this.chocolateBoiler = chocolateBoiler;
    }
    @Override
    public void fill() {
        
    }

    @Override
    public void boil() {
        System.out.println("Boil chocolate");
        this.chocolateBoiler.setState(chocolateBoiler.getBoiledState());
    }

    @Override
    public void drain() {
        
    }
}
