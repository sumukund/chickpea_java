// sudarsna mukund
// itc 2100 WK 11

// SAME AS METAL ELEMENT
public class NonMetalElement extends Element
{
    public NonMetalElement(String acronym, int atomicNum, double atomicWeight)
    {
        super(acronym, atomicNum, atomicWeight);
    }

    @Override
    public void describeElement()
    {
        super.displayMessage();
        System.out.println("PROPERTIES of NON-METALLIC ELEMENTS:" + acronym);
        System.out.println("\n non-Lustrous \n non-Malleable \n Poor Conductors \n Oxides are acidic, covalent \n Anions \n non-Ductile");
    }
}