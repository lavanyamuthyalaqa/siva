package shivakumari;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add("lavanya");
		al.add('c');
		
		System.out.println(al.size());
		
		al.add("madhu");
		al.add(20);
		al.add(30);
		System.out.println("the size of al is::"+al.size());
		
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add("lavanya");
		ar.add(40);
		
		System.out.println("the size of ar is::"+ar.size());
		
		//al.addAll(ar);
		//al.retainAll(ar);
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		
		System.out.println("taking index value::"+al.get(4));
		
		al.set(4,100);
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
		

	}

}
