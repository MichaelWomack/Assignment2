/**
 * Michael Womack
 * Assignment 2
 * CS 3401-01
 * 1/21/2015
 */
package hw;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment2 {

	public static void main(String[] args) {
		
		try {
			
			ArrayList<Integer> list = 
					new ArrayList<Integer>(Arrays.asList(1,1,1,1,3,3,3,12,5,6,7,88));
			
			//distinct list
			list = distinct(list);
			System.out.println("Distinct List:");
			for(Integer i : list)
				System.out.print(i + " ");
			
			//shuffled list
			shuffle(list);
			System.out.println("\n\nShuffled List:");
			for(Integer i : list)
				System.out.print(i + " ");
			
			//max element from list
			System.out.println("\n\nMax element: " + max(list));
							
			
		} catch (NullPointerException e) {
			
			System.out.println("Null arrayList");
			
		} catch(IllegalArgumentException e){
			
			System.out.println("Empty List");
			
		}
					
	}
	
	
	/**
	 * @param list 
	 * @return will return the list without duplicate values.
	 * Removes duplicate element if it is equal to another element if 
	 * the index values are not equal. This ensures that an element will not be removed 
	 * when indexes i == j, since they are the index of the same element.
	 */
	public static <E extends Comparable<E>> ArrayList<E> distinct(ArrayList<E> list){
		
		if (list == null)
			throw new NullPointerException();
		if(list.isEmpty())
			return list;
	
		int i, j;
		for(i = 0; i < list.size(); i++)
			for(j = list.size()-1; j>=i; j--){
				if (list.get(i).compareTo(list.get(j)) == 0 && (j!=i))
					list.remove(j);
			}
		return list;
	}
	
	/**
	 * @param Receives a list 
	 * shuffles a list by setting an element at a random
	 * index to a temp variable, then switching the elements at the current index and 
	 * random index
	 */
	public static <E> void shuffle(ArrayList<E> list){
		
		if (list == null)
			throw new NullPointerException();
		
		for(int i = 0; i < list.size(); i++){
			
			int randIndex = (int)(Math.random() * list.size());
			E temp = list.get(randIndex);
			list.set(randIndex, list.get(i));
			list.set(i, temp);
		}	
	}	
	
	/**
	 * @param list 
	 * @returns the max element of the list by setting max to the element at the first index 
	 * and comparing it to the rest of the elements with compareTo().
	 */
	public static <E extends Comparable<E>> E max(ArrayList<E> list){
		
		if (list.isEmpty())
			throw new IllegalArgumentException();
		if(list == null)
			throw new NullPointerException();
		
		E max = list.get(0);
		for(int i = 1; i < list.size(); i++)
			if (list.get(i).compareTo(max) == 1)
				max = list.get(i);
		return max;		
	}
}
