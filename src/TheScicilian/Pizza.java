package TheScicilian;

public class Pizza extends Product{

    public Pizza(Cartel c) {
        super(c);
        this.setCost(15);
    }

    @Override
    public short getQuality() {
        return 10;
    }

    @Override
    protected String getName() {
        return "pizza pie";
    }
}