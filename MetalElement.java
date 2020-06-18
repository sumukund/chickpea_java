// sudarsna mukund
// itc 2100 WK 11

// subclass
public class MetalElement extends Element
{
// super constructor
    public MetalElement(String acronym, int atomicNum, double atomicWeight)
    {
        super(acronym, atomicNum, atomicWeight);
    }
// using the abstract class
    
    public void describeElement()
    {
           System.out.println(" Element " + this.acronym +
              " Atomic Number " + this.atomicNum + " Atomic Weight " + this.atomicWeight);
        System.out.println("PROPERTIES of METALLIC ELEMENTS:");
        System.out.println("\n Lustrous \n Malleable \n Conductors \n Oxides are basic, ionic \n Cations \n Ductile");
    }
}