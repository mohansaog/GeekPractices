package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(Arrays.asList("mila","hai","","mil","koi"));
		List<String> filters = list.stream().filter(p->!p.isEmpty()).collect(Collectors.toList());
		
		//System.out.println(filters);
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2,5,6,7,44,5));
		List<Integer> filters1 = list1.stream().filter(g->g>4).collect(Collectors.toList());
		//System.out.println(filters1);
		list1.forEach(pp->{
			if(pp>4)
				System.out.println(pp);
		});
				
	}

}
