package TheScicilian;

import java.util.Random;

public class MerchFactory extends ProductFactory<Pizza>{
    private Random rand;
    public MerchFactory(Cartel c){
        super(c);
        rand = new Random();

    }
    @Override
    public Pizza create() {
        if(rand.nextBoolean()) {
            return new Pizza(getSource());
        }else{
            return new IllegalPizza(getSource());
        }
    }

    @Override
    public long getPrice() {
        return 16;
    }
}
