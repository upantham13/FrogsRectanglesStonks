import java.util.ArrayList;
/**
 * Using ArrayLists, the program finds the weight, legs, and number of frogs between certain conditions.
 *
 * @author Umasathvik Pantham
 * @version 04/11/2021
 */
public class FrogList
{
    // instance variables - replace the example below with your own
    private ArrayList<Frog> frogList;

    /**
     * Constructor for objects of class FrogList
     * 
     */
    public FrogList()
    {
        frogList = new ArrayList<Frog>();
    }

    /**
     * @param frog is added to the arraylist
     */
    public void add(Frog frog)
    {
        frogList.add(0, frog);
    }
    
    /**
     * @param index the index of the frog
     * @return index of the frogList or null
     */
    public Frog get(int index)
    {
        if (frogList.size() > index && index >= 0)
        {
            return frogList.get(index);
        }
            
        else
        {
            return null;
        }        
    }
    
    /**
     * @return number of frogs between lowLimit and highLimit.
     * @param lowLimit the lowest limit of the weight
     * @param highLimit the highest limit of the weight
     */
    public int countInRange(int lowLimit, int highLimit) 
    {
        int numFrogs = 0;
        for (Frog frog: frogList) 
        {
            int weight = frog.getWeight();
            if (lowLimit <= weight && highLimit >= weight)
            {
                numFrogs++;
            }
        }
        return numFrogs;
    }
    
    /**
     * @return  the string returned from calling the toString() method on the list.
     */
    public String toString()
    {
        return frogList.toString();
    }
}
