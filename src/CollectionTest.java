import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CollectionTest {
	List<String> list = null;
	
	public static void main(String[] args){
		CollectionTest ct = new CollectionTest();
//		ct.AbstractSetSetTest();
//		ct.HastSetTest();
//		ct.LinkedListTest();
		ct.MapTest();
	}
	
	public List<String> ListTest(){
		list = new ArrayList<String>();
		list.add("a");
		list.add("c");
		list.add("z");
		list.add("f");
		list.add("e");
		list.add("b");
		list.add("d");
		list.add("d11");
		list.add("23");
		System.out.println("ArrayList: " + list);
		return list;
	}
	
	public HashSet<String> HastSetTest(){
		HashSet<String> hs = new HashSet<String>();
		CollectionTest ct = new CollectionTest();
		list = ct.ListTest();
		hs.addAll(list);
		System.out.println("HashSet: "+hs);
		return hs;
	}
	
	public AbstractSet<String> AbstractSetSetTest(){
		AbstractSet<String> ahs = new HashSet<String>();
		CollectionTest ct = new CollectionTest();
		list = ct.ListTest();
		ahs.addAll(list);
		System.out.println("AbsTractSet: " + ahs);
		return ahs;
	}
	
	public LinkedList<String> LinkedListTest(){
		CollectionTest ct = new CollectionTest();
		list = ct.ListTest();
		LinkedList<String> llist = new LinkedList<String>();
		llist.addAll(list) ;
		System.out.println("LinkedList: " + llist);
		return llist;
	}
	
	public Map<String,String> MapTest(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("a", "a");
		map.put("a1", "a");
		map.put("c", "c");
		map.put("d", "d");
		map.put("b", "b");
		map.put("f", "f");
		
		System.out.println(map);
		return map;
	}
	
	
}
