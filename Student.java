package week03;

public class Student {
	   String fullName = "";
	   int[] grades;
	   
	   public Student(String fName, int[] grades) {
		   this.fullName = fName;
		   this.grades = grades;
	   }
	   
	   public void describe() {
		   System.out.println("Student: " + this.fullName);
		   System.out.println("Grades:");
		   for (int grade : this.grades) {
			   System.out.println("\t" + grade + " ");
		   }
		   System.out.println();
	   }
	   
		
		String[] cars = new String[5];
			
			cars[0] = "Nissan";
			cars[1] = "Honda";
			cars[2] = "Mercedes Benz";
			cars[3] = "Hundai";
			cars[4] = "Toyota";
				
			for (String car : cars) {
				System.out.println("Model: " + car);
			}
}
