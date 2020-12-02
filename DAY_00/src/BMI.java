/*
	@ compiler version JDK 11.0.9.1
	@ Input: height, weight
	@ Output: BMI
	@ Date: 2020/12/02
	@ Author: Finley
*/

import java.util.Scanner;
public class BMI{
	// constructor
	public BMI(String n){
		System.out.println(n+ "'s BMI Value");
	}

	// method
	void output(double o){
		System.out.println("output: " + o);
	}
	// have return method
	double answer = 0.001;
	void setans( double a){
		answer = a;
	}
	double getans(){
		return answer;
	}

	public static void main(String[] args){
		// Note 
		System.out.println("please input: height weifht ");
		Scanner input = new Scanner(System.in);
		double height = input.nextDouble();
		double weight = input.nextDouble();

		BMI names = new BMI("Finley");
		double mybmi = weight/ ((height/100)* (height/100));
		names.output(mybmi);
	}
}