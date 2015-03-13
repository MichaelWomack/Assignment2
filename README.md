# Assignment2

The purpose of this assignment is to reinforce generics concepts.  Specifically, the assigment is to the following 3 problems.

1) Write a generic method that returns an arraylist containing the distinct elements of the given arraylist. 
The method header should be
public static <E extends Comparable<E>> ArrayList<E> distinct (ArrayList<E> list)

2) Write a generic method that shuffles the elements of an arraylist.  Do not use the shuffle method in the Java library.  The method header should be
public static <E> void shuffle (ArrayList<E> list)

3) Write a generic method that returns the largest element in an arraylist.  The method header should be
public static <E extends Comparable<E>>  E max (ArrayList<E> list)
