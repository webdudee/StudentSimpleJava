package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses ;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;

	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.println("1 - Freashmen\n2 - Junior\n3 - Senior\nEnter student class: ");
		this.gradeYear = in.nextInt();

		setStudentId();

		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

	}

	private void setStudentId() {
		id++;
		this.studentID = gradeYear + "" + id;
	}

	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit):");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				 courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);
		System.out.println("Enrolled in: " + courses);
		System.out.println("TUITION BALANCE: " + tuitionBalance);

	}
	
	public void vievBalance () {
		System.out.println("Your balance is $: " + tuitionBalance);
	}
	public void payTuition () {
		System.out.println("Enter your payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you of your payment of $ " + payment);
		vievBalance();
	}
	public String showInfo () {
		return "Name " + firstName + " " + lastName +
				"\nCourses " + courses +
				"\nBalance $" + tuitionBalance;
	}

}
