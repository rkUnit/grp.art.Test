package grp.art.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sets {

	public static void main(String[] args) {
List<Integer> list=new ArrayList<Integer>();
list.add(5);
list.add(5);
list.add(6);

Set<Integer> set=new HashSet<Integer>(list);
set.clear();
set.addAll(list);
System.out.println(set);

	}

}
