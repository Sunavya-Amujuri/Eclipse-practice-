package practice;

import java.util.*;

// ArrayList.

//public class Collections {
//	public static void main(String[] args) {
//		ArrayList<Integer> al = new ArrayList<>();
//		ArrayList<Integer> newList = new ArrayList<>();
//		
//		al.add(8);
////		al.add("Telusko");
////		al.add(78.9);
//		al.add(3);
//		al.add(4);
//		al.add(9);
//		al.add(10);
//		al.add(12);
//		al.remove(1);
//		
//		newList.add(89);
//		al.addAll(newList);
//	
//		al.remove(Integer.valueOf(10));
//		al.set(2, null);
//		//al.clear();
//		System.out.println(al);
//		System.out.println(al.get(3));
//		System.out.println(al.contains(9));
		
//		for(int i=0; i<al.size(); i++) {
//			System.out.println("The element is " + al.get(i));
//		}
		
//		for(Integer i : al) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		System.out.println("*********************");
//		
//		Iterator<Integer> it = al.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//	}
//}


// Priority Queue

//public class Collections{
//	public static void main(String[] a) {
//		PriorityQueue pq = new PriorityQueue();
		
		//pq.add(56);
//		pq.offer(67);
//		pq.offer(89);
//		pq.offer(45);
//		pq.offer(33);
//		pq.offer(99);
//		
//		System.out.println(pq);
		//pq.remove();  throws exception if empty
//		pq.poll();      // returns null if empty
//		System.out.println(pq);
//		System.out.println(pq.peek());
		
//		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
//		pq1.offer(67);
//		pq1.offer(89);
//		pq1.offer(45);
//		pq1.offer(33);
//		pq1.offer(99);
//		
//		System.out.println(pq1);
//		System.out.println(pq1.size());
//		System.out.println(pq1.isEmpty());
//		System.out.println(pq1.contains(33));
//		
//		Iterator<Integer> it = pq1.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
				
//		Normal PriorityQueue → Min Heap
//		reverseOrder() → Max Heap
//	}
//}

// TreeSet

//public class Collections{
//	public static void main(String[] a) {
//		TreeSet ts = new TreeSet();
//		
//		ts.add(34);
//		ts.add(45);
//		ts.add(9);
//		ts.add(99);
//		ts.add(78);
//		ts.add(50);
		//ts.add(99);  duplicates not allowed
		//ts.add(null);  exception occurs
		
//		System.out.println(ts.remove(78));     // remove element
//		System.out.println(ts.contains(10));   // check element
//		System.out.println(ts.size());         // number of elements
//		System.out.println(ts.isEmpty());      // check if empty
		//ts.clear();        // remove all elements
//		System.out.println(ts);
//		System.out.println(ts.higher(50));
//		System.out.println(ts.lower(50));
//		System.out.println(ts.higher(65));
//		System.out.println(ts.lower(33));
//		System.out.println("**********************");
//		System.out.println(ts.ceiling(50));
//		System.out.println(ts.floor(50));
//		System.out.println(ts.ceiling(65));
//		System.out.println(ts.floor(33));
//		System.out.println(ts.headSet(75));
//		System.out.println(ts.tailSet(75));
//		System.out.println(ts.subSet(34, 50));
//		System.out.println(ts.first());   // smallest element
//		System.out.println(ts.last());    // largest element
//		System.out.println(ts.descendingSet());
		//ts.pollFirst();   // remove smallest element
		//ts.pollLast();    // remove largest element
		
//		Iterator<Integer> it = ts.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//	}
//}

// ArrayDequeue

//public class Collections{
//	public static void main(String[] a) {
//		ArrayDeque<Integer> dq = new ArrayDeque<>();
//		dq.add(10);
//		dq.add(10);
//		dq.add(10);
//		dq.addFirst(99);
//		dq.addLast(78);
//		// ad.add(null);	
//		dq.offer(30);
//		dq.offerFirst(2);
//		dq.offerLast(40);
		
//		dq.remove();        // remove first element, exception if empty
//		dq.removeFirst();   // remove first
//		dq.removeLast();    // remove last
//		dq.poll();          // returns null if empty
//		dq.pollFirst();
//		dq.pollLast();
		
//		System.out.println(dq.getFirst());   
//		dq.getLast();
//		dq.peek();
//		dq.peekFirst();
//		dq.peekLast();
//		dq.push(10);   // same as addFirst()
//		dq.pop();      // same as removeFirst()
		
//		System.out.println(dq);
//		System.out.println(dq.contains(10));
//		dq.removeFirstOccurrence(10);
//		dq.removeLastOccurrence(10);		
//		System.out.println(dq);
//		
//		Iterator<Integer> it = dq.descendingIterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//	}
//}


// HashSet and linkedHasSet same methods

//public class Collections{
//	public static void main(String[] a) {
//		HashSet set = new HashSet();		
//		set.add(32);
//		set.add(12);
//		set.add(55);
//		set.add(89);
//		set.add(50);
//		System.out.println(set);
		
//		Iterator<Integer> it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		set.forEach(it -> System.out.println(it));
//		
//		HashSet set2 = new HashSet();
//		set2.add(40);
//		set2.add(50);
//		set2.add(30);
//
//		System.out.println(set.addAll(set2));   // Union (combine sets)
//		System.out.println(set);
//		set.retainAll(set2);   // Intersection (common elements)
//		System.out.println(set);
//		
//		Object[] arr = set.toArray();
//		for(Object i : arr) {
//			System.out.println(i);
//		}
		
//		System.out.println(set.removeAll(set2));  // Difference (remove common elements)
//		System.out.println(set);		
//	}
//}


// Linked List

//public class Collections{
//	public static void main(String[] a) {
//		
//		// Linkedlist based on list
//		LinkedList ll = new LinkedList();
//		ll.add(11);
//		ll.add(22);
//		ll.addFirst(30);
//		ll.addLast(9);
		//ll.set(1, 100);
		
//		System.out.println(ll);
//		System.out.println(ll.indexOf(30));
//		System.out.println(ll.lastIndexOf(22));
//		System.out.println(ll.get(2));
		
		// Linkedlist based on Queue
//		ll.offer(11);
//		ll.offer(22);
//		ll.offerFirst(30);
//		ll.offerLast(9);
//		ll.poll();
//		
//		System.out.println(ll);
//		System.out.print(ll.peek());
//	}
//}

// Collections

//public class Collections{
//	public static void main(String[] a) {
//		ArrayList<String> courses = new ArrayList<>();
//		courses.add("Java");
//		courses.add("SpringBoot");
//		courses.add("SystemDesign");
//		courses.add("AI Engineering");
//		courses.add("DevOps");
//		
//		System.out.println(courses);
//		Collections.shuffle(courses);
//		 System.out.println("After Shuffle: " + courses);
//		int info=Collections.frequency(courses, "Java");
//		System.out.println(info);
//		Collections.sort(courses);
//		System.out.println(courses);
//	}
//}

// Map

//public class Collections{
//	public static void main(String[] a) {
////		Map<Integer, String> info = new HashMap<>();   // no order
////		info.put(44, "Arun");
////		info.put(45, "Rohit");
////		info.put(46, "Arun"); // value can be same
//////		info.put(45, "Rahul"); // keys are overriden
////		info.put(null, "Aashu");  // can have null on both key and value
//		
//		LinkedHashMap<Integer, String> info = new LinkedHashMap<>();   // insertion order
//		info.put(44, "Arun");
//		info.put(45, "Rohit");
//		info.put(46, "Arun"); // value can be same
////		info.put(45, "Rahul"); // keys are overriden
//		info.put(null, "Aashu");  // can have null on both key and value
//		
//		System.out.println(info);
//		
//	}
//}


//class PersonalInfo{
//	int age;
//	String name;
//	String city;
//	
//	PersonalInfo(){
//		super();
//	}
//	
//	PersonalInfo(int age, String name, String city){
//		this.age = age;
//		this.name = name;
//		this.city = city;
//	}
//	
//	public String toString() {
//		return "PersonalInfo[age= " + age + ", name= " + name + ", City= " + city + "]";
//	}
//}
//public class Collections{
//	public static void main(String[] a) {
//		HashMap<Integer, PersonalInfo> info = new HashMap<>();
//		info.put(101, new PersonalInfo(16, "Sharma", "Delhi"));
//		info.put(102, new PersonalInfo(17, "Rohit", "Telangana"));
//		info.put(103, new PersonalInfo(10, "Arun", "Tamil"));
//		
//		System.out.println(info);
		
//		TreeMap tm = new TreeMap();  // Sorted order
//		tm.put(4, "Java");
//		tm.put(2, "Java");
//		tm.put(3, "Java");
////		tm.put(null, "Java");  // key cannot be null (null pointer exception)
//		tm.put(1, null);  // can have null as value
//		
//		System.out.println(tm);
		
//		Hashtable tm = new Hashtable();   // use this when we dont want null in key and value
//		tm.put(4, "Java");
//		tm.put(2, "Java");
//		tm.put(3, "Java");
////		tm.put(null, "Java");  // key cannot be null (null pointer exception)
////		tm.put(1, null);  // cannot have null as value
//		
//		System.out.println(tm);
//	}
//}

//interface Alpha{
//	interface Gamma{
//		public static void gamma() {
//			System.out.println("Static method gamma.");
//		}
//	}
//}
//public class Collections{
//	public static void main(String[] a) {
//		Alpha.Gamma.gamma();
//		
//		HashMap<Integer, String> map = new HashMap<>();
//		map.put(1, "Java");
//		map.put(2, "OOps");
//		map.put(3, "Devops");
//		
//		System.out.println(map);
//		System.out.println("**************************");
//		Set<Integer> set = map.keySet();
//		Iterator<Integer> itr = set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println("**************************");
//		Collection<String> col = map.values();
//		Iterator<String> itr2 = col.iterator();
//		while(itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
//		System.out.println("**************************");
//		Set entry = map.entrySet();
//		Iterator itr3 = entry.iterator();
//		while(itr3.hasNext()) {
//			Map.Entry pair = (Map.Entry) itr3.next();
//			System.out.println("Key : " + pair.getKey() + " ,Value : " + pair.getValue());
//		}
		
		// or
		
//		for(Map.Entry<Integer, String> pair : map.entrySet()) {
//			System.out.println(pair.getKey() + " " + pair.getValue());
//		}
		
		// or
		
//		map.forEach((key, value) ->
//			System.out.println("Key: " + key + " Value: " + value));
//	}
//}


// Enum

//enum Week{
//	MON, TUE, WED, THU, FRI, SAT, SUN;
//}
//public class Collections{
//	public static void main(String[] a) {
//		Week week = Week.THU; 
//		System.out.println(week);
//		int index = week.THU.ordinal();
//		System.out.println(index);
//		
//		Week[] weeks = Week.values();
//		for(Week data : weeks) {
//			System.out.println(data);
//		}
//	}
//}

enum Result{
	PASS, FAIL, NR;
	
	// internally java creates like this 
//	public static final Result PASS = new Result();     // Enum constants are created when the enum class loads. 
//    public static final Result FAIL = new Result();
//    public static final Result NR   = new Result();
    
	int marks;
	Result(){
		System.out.println("Constructors of enum");
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
}
public class Collections{
	public static void main(String[] a) {
		Result res = Result.PASS;
		res.setMarks(44);
		System.out.println(res.getMarks());
		
		Result res2 = Result.FAIL;
		System.out.println(res2.getMarks());
	}
}