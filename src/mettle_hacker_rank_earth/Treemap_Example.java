package mettle_hacker_rank_earth;

import java.util.Comparator;
import java.util.TreeMap;

class Student {
	int rollno;
	String name;
	String address;
	
	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
}

class  sortByRoll implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s2.rollno - s1.rollno;
	}
}


public class Treemap_Example {

	public static void main(String[] args) {
		TreeMap<Student, Integer> tree_map = new TreeMap<Student, Integer>(new sortByRoll());
		tree_map.put(new Student(111, "bbbb", "london"), 2); 
		tree_map.put(new Student(131, "aaaa", "nyc"), 3); 
		tree_map.put(new Student(121, "cccc", "jaipur"), 1); 
		
		System.out.println(tree_map);
		
		
	}

}
