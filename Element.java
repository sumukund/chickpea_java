// sudarsna mukund
// itc 2100 WK 11

// abstract class
public abstract class Element
{
    //the three variables
    public String acronym;
    public int atomicNum;
    public double atomicWeight;
//abstract method
    public abstract void describeElement();
// constructor
    public Element(String acronym, int atomicNum, double atomicWeight)
    {
        setAcronym(this.acronym);
        setAtomicNum(this.atomicNum);
        setAtomicWeight(this.atomicWeight);

    }
    // get and set
    public String getAcronym()
    {
        return this.acronym;
    }
    public void setAcronym(String acronym)
    {
        acronym = this.acronym;
    }


    public int getAtomicNum()
    {
        return this.atomicNum;
    }
    public void setAtomicNum(int atomicNum)
    {
        atomicNum = this.atomicNum;
    }

    public double getAtomicWeight()
    {
        return this.atomicWeight;
    }
    public void setAtomicWeight(double atomicWeight)
    {
        atomicWeight = this.atomicWeight;
    }
// display message 1
    public final void displayMessage()
    {
       System.out.println(" Element " + this.acronym +
          " Atomic Number " + this.atomicNum + " Atomic Weight " + this.atomicWeight);
    }

}