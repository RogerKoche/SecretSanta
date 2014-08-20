package com.secretsanta.algorithm;

import java.util.HashSet;
import java.util.Set;

public class Utility {
	public static <T> boolean duplicates(final T[] input) {
		Set<T> check = new HashSet<T>();
		for (T i : input) {
			if (check.contains(i))
				return true;
			check.add(i);
		}
		return false;
	}
}
