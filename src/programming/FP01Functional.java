package programming;

import java.util.List;

public class FP01Functional {
	
	public static void main(String[] args) {
		
//		printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
//		printEvenNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
		
		// Exercise 1
//		printOddNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
		// Exercise 2
//		printAllCourses(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernates"));
		// Exercise 3
//		printCoursesWithSpring(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernates"));
		// Exercise 4
//		printCourseswithMoreThan4Chars(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernates"));
		
//		printSquare(List.of(12,9,13,4,6,2,4,12,15));
		
		// Exercise 5
//		printOddNumberCubes(List.of(12,9,13,4,6,2,4,12,15));
		
		// Exercise 6
		printCountOfChars(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernates"));
		
	
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {		
		numbers.stream()
			.forEach(System.out::println);
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {		
		numbers.stream()
//		.filter(FP01Functional::isEven)
		.filter(number -> number % 2 == 0)
		.forEach(System.out::println);;		
	}
	
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {		
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.forEach(System.out::println);;		
	}
	
	private static void printAllCourses(List<String> course) {
		course.stream()
		.forEach(System.out::println);		
	}
	

	private static void printCoursesWithSpring(List<String> courses) {
		courses.stream()
		.filter(course -> course.contains("Spring"))
		.forEach(System.out::println);			
	}
	
	private static void printCourseswithMoreThan4Chars(List<String> courses) {
		courses.stream()
		.filter(course -> (char)course.length() >= 4)
		.forEach(System.out::println);			
	}
	

	private static void printSquare(List<Integer> numbers) {
		numbers.stream()
		.map(number -> number * number)
		.forEach(System.out::println);		
	}
		

	private static void printOddNumberCubes(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.map(number -> number * number * number)
		.forEach(System.out::println);		
	}	

	private static void printCountOfChars(List<String> courses) {
		courses.stream()
		.map(course -> course.length())
		.forEach(System.out::println);;
		
	}


}
