package TheScicilian;

public abstract class Product {
    private long cost = 0;
    protected boolean legal = true;

    public Cartel getSupplier() {
        return supplier;
    }

    protected void setCost(long cost) {
        this.cost = cost;
    }

    private Cartel supplier;

    public Product(Cartel supplier) {
        setSupplier(supplier);
    }

    public long getCost() {
        return cost;
    }

    protected void setSupplier(Cartel supplier) {
        this.supplier = supplier;
    }

    public boolean isLegal(){
        return legal;
    }

    public abstract short getQuality();

    public String toString(){
        return getName() + " costs " + getCost() + " declared as legal: " + isLegal() + " came from " + getSupplier();
    }

    protected abstract String getName();
}
