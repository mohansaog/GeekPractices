package mettle_hacker_rank_earth;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int empno;
	String name;
	String address;
	int price;
	public Employee(int empno, String name, String address,int price) {
		super();
		this.empno = empno;
		this.name = name;
		this.address = address;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", address=" + address + "]";
	}
	
	
	//
}
public class filtering_java8_example {
	

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(211, "mohan", "konda",2300));
		list.add(new Employee(220, "rohan", "pate",27000));
		list.add(new Employee(225, "sohan", "raigarh",39800));
		
		//List<Integer> plist = list.stream().filter(p->p.empno>215).map(p->p.empno).collect(Collectors.toList());
		List<Integer> plist = list.parallelStream().filter(p->p.empno > 212).map(p->p.empno).collect(Collectors.toList());
		List<Integer> clist =list.stream().filter(p->p.price > 25000).map(p->p.price).collect(Collectors.toList());
		
		System.out.println(clist);
		
		/*
		 * clist.stream().filter(p->p.price == 27000).forEach(p->
		 * System.out.println(p.price));
		 */
		
	}

}
