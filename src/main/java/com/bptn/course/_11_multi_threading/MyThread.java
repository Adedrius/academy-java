package com.bptn.course._11_multi_threading;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class MyThread extends Thread {

    // Declare an instance variable of type List<Integer>
	List<Integer> list = new ArrayList<>();

    // Create a parameterized constructor.
	public MyThread(String name, List<Integer> list) {
		super(name);
		this.list = list;
	}
	

    // Override the run() method here. 
	public void run() {
		ListUtils.insertNextId(list);
	}
}