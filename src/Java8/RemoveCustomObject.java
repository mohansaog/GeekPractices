package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class A {
	private int id;
	private String name;
	private String add;

	public A() {
	}

	public A(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.add = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String address) {
		add = address;
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((name == null) ? 0 : name.hashCode()); return
	 * result; }
	 */
	@Override
	public boolean equals(Object obj) {
		A aa = (A) obj;
		if (obj instanceof A) {
			if (this.id != aa.id)
				return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

}

public class RemoveCustomObject {

	public static void main(String[] args) {
		A a1 = new A(1, "mohan", "jfjdf");
		A a2 = new A(2, "mohan", "koka");
		A a3 = new A(3, "fhemant", "jfjdf");
		A a4 = new A(1, "sao", "jfjdf");

		List<A> obj = new ArrayList<A>();
		List<A> list = new ArrayList<A>();
		obj.add(a1);
		obj.add(a2);
		obj.add(a3);
		obj.add(a4);
		list = obj.stream().distinct().collect(Collectors.toList());

		for (A a : list)
			System.out.println(a.getId() + " " + a.getName() + " " + a.getAdd());
	}
}
