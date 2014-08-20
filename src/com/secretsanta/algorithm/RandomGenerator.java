package com.secretsanta.algorithm;

import java.util.Random;

public class RandomGenerator {
    private static Random rand = new Random();
    
	public static int randIntIncMax(int min, int max) {
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	public static int randIntExcMax(int min, int max) {
	    int randomNum = rand.nextInt(max - min) + min;
	    return randomNum;
	}
}
