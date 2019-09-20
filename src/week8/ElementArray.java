package week8;

public class ElementArray{
    public static void main(String[] args){
        MetalElement metalElementIron = new MetalElement("Fe", 26, 55.845);
        MetalElement metalElementCopper = new MetalElement("Cu", 29, 63.546);
        NonMetalElement nonMetalElementOxygen = new NonMetalElement("O", 8, 16);
        NonMetalElement nonMetalElementLithium = new NonMetalElement("Li", 3, 6.941);

        Element[] Elements = new Element[4];
        Elements[0] = metalElementIron;
        Elements[1] = metalElementCopper;
        Elements[2] = nonMetalElementOxygen;
        Elements[3] = nonMetalElementLithium;

        for (Element element : Elements) {
            System.out.println(element.describeElement());
        }
    }
}