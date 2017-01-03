package com.entity;

import java.util.Scanner;

public class User implements Runnable{
		private String uname;

		public String getUname() {
			return uname;
		}

		public void setUname(String uname) {
			this.uname = uname;
		}
		
		@Override
		public void run() {
		// TODO Auto-generated method stub
			System.out.println(this.getUname()+"'s turn: ");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter square number between 1 to 9: ");
			int a=s.nextInt();
			
		}
		
		public static void main(String[] args) {
			System.out.println("Enter Player 1 name: ");
			Scanner s = new Scanner(System.in);
			User one= new User();one.setUname(s.next());
			System.out.println("Enter Player 2 name: ");
			User two= new User();two.setUname(s.next());
			s.close();
			
			Thread t1 = new Thread(one);
			t1.start();
		}
}
