package week03;

import java.util.Scanner;

public class GradeBook {

	public static void main(String[] args) {
		String fullName = "";
		String lineVariable = "-----------------------";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Grade Book Example");
		System.out.println("Name of Course");
		String courseName = sc.nextLine();
		System.out.println("How many students are in this class:");
		int numOfStudents = sc.nextInt();
		Student[] programmingStudents = new Student[numOfStudents];
		System.out.println("How many grades do you have per student?");
		int numOfGrades = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < programmingStudents.length) i++) {
			int[] grades = new int[numOfGrades];
			System.out.println("Enter Student's Full Name: ");
			fullName = sc.nextLine();
			for (int j = 0; j < grades.length; j++) {
				System.out.println("Enter a grade: ");
				grades[j] = sc.nextInt();
			}
			programmingStudents[i] = new Student(fullName, grades);
			sc.nextLine();
		}
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
		int[] myArray = new int[3];
		myArray[0] = 7;
		myArray[1] = 10;
		myArray[2] = 8;
		
		System.out.println(sumArray(myArray));
		
		double[] grades = new double[5];
		grades[0] = 88.7;
		grades[1] = 92.5;
		grades[2] = 100;
		grades[3] = 67.3;
		grades[4] = 78.9;
		
		System.out.println(calculateAverage(grades));
		
		System.out.println(multiplyString("Hello", 3));
		
	}
	
	public static String createFullName(String x, String y) {
		return x + " " + y;
	}
	
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
 
}
