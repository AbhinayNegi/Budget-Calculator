package controller;

import model.Salary;

public class SalaryController {

	static double fifty =  50.0 / 100.0; // https://stackoverflow.com/a/17153444/8129994
	static double thirty = 30.0 / 100.0;
	static double twenty = 20.0 / 100.0;
	
	public static Salary calBudget(double sal) {

		return new Salary(fifty * sal, thirty * sal,twenty * sal);
	}
}
