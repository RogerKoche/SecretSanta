package com.secretsanta.test;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import com.whiteelephant.algorithm.ArrayListWrapper;

public class ArrayListWrapperTest {

	@SuppressWarnings("unchecked") // Generic cast is valid
	@Test
	public void derangementsShouldNotAppearInSamePositionsString() {
		ArrayList<String> al = new ArrayList<String>();
		ArrayListWrapper<String> alw0 = new ArrayListWrapper<String>((ArrayList<String>) al.clone());
		ArrayList<String> d0 = alw0.derange();
		al.add("A");
		ArrayListWrapper<String> alw1 = new ArrayListWrapper<String>((ArrayList<String>) al.clone());
		ArrayList<String> d1 = alw1.derange();
		al.add("B");
		ArrayListWrapper<String> alw2 = new ArrayListWrapper<String>((ArrayList<String>) al.clone());
		ArrayList<String> d2 = alw2.derange();
		al.add("C");
		ArrayListWrapper<String> alw3 = new ArrayListWrapper<String>((ArrayList<String>) al.clone());
		ArrayList<String> d3 = alw3.derange();
		al.add("D");
		ArrayListWrapper<String> alw4 = new ArrayListWrapper<String>((ArrayList<String>) al.clone());
		ArrayList<String> d4 = alw4.derange();
		al.add("E");
		ArrayListWrapper<String> alw5 = new ArrayListWrapper<String>((ArrayList<String>) al.clone());
		ArrayList<String> d5 = alw5.derange();
		al.add("F");
		ArrayListWrapper<String> alw6 = new ArrayListWrapper<String>((ArrayList<String>) al.clone());
		ArrayList<String> d6 = alw6.derange();
		al.add("G");
		ArrayListWrapper<String> alw7 = new ArrayListWrapper<String>((ArrayList<String>) al.clone());
		ArrayList<String> d7 = alw7.derange();

		// Tests

		assertThat(alw0.size(), is(d0.size()));
		assertThat(alw1.size(), is(d1.size()));
		assertThat(alw2.size(), is(d2.size()));
		assertThat(alw3.size(), is(d3.size()));
		assertThat(alw4.size(), is(d4.size()));
		assertThat(alw5.size(), is(d5.size()));
		assertThat(alw6.size(), is(d6.size()));
		assertThat(alw7.size(), is(d7.size()));
		
		//System.out.println("ALW1");
		for (int i = 0; i<alw1.size(); i++){
			//System.out.println(alw1.get(i)+":"+d1.get(i));
			assertThat(alw1.getArrayList().get(i), is(d1.get(i)));
		}
		//System.out.println("ALW2");
		for (int i = 0; i<alw2.size(); i++){
			//System.out.println(alw2.get(i)+":"+d2.get(i));
			assertThat(alw2.getArrayList().get(i), is(not(d2.get(i))));
		}
		//System.out.println("ALW3");
		for (int i = 0; i<alw3.size(); i++){
			//System.out.println(alw3.get(i)+":"+d3.get(i));
			assertThat(alw3.getArrayList().get(i), is(not(d3.get(i))));
		}
		//System.out.println("ALW4");
		for (int i = 0; i<alw4.size(); i++){
			//System.out.println(alw4.get(i)+":"+d4.get(i));
			assertThat(alw4.getArrayList().get(i), is(not(d4.get(i))));
		}
		//System.out.println("ALW5");
		for (int i = 0; i<alw5.size(); i++){
			//System.out.println(alw5.get(i)+":"+d5.get(i));
			assertThat(alw5.getArrayList().get(i), is(not(d5.get(i))));
		}
		//System.out.println("ALW6");
		for (int i = 0; i<alw6.size(); i++){
			//System.out.println(alw6.get(i)+":"+d6.get(i));
			assertThat(alw6.getArrayList().get(i), is(not(d6.get(i))));
		}
		//System.out.println("ALW7");
		for (int i = 0; i<alw7.size(); i++){
			//System.out.println(alw7.get(i)+":"+d7.get(i));
			assertThat(alw7.getArrayList().get(i), is(not(d7.get(i))));
		}
	}
	
	@SuppressWarnings("unchecked") // Generic cast is valid
	@Test
	public void derangementsShouldNotAppearInSamePositionsInteger() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayListWrapper<Integer> alw0 = new ArrayListWrapper<Integer>((ArrayList<Integer>) al.clone());
		ArrayList<Integer> d0 = alw0.derange();
		al.add(0);
		ArrayListWrapper<Integer> alw1 = new ArrayListWrapper<Integer>((ArrayList<Integer>) al.clone());
		ArrayList<Integer> d1 = alw1.derange();
		al.add(1);
		ArrayListWrapper<Integer> alw2 = new ArrayListWrapper<Integer>((ArrayList<Integer>) al.clone());
		ArrayList<Integer> d2 = alw2.derange();
		al.add(2);
		ArrayListWrapper<Integer> alw3 = new ArrayListWrapper<Integer>((ArrayList<Integer>) al.clone());
		ArrayList<Integer> d3 = alw3.derange();
		al.add(3);
		ArrayListWrapper<Integer> alw4 = new ArrayListWrapper<Integer>((ArrayList<Integer>) al.clone());
		ArrayList<Integer> d4 = alw4.derange();
		al.add(4);
		ArrayListWrapper<Integer> alw5 = new ArrayListWrapper<Integer>((ArrayList<Integer>) al.clone());
		ArrayList<Integer> d5 = alw5.derange();
		al.add(5);
		ArrayListWrapper<Integer> alw6 = new ArrayListWrapper<Integer>((ArrayList<Integer>) al.clone());
		ArrayList<Integer> d6 = alw6.derange();
		al.add(6);
		ArrayListWrapper<Integer> alw7 = new ArrayListWrapper<Integer>((ArrayList<Integer>) al.clone());
		ArrayList<Integer> d7 = alw7.derange();

		// Tests

		assertThat(alw0.size(), is(d0.size()));
		assertThat(alw1.size(), is(d1.size()));
		assertThat(alw2.size(), is(d2.size()));
		assertThat(alw3.size(), is(d3.size()));
		assertThat(alw4.size(), is(d4.size()));
		assertThat(alw5.size(), is(d5.size()));
		assertThat(alw6.size(), is(d6.size()));
		assertThat(alw7.size(), is(d7.size()));
		
		//System.out.println("ALW1");
		for (int i = 0; i<alw1.size(); i++){
			//System.out.println(alw1.get(i)+":"+d1.get(i));
			assertThat(alw1.getArrayList().get(i), is(d1.get(i)));
		}
		//System.out.println("ALW2");
		for (int i = 0; i<alw2.size(); i++){
			//System.out.println(alw2.get(i)+":"+d2.get(i));
			assertThat(alw2.getArrayList().get(i), is(not(d2.get(i))));
		}
		//System.out.println("ALW3");
		for (int i = 0; i<alw3.size(); i++){
			//System.out.println(alw3.get(i)+":"+d3.get(i));
			assertThat(alw3.getArrayList().get(i), is(not(d3.get(i))));
		}
		//System.out.println("ALW4");
		for (int i = 0; i<alw4.size(); i++){
			//System.out.println(alw4.get(i)+":"+d4.get(i));
			assertThat(alw4.getArrayList().get(i), is(not(d4.get(i))));
		}
		//System.out.println("ALW5");
		for (int i = 0; i<alw5.size(); i++){
			//System.out.println(alw5.get(i)+":"+d5.get(i));
			assertThat(alw5.getArrayList().get(i), is(not(d5.get(i))));
		}
		//System.out.println("ALW6");
		for (int i = 0; i<alw6.size(); i++){
			//System.out.println(alw6.get(i)+":"+d6.get(i));
			assertThat(alw6.getArrayList().get(i), is(not(d6.get(i))));
		}
		//System.out.println("ALW7");
		for (int i = 0; i<alw7.size(); i++){
			//System.out.println(alw7.get(i)+":"+d7.get(i));
			assertThat(alw7.getArrayList().get(i), is(not(d7.get(i))));
		}
	}
}
