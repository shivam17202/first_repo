package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInJava {
	public static void main(String[] args) {
		
		List <Object>lL=new LinkedList<>();
		lL.add(12);
		lL.add("shivam");
		lL.add(1.09);
		lL.add('c');
		lL.add(true);
		lL.add(120);
		lL.add(12);
		lL.add("shivam");
		System.out.println(lL.hashCode());
		System.out.println(lL);
		System.out.println(lL.get(2));
		List <Object>arrL=new ArrayList<>();
		
		List<Object> vecL=new Vector<>();
		
		Stack <Object> StL=new Stack<>();
	}

}
