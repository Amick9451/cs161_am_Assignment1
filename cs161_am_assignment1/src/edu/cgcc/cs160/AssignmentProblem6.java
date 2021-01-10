//HEADER
//Program Name: Assignment1_InstanceVar
//Author: Alexandra Mick
//Class: CS161 Winter 2021
//Date: 01/07/2021
//Description: A java program that uses two static variables and a class named Calculator to call upon an algorithm named calculate()
//Multiplies a and b together

//PSUEDOCODE
//Start Program
//Create static double variable for a
//Create static double variable for b
//Assign value 20 to a
//Assign value 1.5 to b
//Create new class calculator
//Create new method calculate
//Print value to console
//End Program
package edu.cgcc.cs160;

public class AssignmentProblem6 {
	

		static double a = 20;
		static double b = 1.5;
		
		public static void main(String[] args) {
			AssignmentProblem6 calculator = new AssignmentProblem6();
					calculator.calculate();
					System.out.print(a*b);
		}
			public double calculate() {
				return (a*b);
			}
}

//FOOTER
//30.0



