import java.util.Arrays;


public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
        Integer temp = 0;

        for(int i=1; i<myNumbers.length; i++)
        {
            for(int o=i; o>0; o--)
            {
                if(myNumbers[i] < myNumbers[i-1])
                {
                    temp = myNumbers[i];
                    myNumbers[i] = myNumbers[i-1];
                    myNumbers[i-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myNumbers));

    }
}
