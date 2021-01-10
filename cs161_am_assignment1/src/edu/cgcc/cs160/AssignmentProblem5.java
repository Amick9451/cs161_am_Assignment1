//HEADER
//Program Name: Assignment1_InstanceVar
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/07/2021
//Description:A Java program that prints "Hello World!" to console using an instance variable named helloWorld from an
//object with the class name "MyString". Uses an accessor to call the variable and print it from main() method. 

//PSEUDOCODE
//Program Start 
//create instance variable
//assign instance variable to "Hello World!"
//Create Object
//Use Object to call on HelloWorld method
//Program End
package edu.cgcc.cs160;

public class AssignmentProblem5 {
	static String helloWorld;
	//constructor
	AssignmentProblem5() {
		helloWorld= "Hello World!";
	}
	
	public static void main(String[] args) {
			
	AssignmentProblem5 MyString = new AssignmentProblem5();
	MyString.HelloWorld();
	System.out.print(helloWorld);
	}
	
	public String HelloWorld() {
		return (helloWorld);
	}
}

//FOOTER
//Hello World!

