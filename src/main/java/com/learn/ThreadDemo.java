package com.learn;

public class ThreadDemo {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("value of i is : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();

		Runnable runnable2 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i * 2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread thread1 = new Thread(runnable2);
		thread1.start();
	}
}
