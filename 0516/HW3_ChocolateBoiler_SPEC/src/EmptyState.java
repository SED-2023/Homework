public class EmptyState implements State{

    private ChocolateBoiler chocolateBoiler;

    public EmptyState(ChocolateBoiler chocolateBoiler) {
        this.chocolateBoiler = chocolateBoiler;
    }
    @Override
    public void fill() {
        System.out.println("Fill chocolate");
        this.chocolateBoiler.setState(chocolateBoiler.getFilledState());
    }

    @Override
    public void boil() {
        
    }

    @Override
    public void drain() {
        
    }
}
