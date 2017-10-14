import java.util.Vector;

public class VectorHelper {

    /**
     * Reverse vector elements
     * @param vector The vector to reverse elements
     * @return The result vector with elements reversed
     */
    public static Vector<Integer> Reverse(Vector<Integer> vector)
    {
        Vector<Integer> result = new Vector<Integer>();
        int size = vector.size()-1;
        for (int i=size;i>=0;i--)
        {
            result.add(vector.get(i));
        }
        return result;
    }

    /**
     * Prints the maximum and the minimum of a vector
     * @param vector The vector to find Max and Min
     */
    public static void MaxMin(Vector<Integer> vector)
    {
        int size= vector.size();
        int min=0;
        int max=0;
        for (int i=0; i<size; i++)
        {
            if(vector.get(i)>vector.get(max)) max=i;
            if(vector.get(i)<vector.get(min)) min=i;
        }
        System.out.println("Max = "+ vector.get(max));
        System.out.println("Min = "+ vector.get(min));
    }

    /**
     * Multiply all vector elements by 2
     * @param vector The vector to multiply elements
     */
    public static void Function1(Vector<Integer> vector)
    {
        for (int i=0;i<vector.size();i++) {
            vector.set(i,vector.get(i)*2);
        }
    }

    /**
     * Divide all vector elements by 2
     * @param vector The vector to divide elements
     */
    public static void Function1_Reverse(Vector<Integer> vector)
    {
        for (int i=0;i<vector.size();i++) {
            vector.set(i,vector.get(i)/2);
        }
    }
}
