package threads;

import java.util.Scanner;

public class MultiThreadingAgain implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		if (name.equals("ADD")) {
			adding();
		} else if (name.equals("PRINTCHAR")) {
			printCharacters();
		} else {
			printingNumbers();
		}
	}

	public void adding() {
		System.out.println("Adding started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int b = sc.nextInt();
		System.out.println("Enter the second number");
		int a = sc.nextInt();
		int c = a + b;
		System.out.println(c);
		System.out.println("Adding complete");

	}

	public void printCharacters() {
		System.out.println("Printing characters started");
		for (int i = 65; i <= 70; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing characters completed");
	}

	public void printingNumbers() {
		System.out.println("Printing numbers started");
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing numbers completed");
	}

}
