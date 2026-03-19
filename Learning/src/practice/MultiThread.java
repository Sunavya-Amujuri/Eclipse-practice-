package practice;
import java.util.*;

//public class MultiThread {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.out.println("Thread work gets started");
//		Thread t1 = Thread.currentThread();
//		System.out.println(t1.getName());   // default main thread
//		System.out.println(t1.getPriority());   // default priority
//		System.out.println("************************");
//		
//		t1.setName("Telusko");
//		t1.setPriority(3);
//		System.out.println(t1.getName()); 
//		System.out.println(t1.getPriority()); 
//		
//		System.out.println("Thread work stops here.");
//	}
//}

// practice 1

//class Alpha extends Thread{
//	public void registration() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your id: ");
//		int id = sc.nextInt();
//		System.out.println("Enter your age: ");
//		int age = sc.nextInt();
//		System.out.println("id: " + id + "age: " + age);
//	}
//	@Override
//	public void run() {   // makes thread to work/run
//		registration();
//	}
//}
//class Beta extends Thread{
//	public void printsStar() {
//		for(int i=0; i<5; i++) {
//			System.out.println("* ");
//			try {
//				Thread.sleep(5000);
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	public void run() {
//		printsStar();
//	}
//}
//class Gamma extends Thread{
//	public void Threadfly() {
//		for(int i=0; i<5; i++) {
//			System.out.println("Visit telusko.com...");
//			try {
//				Thread.sleep(5000);
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	public void run() {
//		Threadfly();    // calling method
//	}
//}
//public class MultiThread {
//
//	public static void main(String[] args) throws InterruptedException {
//		Alpha a = new Alpha();   //  created class thread, but doesnot have life
//		Beta b = new Beta();
//		Gamma c = new Gamma();   // 3+1 = 4 thread stack is created
//		
//		a.start();   // giving life to thread, but doesnot print. Use run() to work
//		b.start();
//		c.start();
//	}
//}

// practice 2

//class Alpha implements Runnable{
//	public void registration() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your id: ");
//		int id = sc.nextInt();
//		System.out.println("Enter your age: ");
//		int age = sc.nextInt();
//		System.out.println("id: " + id + "age: " + age);
//	}
//	@Override
//	public void run() {   // makes thread to work/run
//		registration();
//	}
//}
//class Beta implements Runnable{
//	public void printsStar() {
//		for(int i=0; i<5; i++) {
//			System.out.println("* ");
//			try {
//				Thread.sleep(5000);
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	public void run() {
//		printsStar();
//	}
//}
//class Gamma implements Runnable{
//	public void Threadfly() {
//		for(int i=0; i<5; i++) {
//			System.out.println("Visit telusko.com...");
//			try {
//				Thread.sleep(5000);
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	public void run() {
//		Threadfly();
//	}
//}
//public class MultiThread {
//
//	public static void main(String[] args) throws InterruptedException {
//		Alpha a = new Alpha();   
//		Beta b = new Beta();
//		Gamma c = new Gamma();  
//		
//		Thread t1 = new Thread(a);
//		Thread t2 = new Thread(b);
//		Thread t3 = new Thread(c);
//		
//		t1.start();   
//		t2.start();
//		t3.start();
//	}
//}


// practice 3

//class Telusko implements Runnable{
//	
//	public void run() {
//		String threadName = Thread.currentThread().getName();
//		if(threadName.equals("Reg")) {
//			registration();
//		} else if(threadName.equals("Course")) {
//			printsStar();
//		} else {
//			Threadfly();
//		}
//	}
//	public void registration() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your id: ");
//		int id = sc.nextInt();
//		System.out.println("Enter your age: ");
//		int age = sc.nextInt();
//		System.out.println("id: " + id + "age: " + age);
//	}
//	
//	public void printsStar() {
//		for(int i=0; i<5; i++) {
//			System.out.println("* ");
//			try {
//				Thread.sleep(5000);
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	public void Threadfly() {
//		for(int i=0; i<5; i++) {
//			System.out.println("Visit telusko.com...");
//			try {
//				Thread.sleep(5000);
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}	
//}
//class MultiThread{
//	public static void main(String[] a) throws InterruptedException {
//		System.out.println("Main thread started.");
//		Telusko telusko = new Telusko();
//		
//		Thread t1 = new Thread(telusko);
//		Thread t2 = new Thread(telusko);
//		Thread t3 = new Thread(telusko);
//		
//		t1.setName("Reg");
//		t2.setName("Course");
//		t3.setName("Star");
//		
//		t1.start();
//		t2.start();
//		t3.start();
		
//		t1.join();
//		t2.join();
//		t3.join();
		
//		t3.join();
//		
//		System.out.println("Middle of work.");
//		System.out.println("Main thread ended.");
//	}
//}

// practice 4   (locked entire method)

//class MyCar implements Runnable{
//	synchronized public void run() {
//		try {
//			System.out.println(Thread.currentThread().getName() + " has entered parking lot.");
//			Thread.sleep(5000);
//			System.out.println(Thread.currentThread().getName() + " has entered into car driving seat.");
//			Thread.sleep(5000);
//			System.out.println(Thread.currentThread().getName() + " started to drive car.");
//			Thread.sleep(5000);
//			System.out.println(Thread.currentThread().getName() + " has come back and parked the car.");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
//class MultiThread{
//	public static void main(String[] a) {
//		MyCar car = new MyCar();
//		
//		Thread t1 = new Thread(car);
//		Thread t2 = new Thread(car);
//		Thread t3 = new Thread(car);
//		
//		t1.setName("Ramesh");
//		t2.setName("Suresh");
//		t3.setName("Dinesh");
//		
//		t1.start();
//		t2.start();
//		t3.start();
//	}
//}

// practice 5 (locked only few cases)

//class MyCar implements Runnable{
//	public void run() {
//		try {
//			System.out.println(Thread.currentThread().getName() + " has entered parking lot.");
//			Thread.sleep(5000);
//			synchronized(this) {
//				System.out.println(Thread.currentThread().getName() + " has entered into car driving seat.");
//				Thread.sleep(5000);
//				System.out.println(Thread.currentThread().getName() + " started to drive car.");
//				Thread.sleep(5000);
//				System.out.println(Thread.currentThread().getName() + " has come back and parked the car.");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
//class MultiThread{
//	public static void main(String[] a) {
//		MyCar car = new MyCar();
//		
//		Thread t1 = new Thread(car);
//		Thread t2 = new Thread(car);
//		Thread t3 = new Thread(car);
//		
//		t1.setName("Ramesh");
//		t2.setName("Suresh");
//		t3.setName("Dinesh");
//		
//		t1.start();
//		t2.start();
//		t3.start();
//	}
//}

// practice 6

//class Library implements Runnable
//{
//	String java = new String("Java");
//	String devops = new String("Devops");
//	String aws = new String("AWS");
//	
//	public void run() 
//	{
//		String name = Thread.currentThread().getName();
//		if(name.equals("Kapil"))
//		{
//			try
//			{
//				System.out.println("Kapil got into Library.");
//				Thread.sleep(5000);
//				synchronized(java)
//				{
//					System.out.println("Kapil has acquired java book.");
//					Thread.sleep(5000);
//					synchronized(devops)
//					{
//						System.out.println("Kapil has acquired devops book.");
//						Thread.sleep(5000);
//						synchronized(aws)
//						{
//							System.out.println("Kapil has acquired aws book.");
//							Thread.sleep(5000);
//						}
//					}
//				}
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}
//		} else
//		{
//			try
//			{
//				System.out.println("Dinesh got into Library.");
//				Thread.sleep(5000);
//				synchronized(java)
//				{
//					System.out.println("Dinesh has acquired java book.");
//					Thread.sleep(5000);
//					synchronized(devops)
//					{
//						System.out.println("Dinesh has acquired devops book.");
//						Thread.sleep(5000);
//						synchronized(aws)
//						{
//							System.out.println("Dinesh has acquired aws book.");
//							Thread.sleep(5000);
//						}
//					}
//				}
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//			}
//		}
//	}
//}
//public class MultiThread
//{
//	public static void main(String[] a)
//	{
//		Library lib = new Library();
//		
//		Thread t1 = new Thread(lib);
//		Thread t2 = new Thread(lib);
//		
//		t1.setName("Kapil");
//		t2.setName("Dinesh");
//		
//		t1.start();
//		t2.start();
//	}
//}

// practice 7

//public class MultiThread extends Thread{
//	public MultiThread(String name) {
//		
//	}
//	public void run() {
//		
//	}
//	public static void main(String[] a) {
//		MultiThread t1 = new MultiThread("java");    // thread overloading is possible
//		MultiThread t2 = new MultiThread("aws");
//		
////		t1.setName("java");
////		t2.setName("aws");
//		
//		t1.start();
//		t2.start();
//	}
//}

// practice 8

//class Alien implements Runnable{
//	public void run() {
//		System.out.println("Task for new Thread.");
//	}
//}
//public class MultiThread{
//	public static void main(String[] args) {
//		Alien a = new Alien();
//		Thread t1 = new Thread(a);  
//		t1.start();       // case 1
		
//		Thread t1 = new Thread(new Alien()); 
//		t1.start();     // case 2
		
//		Runnable run = new Runnable() {
//			public void run() {
//				System.out.println("Task for new Thread.");
//			}
//		};
//		Thread t = new Thread(run);
//		t.start();    // case  3
		
//		Runnable run = () -> System.out.println("Task for new Thread.");
//		Thread t = new Thread(run);
//		t.start();   // case 4
		
//		Thread t = new Thread(() -> System.out.println("Task for new Thread."));
//		t.start();     // case 5
		
//		new Thread(() -> System.out.println("Task for new Thread.")).start();    // case 6
		
//		new Thread(() ->
//		{
//			System.out.println("Task for new Thread.");
//		}
//		).start();    // case 7
//	}
//}

public class MultiThread{
	public static void main(String[] args) {
		System.out.println("Main thread strated.");
		int a = 4;
		int b = 5;
		
		for(int i=0; i<4; i++) {
			System.out.println("Learnig new course.");
		}
		System.out.println("Main thread ended.");
	}
	
}