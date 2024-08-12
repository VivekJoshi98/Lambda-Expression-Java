package com.learn;

public class Main {

	public static void main(String[] args) {
		System.out.println("My System starts..");
		//*********************************************************************
		//1. create seperate class and implementation this interface
		
//		MyInterImpl ob=new MyInterImpl();
//		ob.sayHello();
		
		//*********************************************************************
		//2.Anonymous class for implementing interface
		
//		Myinter myinter = new Myinter() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("This is first anonymous classes ");
//				
//			}
//		};
//		
//		myinter.sayHello();
//		
//		Myinter myinter2 = new Myinter() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("This is Second anonymous classes ");
//				
//			}
//		};
//		myinter2.sayHello();
		
		//***************************************************************************
	//	3. Lambda Expression
		
		Myinter i=()->{
			System.out.println("This is first time i am using lambda");
		};
		i.sayHello();
		
		Myinter i2=()->{
			System.out.println("This is second time i am using lambda");
		};
		i2.sayHello();
		
		SumInter sumInter= (x,y)->(x+y);
		System.out.println(sumInter.sum(2, 3));
		System.out.println(sumInter.sum(4, 6));
		
		LengthInter length=(len)->len.length();
		
		System.out.println("Length of String (Vivek Joshi) :: "+length.getLength("Vivek Joshi"));
	}
}
