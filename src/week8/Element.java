package week8;

public abstract class Element {
    private String symbol;
    private int atomicNum;
    private double atomicWeight;

    Element(String Symbol, int AtomicNum, double AtomicWeight){

        symbol = Symbol;
        atomicNum = AtomicNum;
        atomicWeight = AtomicWeight;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNum() {
        return atomicNum;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    abstract String describeElement();
}
