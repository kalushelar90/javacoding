package com.shelar.java.oops;

public class StudentClass {
	//dog is class
	//var (feechers of dog(object)) datainfo name, colour, wt,height,breed etc.
	
	//methods functions(behavior,activities,working): sleeping,running,jumping.
	void play() {
	System.out.println("student are playing");
	}
	void singing() {
		System.out.println("some student are singing");
	}

	public static void main(String[] args) {
		StudentClass ob1=new StudentClass();
		ob1.play();
		ob1.singing();
		

	}

}

//class is collection of similar type of object.
//class is a collection of data and member function.
//class is called blueprint of object.