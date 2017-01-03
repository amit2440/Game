package com.entity;

import java.util.HashMap;
import java.util.Map;

public class Square {/*
		private byte squareNo;
		private byte list1[];
		private byte list2[];
		private byte list3[];
		private byte list4[];
		
		Square(byte sqNo){
			switch(sqNo){
			case 1:
				byte list= new 
			}
		}
		public byte getSquareNo() {
			return squareNo;
		}
		public void setSquareNo(byte squareNo) {
			this.squareNo = squareNo;
		}
		public byte[] getList1() {
			return list1;
		}
		public void setList1(byte[] list1) {
			this.list1 = list1;
		}
		public byte[] getList2() {
			return list2;
		}
		public void setList2(byte[] list2) {
			this.list2 = list2;
		}
		public byte[] getList3() {
			return list3;
		}
		public void setList3(byte[] list3) {
			this.list3 = list3;
		}
		public byte[] getList4() {
			return list4;
		}
		public void setList4(byte[] list4) {
			this.list4 = list4;
		}
		
*/
		byte sqNo;
		boolean isMarked;
		User user;
		private Map listofPossibilities = new HashMap();
		Square(int sqNo){
			byte list1[] = new byte[3];
			byte list2[] = new byte[3];
			byte list3[] = new byte[3];
			byte lists[][] = new byte[9][];
			switch(sqNo){
			case 1:
				list1[0]=1;list1[1]=2;list1[2]=3;
				list2[0]=1;list2[2]=4;list2[2]=7;
				list3[0]=1;list3[2]=5;list3[2]=9;
				lists[0]=list1;lists[1]=list2;lists[2]=list3;
				listofPossibilities.put(1,lists);
				break;
			case 2:
				list1[0]=1;list1[1]=2;list1[2]=3;
				list2[0]=2;list2[2]=5;list2[2]=8;
				lists[0]=list1;lists[1]=list2;
				listofPossibilities.put(2,lists);
				break;
			case 3:
				list1[0]=1;list1[1]=2;list1[2]=3;
				list2[0]=3;list2[2]=5;list2[2]=7;
				list3[0]=3;list3[2]=6;list3[2]=9;
				lists[0]=list1;lists[1]=list2;lists[2]=list3;
				listofPossibilities.put(3,lists);
				break;
			case 4:
				list1[0]=1;list1[1]=4;list1[2]=7;
				list2[0]=4;list2[2]=5;list2[2]=6;
				lists[0]=list1;lists[1]=list2;
				listofPossibilities.put(4,lists);
				break;
			case 5:
				byte list4[]= new byte[3];
				list1[0]=1;list1[1]=5;list1[2]=9;
				list2[0]=2;list2[2]=5;list2[2]=8;
				list3[0]=3;list3[2]=5;list3[2]=7;
				list4[0]=4;list4[2]=5;list4[2]=6;
				lists[0]=list1;lists[1]=list2;lists[2]=list3;
				listofPossibilities.put(5,lists);
				break;
			case 6:
				list1[0]=3;list1[1]=6;list1[2]=9;
				list2[0]=4;list2[2]=5;list2[2]=6;
				lists[0]=list1;lists[1]=list2;
				listofPossibilities.put(6,lists);
				break;
			case 7:
				list1[0]=1;list1[1]=4;list1[2]=7;
				list2[0]=7;list2[2]=8;list2[2]=9;
				list3[0]=7;list3[2]=5;list3[2]=3;
				lists[0]=list1;lists[1]=list2;lists[2]=list3;
				listofPossibilities.put(7,lists);
				break;
			case 8:
				list1[0]=2;list1[1]=5;list1[2]=8;
				list2[0]=7;list2[2]=8;list2[2]=9;
				lists[0]=list1;lists[1]=list2;
				listofPossibilities.put(8,lists);
				break;
			case 9:
				list1[0]=1;list1[1]=5;list1[2]=9;
				list2[0]=3;list2[2]=6;list2[2]=9;
				list3[0]=7;list3[2]=8;list3[2]=9;
				lists[0]=list1;lists[1]=list2;lists[2]=list3;
				listofPossibilities.put(9,lists);
				break;
			}
				
		}
		
}
