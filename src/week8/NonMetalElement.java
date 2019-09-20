package week8;

public class NonMetalElement extends Element {

    NonMetalElement(String Symbol, int AtomicNum, double AtomicWeight) {
        super(Symbol, AtomicNum, AtomicWeight);
    }

    @Override
    String describeElement() {
        return (" Symbol: " + getSymbol() + " atomicNum: " + getAtomicNum() + " atomicWeight: " + getAtomicWeight() + " Bad conductor ");
    }
}
