package com.bptn.course._06_polymorphism;

public class Add {

    // Create your code here:
	private int add(int first, int second) {
		int sum = first + second;
		return sum;
	}
	
	private int add(int first, int second, int third) {
		int sum = first + second + third;
		return sum;
	}

	private double add(double first, double second) {
		double sum = first + second;
		return sum;
	}




    // Do not modify the code below. The code below gives you the idea of how the different methods are called.
    public static void main(String args[]) {
        Add obj = new Add();
        System.out.println(obj.add(12, 21));
        System.out.println(obj.add(11, 23, 10));
        System.out.println(obj.add(100.10, 200.5));
    }
}
