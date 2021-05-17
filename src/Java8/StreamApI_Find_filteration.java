package Java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	Float price;
	public Product(int id, String name, Float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class StreamApI_Find_filteration {
	

	public static void main(String[] args) {
		List<Product> plist = new ArrayList<>();
		plist.add(new Product(1, "HP1", 24000.5f));
		plist.add(new Product(2, "HP2", 52656.5f));
		plist.add(new Product(3, "HP3", 23564.5f));
		plist.add(new Product(1, "HP4", 25469.5f));
		
		//Program 1-> filtering element
		System.out.println(plist.size()); //4
		List<Float> plist1 = plist.parallelStream().filter(p->p.price > 25000).map(p->p.price).collect(Collectors.toList());
		System.out.println(plist1);
		
		//Program 2
		Set<Integer> newSet = new HashSet<>();
		List<Product> plist2 = plist.stream().filter(p->newSet.add(p.id)).collect(Collectors.toList());
		
		System.out.println(plist2.size());
		plist2.forEach(pp-> {
			System.out.println(pp.id +" "+pp.name+ " "+pp.price);
		});
	}

}
