package com.bptn.course._03_flow_control._02_for_loop;

public class PerfectSquare {
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(1));
		System.out.println(isPerfectSquare(4));
		System.out.println(isPerfectSquare(Integer.MAX_VALUE/100));
		System.out.println(isPerfectSquare(255));
		
	}
	
	public static boolean isPerfectSquare(int num) {

        for(int i = 1; i < num; i++) {

        	if(i*i == num) {
        		return true;
          } else if (i*i > num) { 
            return false;
          }
        
        }

        return false;
    }

}
