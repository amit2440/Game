package com.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {
	private Square noOfSquares[]= new Square[9];
	//private List<User> users= new ArrayList<User>();
	Board(){
			Square sq1 = new Square(1);
			Square sq2 = new Square(2);
			Square sq3 = new Square(3);
			Square sq4 = new Square(4);
			Square sq5 = new Square(5);
			Square sq6 = new Square(6);
			Square sq7 = new Square(7);
			Square sq8 = new Square(8);
			Square sq9 = new Square(9);
			noOfSquares[0]=sq1;
			noOfSquares[1]=sq2;
			noOfSquares[2]=sq3;
			noOfSquares[3]=sq4;
			noOfSquares[4]=sq5;
			noOfSquares[5]=sq6;
			noOfSquares[6]=sq7;
			noOfSquares[7]=sq8;
			noOfSquares[8]=sq9;
	}
	
	public Square[] getNoOfSquares() {
		return noOfSquares;
	}

	public void setNoOfSquares(Square[] noOfSquares) {
		this.noOfSquares = noOfSquares;
	}


	/*public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}*/


	/*public static void main(String[] args) {
		System.out.println("Enter Player 1 name: ");
		Scanner s = new Scanner(System.in);
		User one= new User();one.setUname(s.nextLine());
		System.out.println("Enter Player 2 name: ");
		User two= new User();two.setUname(s.nextLine());
		s.close();
		List<User> listOfUsers= new ArrayList<User>();
		listOfUsers.add(one);listOfUsers.add(two);
		Board board= new Board();
		board.setUsers(listOfUsers);
		
	}*/
}
