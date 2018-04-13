//Package name.

//Import the needed header files.
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;
//Class.
public class DiscreteSet
{

    //Method Set Union().
    public static <S1> Set<S1> setunion(Set<S1> setA, Set<S1> setB)
    {

        //Create a new instance that is set to set A
        Set<S1> temporary = new TreeSet<S1>(setA);

        //Add to temporary set.
        temporary.addAll(setB);

        //Return the values of temporary set.
        return temporary;
    }

    //Method Set Intersection().
    public static <S1> Set<S1> setintersection(Set<S1> setA, Set<S1> setB)
    {

        //Create a new instance.
        Set<S1> temporary = new TreeSet<S1>();

        //For loop to iterate through setA.
        for (S1 a : setA)
        {

            //Condition Check.
            if (setB.contains(a))
            {

                //On success, add the value to temporary set.
                temporary.add(a);

            }
        }

        //Return the values of temporary set.
        return temporary;   
    }

    //Method Set difference().
    public static <S1> Set<S1> setdifference(Set<S1> setA, Set<S1> setB)
    {

        //Create a new instance.
        Set<S1> temporary = new TreeSet<S1>(setA);

        //Remove values of B.
        temporary.removeAll(setB);

        //Return the values of temporary set.
        return temporary;
    }

    //Method Set setsymdifference().
    public static <S1> Set<S1> setsymdifference(Set<S1> setA, Set<S1> setB)
    {

        //Create a new instance.
        Set<S1> tempA;
        Set<S1> tempB;

        //Set function call values to tempA and tempB.
        tempA = setunion(setA, setB);
        tempB = setintersection(setA, setB);

        //Return the set symmetric difference.
        return setdifference(tempA, tempB);
    }

    //Driver.
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //Create a new instance A.
        TreeSet<String> A = new TreeSet<String>();

        //Create a new instance B.
        TreeSet<String> B = new TreeSet<String>();

        System.out.println("How many items do you want to add to the sets?");
        System.out.print(">> ");
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
        }

        String[] lettersArray = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        List< String > list = Arrays.asList(lettersArray);

        //creates Universal set
        TreeSet<String> U = new TreeSet<String>();
        U.addAll(list);
        //Output.
        System.out.println("Main Set: " + setunion(A,B));
        System.out.println("A: contents are:" + A);
        System.out.println("B: contents are: " + B);
        System.out.println("Complement of A (U - A): " + setdifference(U,A));
        System.out.println("Union (A∪B): " + setunion(A, B));
        System.out.println("Intersection (A∩B): " + setintersection(A, B));
        System.out.println("Difference (A - B) : " + setdifference(A, B));
        System.out.println("Symmetric Difference (A⊕B): " + setsymdifference(A, B));
    }
}