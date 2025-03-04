package com.java.Multithreading.assign_02_05;

import java.util.Scanner;

public class CoronaVaccineApp {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);

		Thread u1 = new User("harsh", 22, false);
		Thread u2 = new User("vishwajeet chomu", 66, false);

		u1.start();
		u1.join();
		u2.start();
		u2.join();
	}
}
