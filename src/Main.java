import java.util.Vector;

/**
 * Created by Mohammed on 10/14/2017.
 */
public class Main {
    public static void main(String args[])
    {
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(5);
        vector.add(3);
        vector.add(7);
        vector.add(1);
        System.out.println(vector.toString());

        System.out.println(VectorHelper.Reverse(vector).toString());

        VectorHelper.MaxMin(vector);

        VectorHelper.Function1(vector);
        System.out.println(vector.toString());

        VectorHelper.Function1_Reverse(vector);
        System.out.println(vector.toString());
    }
}
