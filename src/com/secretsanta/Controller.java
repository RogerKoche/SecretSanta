package com.whiteelephant;

import com.whiteelephant.algorithm.*;

public class Controller {

	public static void main(String args[]){
		if (args.length < 1){
			System.out.println("Usage: arg1: comma separated list of participants (arguments on command line must be placed in quotes if they contain spaces)");
		} else {
			String[] input = args[0].split("\\s*,\\s*");
			if (Utility.duplicates(input)){
				System.out.println("Elements of input are not unique. Please change them to be appropriately identifying");
			} else {
				Matcher match = new Matcher(input);
				match.printMatches();
			}
		}
	}
}
