package linkedList.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OneWayLinkedList<T>{
    
    int size = 0;
    Entry<T> header;
    Entry<T> currentElement;
    
    public OneWayLinkedList(){
        this.header = new Entry<T>(null);
    }
    
    private class Entry<E>{
        E element;
        Entry<E> next;
        
        private Entry(E element){
            this.element = element;
            this.next = null;
        }
    }
    
    private class MyListIterator implements Iterator<Entry<T>>{
    	
    	int count;
    	Entry<T> iterable;
    	
    	private MyListIterator(){
    		this.count = 0;
    		this.iterable = header;
    	}
    	
		public boolean hasNext() {
			return (iterable.next == null)? false : true;
		}

		public Entry<T> next() {
			count++;
			this.iterable = this.iterable.next;
			return iterable;
		}
    	
    }
    
    public void add(T element){
    	MyListIterator iterator = new MyListIterator();
    		while (iterator.hasNext()==true){
    			iterator.next();
    		}
       		iterator.iterable.next = new Entry<T>(element);
    	this.size++;
    }
    
    public void remove (T element){
        MyListIterator iterator = new MyListIterator();
        int tempSize = this.size; //kostyl'. need to think how to change it to smth normal
             while (iterator.hasNext()){
                if (iterator.iterable.next.element.equals(element) == true){
                	Entry<T> temp = iterator.iterable.next;
                	iterator.iterable.next = iterator.iterable.next.next;
                	temp.next = null;
                	temp = null;
                	size--;
                	break;
                } else {
                	iterator.next();
                }
            }
        if (tempSize == size){
        	throw new NoSuchElementException("No such element in the list: " + element.toString());
        }
    }
    
    public T getElementByIndex(int index){
    		
    	if (index < 0 || index>=size){
    		throw new IndexOutOfBoundsException("Index: " + index + ", list size: " + size);
    	}
    	
    	Entry<T> temp = this.header;
    	
    	for (int i = 0; i <= index ; i++){
    		temp = temp.next;
    	}
    	
    	return temp.element;
  
    }
    
    public int size(){
    	return this.size;
    }
    
    public void reverseList(){
    	if (header.next != null){
    	Entry<T> temp = header.next;
    	
    	header.next = null;
    	
    	while (temp != null){
    		Entry<T> next = temp.next;
    		temp.next = header.next;
    		header.next = temp;
    		temp = next;
    	}
    }
    }
}

