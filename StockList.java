import java.util.ArrayList;
/**
 * Using arrayLists, enhanced for loops, etc, it finds the ticker name, price of it, and in order
 *
 * @author Umasathvik Pantham
 * @version 04/12/2021
 */
public class StockList
{
    private ArrayList<Stock> stockList;

    /**
     * Constructor for objects of class FrogList
     */
    public StockList()
    {
        stockList = new ArrayList<Stock>();
    }

    /**
     * adds the new stock to the arrayList
     * @param s stock input
     */
    public void add(Stock s)
    {
        stockList.add(s);
    }
    
    /**
     * Swaps the stock tickers 
     * @param index1 the first index of the stocklist
     * @param index2 the second index of the stocklist
     */
    public void swap(int index1, int index2) 
    {
        if (index1 < 0 || index1 >= stockList.size()) {
            return;   
        }
        
        if (index2 < 0 || index2 >= stockList.size()) {
            return;   
        }
        
        Stock temp = stockList.get(index1);
        stockList.set(index1, stockList.get(index2));
        stockList.set(index2, temp);
    }
    
    /**
     * Gives us the cheapest stock there is
     *
     * @return the cheapest stock there is
     */
    public String cheapest() 
    {
        Stock cheapestStockSoFar = new Stock("", Integer.MAX_VALUE);
        for (Stock s: stockList)
        {
            if (s.getPrice() < cheapestStockSoFar.getPrice()) {
                cheapestStockSoFar = s;
            }
        }
        return cheapestStockSoFar.getSymbol();
    }
    
    /**
     * Gives us the cheapest stock there is
     *
     * @return  the string returned from calling the toString() method on the list.
     */
    public String toString()
    {
        return stockList.toString();
    }
}
