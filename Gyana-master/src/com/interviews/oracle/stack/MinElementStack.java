//package com.interviews.oracle.stack;
//
//import java.util.Stack;
//
//public class MinElementStack {
//	private Stack<Integer> st;
//	private Stack<Integer> minSt;
//
//	public MinElementStack(){
//		st = new Stack<>();
//		minSt = new Stack<>();
//	}
//
//	public void push(int data){
//		int min = data;
//		if(!minSt.isEmpty() &&  min > minSt.peek()){
//			min = minSt.peek();
//		}
//		st.push(data);
//		minSt.push(min);
//
//	}
//
//	public void pop(){
//		st.pop();
//		minSt.pop();
//
//	}
//
//	public int top(){
//		return st.peek();
//	}
//
//	public int getMin(){
//		return minSt.peek();
//
//	}
//
//	public static void main(String[] args) {
//		MinElementStack monEl = new MinElementStack();
//		monEl.push(2);
//		monEl.push(3);
//		monEl.push(5);
//		monEl.push(1);
//
//
//		monEl.pop();
//
//		System.out.println("min element:" +monEl.getMin());
//	}
//
//
//}
