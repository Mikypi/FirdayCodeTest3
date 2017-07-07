import java.util.ArrayList;

/**
 * Created by michaeliverson on 7/7/17.
 */

public class NumberArray {

    private int [] number = {2,8,9,3,4,3,2,6,6,2,4,9,8};
    private ArrayList<Integer> listOfInts;

    public NumberArray() {

        this.listOfInts = new ArrayList<Integer>();
        initialize();
        print();
        sort();
        print();
    }

    public void initialize()
    {
        for (int i = 0; i <= this.number.length -1 ; i++)
        {
            this.listOfInts.add(this.number[i]);
        }
    }

    public void print()
    {
        for(int i =0; i <= this.listOfInts.size() -1; i++)
        {
            System.out.write(this.listOfInts.get(i));
        }
    }

    public void sort()
    {

       // just joking Collections.sort(this.listOfInts);  //

        for (int i = 0; i <= this.listOfInts.size() - 1; i++)
        {

            for (int j = this.listOfInts.size() - 1; j > i ; j--)
            {
                if (this.listOfInts.get(j) < this.listOfInts.get(j - 1)) {
                    Integer swap = this.listOfInts.get(j - 1);
                    this.listOfInts.set(j - 1, this.listOfInts.get(j));
                    this.listOfInts.set(j, swap);
                }
            }
        }
    }
}
