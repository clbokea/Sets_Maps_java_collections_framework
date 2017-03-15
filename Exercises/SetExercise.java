public class SetExercise
{
    // 1. We create a new, empty set
        Set mySet1 = new HashSet();
        // We add a few elements
        mySet1.add("A");
        mySet1.add("C");
        mySet1.add("A");
        mySet1.add("B");
        // Print the elements of the Set
        System.out.println("mySet1: " + mySet1);

        // 1. Create a list and add some elements
        List list = new ArrayList();
        list.add("A");
        list.add("C");
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        // Now create the set using the appropriate constructor
        Set mySet2 = new HashSet(list);
        // Print the elements of the list an the the set
        System.out.println("list: " + list);
        System.out.println("mySet2: " + mySet2);


        // EXERCISES
        // Look at the documentation 
        // https://docs.oracle.com/javase/7/docs/api/java/util/Set.html
        
        // 1.  Compare the two sets
        // 2.  Remove one element from mySet2 and compare again
        // 3.  Check if our sets contain all the elements of the list 
        // 4.  Use of Iterator in Set
        // 5.  Use of for-each and print out both sets 
        // 6.  Clear all the elements in mySet1 and check the number of elements
        // 7.  Creat an Array with the contents of the set

}




