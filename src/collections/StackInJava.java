package collections;

import java.util.Stack;

public class StackInJava {
		public static void main(String[] args) {
			Stack s=new Stack();
			s.push(34);
			s.add(67);
			s.add("Shivam");
			s.add("Amit");
			s.add(5);
			System.out.println(s);
			
			System.out.println(s.pop()+"\n"+s.peek()+"\n"+s.empty());
			
			
		}

}
