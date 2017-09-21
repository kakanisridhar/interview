package com.mridasoft.interview.ds;

import java.util.ArrayDeque;

public class StackWith2Qs<T> {
	
	private ArrayDeque<T> q1 = new ArrayDeque<>();
	private ArrayDeque<T> q2 = new ArrayDeque<>();

	public void push(T item) {
		q1.offer(item);
	}
	
	public T pop() {
		T last = null;
		int n = q1.size();
		//insert all elements
		for(int i = 0 ;i<n-1;i++)
			q2.offer(q1.poll());
		last = q1.poll();
		
		ArrayDeque<T> temp = q1;
		q1 = q2;
		q2 = temp;
		
		return last;
	}
	
	public static void main(String[] args) {
		
		StackWith2Qs<String> s = new StackWith2Qs<>();
		String e = s.pop();
		System.out.println(e);
		
		s.push("A");
		s.push("B");
		s.push("C");
		
		System.out.println(s.pop());

		System.out.println(s.pop());

		System.out.println(s.pop());
	}
}
