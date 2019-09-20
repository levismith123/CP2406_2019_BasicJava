package week8;

public class MetalElement extends Element {

    MetalElement(String Symbol, int AtomicNum, double AtomicWeight) {
        super(Symbol, AtomicNum, AtomicWeight);
    }

    @Override
    String describeElement() {
        return (" Symbol: " + getSymbol() + " atomicNum: " + getAtomicNum() + " atomicWeight: " + getAtomicWeight() + " Good conductor ");
    }
}
