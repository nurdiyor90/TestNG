package lesson19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ListClasses {

	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList<String>();
		LinkedList<Integer> studentScores = new LinkedList<>();
		
		students.add("Eldor");
		students.add("Ruslan");
		students.add("Nurdiyor");
		System.out.println(students);

		students.add(0, "Murod");
		System.out.println(students);

		System.out.println(students.contains("Murod"));

		System.out.println(students.get(2));

		System.out.println(students.lastIndexOf("Ruslan"));
		
		System.out.println(students.set(1, "Tulkin")); //it will update
		
		System.out.println(students.size());
		
		//LinkedList
		studentScores.add(96);
		studentScores.add(80);
		studentScores.add(85);
		studentScores.add(76);
		
		System.out.println(studentScores);
		 
		System.out.println(studentScores.getFirst());
		
		//HashSet
		HashSet<Double> setExample = new HashSet<>();
		
		
	}
	

	


}
