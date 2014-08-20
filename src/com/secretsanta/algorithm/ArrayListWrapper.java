package com.secretsanta.algorithm;

import com.secretsanta.algorithm.RandomGenerator;
import java.util.ArrayList;
import java.util.Arrays;

//  Generic ArrayList Wrapper class capable of creating derangements
public class ArrayListWrapper<T> {
	private ArrayList<T> arrayList;
	
	// constructors
	public ArrayListWrapper (ArrayList<T> arrayList) {
		setArrayList(arrayList);
	}
	public ArrayListWrapper (T[] array) {
		arrayList = new ArrayList<T>(Arrays.asList(array));
		setArrayList(arrayList);
	}
	// getters/setters
	public void setArrayList(ArrayList<T> arrayList){
		this.arrayList = arrayList;
	}
	public ArrayList<T> getArrayList(){
		return arrayList;
	}
	
	// convenience methods for accessing underlying object directly
	public int size(){
		return arrayList.size();
	}
	public T get(int i) {
		return arrayList.get(i);
	}
	
	// recursive derangement implementation
	@SuppressWarnings("unchecked") // Generic cast is valid
	public ArrayList<T> derange(){
		return derangeRecurse((ArrayList<T>)this.getArrayList().clone());
	}
	private ArrayList<T> derangeRecurse(ArrayList<T> remaining){
		if (remaining.size()<2){ // There are no derangements of a list of one element is not possible so the element is matched with itself.
			return remaining;
		}
		if (remaining.size()==2){ // When two elements remaining swap them if leaving them as they are would result in a match
			if (remaining.get(0).equals(arrayList.get(0)) || remaining.get(1).equals(arrayList.get(1))){
				remaining.add(remaining.remove(0));
			}
			return remaining;
		}
		int guess = RandomGenerator.randIntExcMax(0, remaining.size());
		while (arrayList.get(remaining.size()-1).equals(remaining.get(guess))){ // if equal guess again
			guess = RandomGenerator.randIntExcMax(0, remaining.size());
		}
		T temp = remaining.remove(guess);
		return concat(derangeRecurse(remaining), temp);
	}
	
	// utility
	private ArrayList<T> concat(ArrayList<T> a, ArrayList<T> b) {
		a.addAll(b);
		return a;
	}
	private ArrayList<T> concat(ArrayList<T> a, T b) {
		a.add(b);
		return a;
	}
}
