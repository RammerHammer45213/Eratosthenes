/*
 * 
 */

package eratosthenes;

/**
 *
 * @author RaCoc9605
 */
public class Eratosthenes 
{

    /**
     * @param args the command line arguments
    */
    public static void main(String[] args) 
    {
        int low = 1, high = 1000;

        while (low < high) 
        {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) 
            {
                if(low % i == 0) 
                {
                    flag = true;
                    break;
                }
            }

            if (!flag)
            {
                System.out.print(low + " ");
            }
            ++low;
        }
    }
}
  
