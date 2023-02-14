import java.util.ArrayList;

public class ArrayContains {
    public static void main(String[] args) {
        // create an array list
        ArrayList<Integer> arrlist = new ArrayList<Integer>(4);

        // populate the list
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);
        arrlist.add(40);

        // check for presence of an element contained in the list
        boolean retval = arrlist.contains(10);

        if (retval == true) {
            System.out.println("10 is present in the list");
        } else {
            System.out.println("10 is not present in the list");
        }

        // check for presence of an element not contained in the list
        boolean retval2 = arrlist.contains(90);

        if (retval2 == true) {
            System.out.println("90 is present in the list");
        } else {
            System.out.println("90 is not present in the list");
        }
    }
}