package com.Anubhav_FirstProblem;

import java.util.Scanner;

public class DriverPayMoney {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PayMoney pm = new PayMoney();
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int transactions[] = new int[size];
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the total no of targets that needs to be achieved");
		int num = sc.nextInt();
		System.out.println();
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter the value of target " + i);
			int target = sc.nextInt();
			int no_of_days = pm.num_of_days(transactions, target);
			if (no_of_days == -1) {
				System.out.println("Target is not acheived");
				System.out.println();
			} else {
				System.out.println("target acheived after " + no_of_days + " transactions");
				System.out.println();
			}
		}
		sc.close();
	}

}
