package practice;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

//public class Advance {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.out.println("Hello1");
//		Thread.sleep(5000);
//		try {
//			Thread.sleep(5000);
//		} 
//		catch (InterruptedException e){
//			System.out.println("Something Happened");
//		}
//		System.out.println("Hello2");
//	}
//}

//public class Advance {
//
//    public static void main(String[] args) throws InterruptedException {
//
//        Thread t = new Thread(() -> {
//            try {
//                System.out.println("Thread going to sleep");
//                Thread.sleep(5000);
//                System.out.println("Thread woke up");
//            } catch (InterruptedException e) {
//                System.out.println("Thread was interrupted!");
//            }
//        });
//
//        t.start();
//
//        Thread.sleep(2000);   // Main thread waits 2 sec
//        t.interrupt();        // Interrupting the sleeping thread
//        // thread going to sleep
//        // thread was interrupted
//    }
//}

//interface MyInterface{
//	void test() throws InterruptedException;
//}
//class Advance{
//	public static void main(String[] args) throws InterruptedException {
//		MyInterface obj = () ->
//		{
//			System.out.println("Sleeping...");
//	//		Thread.sleep(3000);
//			System.out.println("Woke up....");
//		};
//		try 
//		{
//			obj.test();
//		}
//		catch(InterruptedException e) {
//			System.out.println("Interrupted");
//		}
//	}
//}

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;
//class Advance{
//	public static void main(String[] a) {
//		System.out.println("Calc App Started");
//		Scanner sc = new Scanner(System.in);
//		try
//		{
//			System.out.println("Enter the numerator: ");
//			int n = sc.nextInt();
//			System.out.println("Enter the denomenator: ");
//			int d = sc.nextInt();
//			int res = n/d;
//			System.out.println("The result is " + res);
//			System.out.println("Done");
//		}
//		catch(ArithmeticException e){
//			System.out.println("Enter non zero denominator.");
//		}
//		try {
//			System.out.println("Enter the size of an array.");
//			int size = sc.nextInt();
//			int ar[] = new int[size];
//			System.out.println("Enter data to be positioned");
//			int data = sc.nextInt();
//			System.out.println("Enter position at which data has to be inserted");
//			int index = sc.nextInt();
//			ar[index] = data;
//			System.out.println("Done");
//		}
//		catch (NegativeArraySizeException e) {
//			System.out.println("Stay Positive.");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Be in your limits.");
//		}
//		catch(Exception e) {
//			System.out.println("Something Happened");
//		}
//		System.out.println("Calc app terminated.");
//	}
//

//class Alpha{
//	public void Divide(){
//		Scanner sc = new Scanner(System.in);
////		System.out.println("Enter Numerator");
////		int n = sc.nextInt();
////		System.out.println("Enter Denominator");
////		int d = sc.nextInt();
////		int res = n/d;
////		System.out.println("Result is: " + res);
//		try {
//			System.out.println("Enter Numerator");
//			int n = sc.nextInt();
//			System.out.println("Enter Denominator");
//			int d = sc.nextInt();
//			int res = n/d;
//			System.out.println("Result is: " + res);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Handled in Divide Demo");
//			throw e;
//		}
//	}
//}
//class Beta{
//	public void disp() {
////		Alpha d = new Alpha();
////		d.Divide();
//		try {
//			Alpha d = new Alpha();
//			d.Divide();
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Handled in disp Beta");
//			throw e;
//		}
//	}
//}
//class Advance{
//	public static void main(String[] a) {
//		try {
//			Beta d = new Beta();
//			d.disp();
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Handled in main.");
//		}
//		System.out.println("Calc app terminate");
//	}
//}

//class Alpha{
//	public void Divide(){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Numerator");
//		int n = sc.nextInt();
//		System.out.println("Enter Denominator");
//		int d = sc.nextInt();
//		int res = n/d;
//		System.out.println("Result is: " + res);
//	}
//}
//class Beta{
//	public void disp() {
//		Alpha d = new Alpha();
//		d.Divide();
//	}
//}
//class Advance{
//	public static void main(String[] a) {
//		Beta d = new Beta();
//		d.disp();
//		try {
//			Beta d = new Beta();
//			d.disp();
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Handled in main.");
//		}
//		
//		 try {
//		        Beta d = new Beta();
//		        d.disp();
//		        //System.exit(0);
//		    }
//		    finally {
//		        System.out.println("Cleanup");
//		    }
//		System.out.println("Calc app terminate");
//		
//	}
//}

//class Alpha{
//	public void Divide() {
//		System.out.println("Alpha app Started.");
//		Scanner sc = new Scanner(System.in);
//		try {
//			System.out.println("Enter Numerator");
//			int n = sc.nextInt();
//			System.out.println("Enter Denominator");
//			int d = sc.nextInt();
//			int res = n/d;
//			System.out.println("Result is: " + res);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Handled in Alpha app");
//			throw e;
//		}
//		finally {
//			System.out.println("Alpha app terminated");
//			sc.close();
//		}
//		System.out.println("Done");
//	}
//}
//class Advance{
//	public static void main(String[] a) {
//		System.out.println("Main app Started");
//		try {
//			Alpha e = new Alpha();
//			e.Divide();
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Handled in Main");
//		}
//		System.out.println("Main app terminated");
//	}
//}


//class Alpha{
//	public void divide() {
//		Scanner sc = new Scanner(System.in);
//		try {
//			System.out.println("Enter Numerator");
//			int n = sc.nextInt();
//			System.out.println("Enter Denominator");
//			int d = sc.nextInt();
//			int res = n/d;
//			System.out.println("Result is: " + res);
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Handled in Alpha app");
//			throw e;
//		}
//	}
//}
//class Beta{
//	public Alpha show(Alpha a) {
//		return a;
//	}
//	public void disp() {
//		try {
//			Alpha a = new Alpha();
//			show(new Alpha());
//			a.divide();
//			a.divide();
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Handled in Beta");
//			
//		}
//	}
//}
//class Advance{
//	public static void main(String[] a) {
//		System.out.println("Main app Started");
//		try {
//			Beta e = new Beta();
//			e.disp();
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Handled in Main");
//		}
//		System.out.println("Main app terminated");
//	}
//}

// sorting according to second digit

//public class Advance 
//{
//	public static void main(String[] args)
//	{
//		Comparator<Integer> com = new Comparator<Integer>() {
//			public int compare(Integer i, Integer j) {
//				if(i%10 > j%10)
//					return 1;
//				else
//					return -1;
//			}
//		};
//		
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(23);
//		al.add(45);
//		al.add(31);
//		al.add(78);
//		
//		Collections.sort(al, com);
//		System.out.println(al);
//	}
//}


// Sorting according to length of String (Comparator)

//class Student{
//	int age;
//	String name;
//	
//	public Student(int age, String name) {
//		this.age = age;
//		this.name = name;
//	}
//	public String toString() {
//		return "Student[age= " + age + ", name= " + name + "]";
//	}
//}
//public class Advance{
//	public static void main(String[] a) {
//		Comparator<Student> com = new Comparator<Student>() {
//			public int compare(Student i, Student j) {
         // return i.name.compareTo(j.name);
//				if(i.age > j.age)
//					return 1;
//				else
//					return -1;
//			}
//		};
//		
//      Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;
//		List<Student> stud = new ArrayList<>();
//		stud.add(new Student(33, "Shruthi"));
//		stud.add(new Student(45, "Radha"));
//		stud.add(new Student(19, "Kumari"));
//		stud.add(new Student(21, "Aashu"));
//		
//		Collections.sort(stud, com);
//		for(Student s : stud)
//			System.out.println(s);
//	}
//}

// comparable 

//class Student implements Comparable<Student>{
//	int age;
//	String name;
//	
//	public Student(int age, String name) {
//		this.age = age;
//		this.name = name;
//	}
//	public String toString() {
//		return "Student[age= " + age + ", name= " + name + "]";
//	}
//	
//	public int compareTo(Student that) {
//		if(this.age > that.age)
//			return 1;
//		else
//			return -1;
//	}
//}
//public class Advance{
//	public static void main(String[] a) {
//		
//		List<Student> stud = new ArrayList<>();
//		stud.add(new Student(33, "Shruthi"));
//		stud.add(new Student(45, "Radha"));
//		stud.add(new Student(19, "Kumari"));
//		stud.add(new Student(21, "Aashu"));
//		
//		Collections.sort(stud);
//		for(Student s : stud)
//			System.out.println(s);
//	}
//}

//public class Advance{
//	public static void main(String[] a) {
//		ArrayList<String> al = new ArrayList<>();
//		al.add("Telusko");
//		al.add("Java");
//		al.add("AWS");
//		al.add("DevOps");
//		al.add("System Design");
		
//		System.out.println(al);
//		System.out.println(al.get(1));
		
//		for(int i=0; i<al.size(); i++) {
//			System.out.println(al.get(i));
//			al.add("react");  // concurrent modification
//		}
		
//		for(Object i : al) {       // no generics use this
//		    System.out.println(i);
//		}
		
//		for(String i : al) {
//			System.out.println(i);
//			al.add("react");    // concurrentModification Exception  (fail fast)
//		}
//		
//		Iterator<String> itr = al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			al.add("react");
//		}
		
//		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
//		al.add("Telusko");
//		al.add("Java");
//		al.add("AWS");
//		al.add("DevOps");
//		al.add("System Design");
		
//		Iterator itr = al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			al.add("react");
//		}
//		
//		ListIterator itr = al.listIterator(al.size());
//		while(itr.hasPrevious()) {
//			System.out.println(itr.previous());
//		}
//		
//	}
//}


// Basic Annotations  

//class Animal{
//	public void Animalhunts() {
//		System.out.println("Animal is eating....");
//	}
//}
//class Tiger extends Animal{
//	@Override
//	public void Animalhunts() {
//		System.out.println("Tiger is eating...");
//	}
//}
//public class Advance{
//	public static void main(String[] a) {
//		Animal animal = new Tiger();
//		animal.Animalhunts();
//	}
//}


class Human{
	public void sleep() {
		System.out.println("Human needs to sleep well.");
	}
}
class Employee extends Human{
	public void sleep() {
		System.out.println("Employee needs to sleep well for productive work.");
	}
}
class Advance{
	public static void main(String[] a) {
		Human human = new Human();
		Human human2 = new Human();
		
		Employee emp = new Employee();
		Employee emp2 = new Employee();
		
		ArrayList<? super Human> humanlist = new ArrayList<>();
		
		ArrayList<Employee> emplist = new ArrayList<>();
		emplist.add(emp);
		emplist.add(emp2);
		
		ArrayList<Human> humanlist2 = new ArrayList<>();
		humanlist2.add(human);
		humanlist2.add(human2);
		invockSleep(emplist);
		
	}
	public static void invockSleep(List<? extends Human> list) {
		for(Human human : list) {
			human.sleep();
		}
	}
}