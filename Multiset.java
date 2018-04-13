import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;
//Class.
public class Multiset
{

    //Method Set Union().
    public static ArrayList<String> setunion(ArrayList setA, ArrayList setB)
    {

        //Create a new instance that is set to set A
        ArrayList temporary = new ArrayList<String>(setA);

        //Add to temporary set.
        temporary.addAll(setB);

        //Return the values of temporary set.
        return temporary;
    }

    //Method Set Intersection().
    public static ArrayList<String> setintersection(ArrayList setA, ArrayList setB)
    {

        //Create a new instance.
        ArrayList temporary = new ArrayList<String>();

        //For loop to iterate through setA.
        for (int i = 0; i<setA.size(); i++)
        {

            //Condition Check.
            if (setB.contains(setA.get(i)))
            {

                //On success, add the value to temporary set.
                temporary.add(setA.get(i));

            }
        }

        //Return the values of temporary set.
        return temporary;   
    }

    //Method Set difference().
    public static ArrayList<String> setdifference(ArrayList setA, ArrayList setB)
    {

        //Create a new instance.
        ArrayList temporary = new ArrayList<String>(setA);

        //Remove values of B.
        temporary.removeAll(setB);

        //Return the values of temporary set.
        return temporary;
    }

    //Method Set setsymdifference().
    public static <String> ArrayList sum(ArrayList setA, ArrayList setB)
    {

        //Create a new instance.
        ArrayList tempA;
        ArrayList tempB;

        //Set function call values to tempA and tempB.
        tempA = setunion(setA, setB);
        tempB = setintersection(setA, setB);

        //Return the set symmetric difference.
        return setdifference(tempA, tempB);
    }

    //Main method
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //Create a new instance A.
        ArrayList<String> A = new ArrayList<String>();

        //Create a new instance B.
        ArrayList<String> B = new ArrayList<String>();

        /*
        System.out.print("n number of items: ");
        int n = Integer.parseInt(sc.nextLine());
        //Add values to Set A.
        for(int i = 0; i<n; i++){
            System.out.println("Enter value " + (i+1) + " for set A: ");
            A.add(sc.nextLine());
        }

        //Add values to Set B.
        for(int i = 0; i<n; i++){
            System.out.println("Enter value " + (i+1) + " for set B: ");
            B.add(sc.nextLine());
        }*/

        //add the contens of multiset A and B
        A.add("3");
        A.add("a");
        A.add("2");
        A.add("b");
        A.add("1");
        A.add("c");
        
        B.add("2");
        B.add("a");
        B.add("3");
        B.add("b");
        B.add("4");
        B.add("d");
        //Output.
        System.out.println("MultiSet A: " + A);
        System.out.println("Multiset B: " + B);
        System.out.println("==========================================================");
        System.out.println("Union (A∪B):\t\t  " + setunion(A, B));
        System.out.println("\nIntersection (A∩B):\t " + setintersection(A, B));
        System.out.println("\nDifference (A - B):\t " + setdifference(A, B));
        System.out.println("Symmetric Difference (A+B): " + sum(A, B));
    }
}