package Assignment4;

import java.util.*;

public class TreeSet_solution {

	public static void main(String[] args) {
		// 6. Get highest and lowest value stored in TreeSet
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(218);
		set.add(56);
		set.add(18);
		set.add(91);
		set.add(100);
		set.add(40);
		set.add(60);
		set.add(12);

		System.out.println("Elements of the treeset are: " + set);
		System.out.println("Lowest value Stored in Java TreeSet is : " + set.first());
		System.out.println("Highest value Stored in Java TreeSet is : " + set.last());

	}

}
