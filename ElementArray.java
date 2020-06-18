// sudarsna mukund
// itc 2100 WK 11


public class ElementArray{
// main method
    public static void main (String[] args)
    {
    MetalElement gold = new MetalElement("Au", 79, 196.7);
    // MetalElement silver = new MetalElement();
    //   NonMetalElement carbon = new NonMetalElement();
    //   NonMetalElement hydrogen = new NonMetalElement();
      
      gold.setAcronym("Au");
    //   silver.setAcronym("Ag");
    //   carbon.setAcronym("C");
    //   hydrogen.setAcronym("H");

      gold.setAtomicNum(79);
    //   silver.setAtomicNum(47);
    //   carbon.setAtomicNum(6);
    //   hydrogen.setAtomicNum(1);

      gold.setAtomicWeight(196.97);
    //   silver.setAtomicWeight(107.87);
    //   carbon.setAtomicWeight(12.01);
    //   hydrogen.setAtomicWeight(1.01);

    String[] names = {"gold", "silver", "carbon", "hydrogen"};
    int[] numbers = {79, 47, 6, 1};
    double[] weight = {196.97, 107.87, 12.01, 1.01};
// instantiating the new array

        int x;
        Element[] elementRef = new Element[4]; 
        elementRef[0] = new MetalElement("Ag", 79, 196.97);
        elementRef[1] = new MetalElement("Au", 47, 107.87);
        elementRef[2] = new NonMetalElement("C", 6, 12.01);
        elementRef[3] = new NonMetalElement("H", 1, 1.01);
// loop w LCV
StringBuffer outString = new StringBuffer();
        for(x = 0; x < elementRef.length; ++x)
        {
           elementRef[x].describeElement();
           outString.append("\n#" + (x + 1) + " "); 
           outString.append(elementRef[x].toString());

        }
    }
}