package smasung;

import java.util.Stack;

public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,3,5,6,7};
		Stack<Integer> s  = new Stack<Integer>();
		s.push(arr[0]);
		int a,p;
		for(int i=1;i<arr.length;i++) {
			a = arr[i];
			if(s.isEmpty() == false) {
				p = s.pop();
				
				while(a > p) {
					System.out.println(a);
					if(s.isEmpty() == true)
						break;
					a = s.pop();
				}
				if(a < p)
					s.push(arr[i]);
			}
			s.push(arr[i]);
			
			while(!s.isEmpty() ) {
				p = s.pop();
				a = -1;
				System.out.println(a);
			}
		}
		
	}

}
