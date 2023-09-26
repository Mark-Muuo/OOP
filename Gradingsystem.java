package Marks;

import java.util.Scanner;

public class Gradingsystem {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String firstSub;
		String secondSub;
		String thirdSub;
		String fourthSub;
		System.out.println("Enter the code of the 1st unit Database ");
		firstSub=input.next();
		System.out.println("Enter the code of the 2nd unit Systems ");
		secondSub=input.next();
		System.out.println("Enter the code of the 3rd unit Algorithms ");
		thirdSub=input.next();
		System.out.println("Enter the code of the 4th unit Statistics ");
		fourthSub=input.next();
		 double CCS2101,CCS2102,CCS2103,CCS2104;
		  System.out.println("Enter score for Database:");
		  CCS2101=input.nextDouble();
		  System.out.println("Enter score for Systems:");
		  CCS2102=input.nextDouble();
		  System.out.println("Enter score for Algorithms:");
		  CCS2103=input.nextDouble();
		  System.out.println("Enter score for Statistics:");
		  CCS2104=input.nextDouble();
		System.out.println("\t\tDepartment of Computer Science");
		  System.out.println("\t\t\tEnd of Semester Results");
		  System.out.println("--------------------------------------------------------------------------------");
		  System.out.println("|Name:Mark Muuo\t\t\t|Roll_No:C026-01-0897/2022\tSemester: 2");
		  System.out.println("________________________________________________________________________________");
		  System.out.println("|Unit Code\t\t\t|Unit Name:\t\t\tScore");
		  System.out.println("--------------------------------------------------------------------------------");
		 
		 double sum=CCS2101+CCS2102+CCS2103+CCS2104;
		  int total=(int)sum;
		  double average=sum/4;
		  System.out.print("|"+firstSub); System.out.print("\t\t\t|Database\t\t\t|"+(int)CCS2101);
		  System.out.println("");
		  System.out.println("");
		  System.out.print("|"+secondSub);System.out.println("\t\t\t|Systems\t\t\t|"+(int)CCS2102);
		  System.out.println("");
		  System.out.print("|"+thirdSub);System.out.println("\t\t\t|Algorithm\t\t\t|"+(int)CCS2103);
		  System.out.println("");
		  System.out.print("|"+fourthSub);System.out.println("\t\t\t|Statistics\t\t\t|"+(int)CCS2104);
		  System.out.println("----------------------------------------------------------------------------------");
		  System.out.println("|Total\t\t\t\t\t\t\t\t|"+total);
		  System.out.println("----------------------------------------------------------------------------------");
		  System.out.println("|Average\t\t\t\t\t\t\t|"+average);
		  System.out.println("----------------------------------------------------------------------------------");
		  char grade;  
		  String recommendation;
		  if (average>= 70) {
		            grade = 'A';
		            recommendation = "Recommend Pass";
		        } else if (average >= 60) {
		            grade = 'B';
		            recommendation = "Recommend Pass";
		        } else if (average>= 50) {
		            grade = 'C';
		            recommendation = "Recommend Pass";
		        } else if (average>= 40) {
		            grade = 'D';
		            recommendation = "Recommend Pass";
		        } else {
		            grade = 'F';
		            recommendation = "Recommend Fail";
		        }
		  System.out.println("|Grade\t\t\t\t\t\t\t\t|"+grade);
		  System.out.println("----------------------------------------------------------------------------------");
		  System.out.println("\t\t\t\t\t\t\t\tRecommendation|"+recommendation);
		  System.out.println("----------------------------------------------------------------------------------");
		  System.out.println("Grading Criteria\t\t\tOverall Grade(A-D)\tRecommend Pass");
		  System.out.println("70-100\t\tA");
		  System.out.println("60-69\t\tB");
		  System.out.println("50-59\t\tC");
		  System.out.println("40-49\t\tD");
		  System.out.println("Below 40\tF");
		  System.out.println("----------------------------------------------------------------------------------");  
	

	}

}
