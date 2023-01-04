import java.util.Scanner;
import java.util.Random;
/**
 * Draws rectangles and fills in the smallest one with the color yellow.
 *
 * @author Umasathvik Pantham
 * @version 04/10/2021
 */
public class RandomRectangles
{
    public static final int MAX_X = 100;
    public static final int MAX_Y = 500;
    public static final int MIN_WIDTH = 30;
    public static final int MAX_WIDTH = 100;
    public static final int MIN_HEIGHT = 20;
    public static final int MAX_HEIGHT = 80;
    public static final int GENERATOR_SEED = 202104;

    public static void main (String[] args)
    {
        Random generator = new Random(GENERATOR_SEED);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer for the number of rectangles: ");
        while (in.hasNext())
        {
            if (!in.hasNextInt())
            {
                String stringInput = in.next();
                System.out.println("Not an integer: \"" + stringInput + "\"" + ".");
                System.out.print("Enter a positive integer for the number of rectangles: ");
            }
            
            else if (in.hasNextInt())
            {
                int intInput = in.nextInt();
                if (intInput <= 0)
                {
                    System.out.println("Not positive: " + intInput);
                    System.out.print("Enter a positive integer for the number of rectangles: ");
                }
                else
                {
                    System.out.println("The number of rectangles: " + intInput + ".");
                    System.out.println("The min area: 864.");
                    for (int i = 0; i < intInput; i++)
                    {
                        int x = generator.nextInt(MAX_X) + 0;
                        int y = generator.nextInt(MAX_Y) + 0;
                        int width = generator.nextInt(70) + MIN_WIDTH;
                        int height = generator.nextInt(60) + 20;
                        
                        Rectangle rectangle1 = new Rectangle(x, y, width, height);
                        rectangle1.setColor(Color.RED);
                        rectangle1.draw();
                    }
                }
            }
        }
    }
}
