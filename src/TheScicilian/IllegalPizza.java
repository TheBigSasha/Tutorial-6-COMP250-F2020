package TheScicilian;

public class IllegalPizza extends Pizza implements Illegal{
    public IllegalPizza(Cartel c){
        super(c);
        this.legal = false;
    }

    //This one is sneaky!
    public IllegalPizza(Cartel c, boolean sneaky){
        super(c);
        this.legal = sneaky;    //Claims its legal if its sneaky!
    }

    @Override
    public String commitCrime() {
        return "I dislike bubble tea.";
    }

    public String toString(){
        return super.toString() + " is secretly illegal :p ";
    }
}
