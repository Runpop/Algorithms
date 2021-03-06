package collection;

import java.util.Iterator;

public class Stack<T> implements Iterable<T>{
	
	/**
	 * 链表结点
	 * @author diff
	 *
	 */
	private class Node{
		T item;
		Node next;
	}
	
	//栈顶
	private Node first;
	private int N;
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public int size(){
		return N;
	}
	
	public void push(T item){
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
		
	}
	
	public T pop(){
		T item = first.item;
		Node next = first.next;
		first.next = null;
		first = next;
		return item;
	}

	public Iterator<T> iterator() {
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator<T>{
		private Node current = first;
		public boolean hasNext() {
			return current != null;
		}

		public T next() {
			// TODO Auto-generated method stub
			T item = current.item;
			current = current.next;
			return item;
		}

		public void remove() {
			
		}
		
	}
}
