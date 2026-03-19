package practice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

//class Telusko{
//	void sleep() {
//		System.out.println("Sleeping...");    // Inherited method
//	}
//	void dressing() {
//		System.out.println("Dressing..");
//	}
//}
//class time extends Telusko{
//	void dressing() {
//		System.out.println("Beautiful Dress...");    // overridden method
//	}
//	void habit() {
//		System.out.println("learning java...");      // specialized method
//	}
//}
//class trend extends Telusko{
//	void dressing() {
//		System.out.println("more Beautiful Dress...");
//	}
//	void habit() {
//		System.out.println("latest learning java...");
//	}
//}
//public class Demo {
//	public static void main(String[] args) {
//		Telusko t = new trend();    // parent reference type
//		t.sleep();
//		t.dressing();
//		((trend)t).habit();
//	}
//}


//class start1{
//	int a, b;
//	start1(){
//		this(5, 5);
//		System.out.println("Start1 executed");
//	}
//	start1(int a, int b){
//		this.a = a;
//		this.b = b;
//		System.out.println("start1 parameter");
//	}
//}
//class start2 extends start1{
//	int x, y;
//	start2(){
//		super();
//		System.out.println("Start2 executed");
//	}
//	start2(int x, int y){
//		this();
//		this.x = x;
//		this.y = y;
//		System.out.println("start2 parameter");
//	}
//	void show() {
//		System.out.println(a + " " + b);
//		System.out.println(x + " " + y);
//	}
//}
//public class Demo{
//	public static void main(String[] a) {
//		start2 st = new start2(4, 5);
//		st.show();
//	}
//}


//class Telusko1 {
//	int age=10;	
//	void disp()
//	{
//		//age=4;
//		System.out.println(age);
//		System.out.println("disp of parent");		
//	}
//}
//class Alien extends Telusko1{
//	int age=11;
//	//int age;	
//	void disp()
//	{
//		age=6;
//		System.out.println(age);
//		System.out.println("disp of child overriden");
//	}
//	void show()
//	{
//		//super.disp();
//		System.out.println(age);
//		System.out.println(super.age);
//	}
//}
//public class Demo{
//	static public void main(String[] args) {
//		Alien a=new Alien();
//		a.show();
//		a.disp();
//	}
//}

//class TeluskoMain{
//	
//}
//class TeluskoAi extends TeluskoMain{
//	
//}
//class Animal{
//	int age = 10;
//	public void eat() {
//		System.out.println("Animal is eating..");  
//	}
//	public void age() {
//		System.out.println(age);
//	}
//	public TeluskoMain animalLearn() {
//		TeluskoMain t = new TeluskoMain();
//		return t;
//	}
//}
//class Tiger extends Animal{
//	int age = 11;
//	public void eat() {            // method overloading
//		System.out.println("Tiger hunts and eat...");
//	}
//	public void age() {        // method overriding
//		System.out.println(super.age);
//	}
//	public TeluskoAi animalLearn() {
//		TeluskoAi t = new TeluskoAi();
//		return t;
//	}
//}
//public class Demo{
//	public static void main(String[] a) {
//		Tiger t = new Tiger();
//		t.age();
//		t.eat();
//	}
//}

// Polymorphism

//abstract class AeroPlane{
//	abstract int age;    // invalid/ illegal
//	public abstract void takeOff();
//	public abstract void fly();
//	public void takeOff() {
//		System.out.println("Plane is taking off..");     // overridden method
//	}
//	public void fly() {
//		System.out.println("Plane is flying..");        // overridden method
//	}
//}
//class CargoPlane extends AeroPlane{
//	public void takeOff() {
//		System.out.println("CargoPlane is taking off..");     // overridden method
//	}
//	public void fly() {
//		System.out.println("CargoPlane is flying..");         // overridden method
//	}
//}
//class FighterPlane extends AeroPlane{
//	public void takeOff() {
//		System.out.println("FighterPlane is taking off..");
//	}
//	public void fly() {
//		System.out.println("FighterPlane is flying..");
//	}
//}
//class Airport{
//	public void permit(AeroPlane aero) {        // parent reference
//		System.out.println("Using parent reference: " + aero.getClass().getSimpleName());
//		aero.takeOff();
//		aero.fly();
//		System.out.println("--------------------------");
//	}
//}
//public class Demo{
//	public static void main(String [] args) {
//		AeroPlane cp = new CargoPlane();
//		AeroPlane fp = new FighterPlane();
//		
//		Airport a = new Airport();
//		a.permit(cp);
//		a.permit(fp);
//		
//		AeroPlane aero;
//		Airport a = new Airport();
//		aero = cp;
//		
//		a.permit(aero);
//		
//		aero = fp;
//		a.permit(aero);
//	}
//}

// static inheritance

//class Animal{
//	static int age = 33;
//	static void disp() {
//		System.out.println("Parent class static method.");
//	}
//}
//class Dog extends Animal{
//	static void disp() {
//		System.out.println("Child class static method.");
//	}
//	public void show() {
//		age = 15;      // updated but referred to parent type only
//		System.out.println(age);
//	}
//}
//public class Demo{
//	public static void main(String[] args) {
//		Dog a = new Dog();
//		a.disp();
//		a.show();
//	}
//}

// Interface

//interface Calculator{
//	void sub();
//}
//interface Calc{
//	float pi = 3.14f;
//	void add(int a, int b);
//	int mul(int a, int b);
//}
//class MyCalc implements Calculator, Calc{
//	public void add(int a, int b) {
//		int c = a+b;
//		System.out.println("Addition: " + c);
//	}
//	public int mul(int a, int b) {
//		return a*b;
//	}
//	public void sub() {
//		System.out.println("sub");
//	}
//}
//class TeluskoLearning{
//	void add(int a, int b) {
//		
//	}
//}
//class MyCalc2 extends TeluskoLearning implements Calc{
//	public void add(int a, int b) {
//		int c = a+b+100;
//		System.out.println("Addition: " + c);
//	}
//	public int mul(int a, int b) {
//		return a*b*100;
//	}
//}
//public class Demo{
//	public static void main(String[] args) {
//		MyCalc c = new MyCalc();
//		c.add(2, 3);
//		System.out.println(c.mul(3, 3));
//		System.out.println("**********************");
//		Calc c1 = new MyCalc2();
//		c1.add(4, 5);
//		System.out.println(c1.mul(5, 5));
//	}
//}

// interface 2

//interface Animal{
//	default void Dog() {      // default method can use in interface after java 8
//		System.out.println("Dog barks..");
//		helper();
//	}
//	static void eating() {
//		System.out.println("Dog is eating..");
//	}
//	private void helper() {
//		System.out.println("private..");
//	}
//}
//class Pet implements Animal{
//	public void Dog() {
//		System.out.println("Dog is barking and eating..");
//	//	Animal.super.Dog();
//	}
//}
//public class Demo{
//	public static void main(String[] args) {
//		Pet p = new Pet();
//		p.Dog();
//		Animal.eating();
//	}
//}



//interface ICourse{
//	String course(String name);
//}
//class courseAI implements ICourse{
//	public String course(String name) {
//		return "Course duration of " + name + " is 5 months.";
//	}
//}
//public class Demo{
//	public static void main(String[] a) {
//		ICourse c = new courseAI();
//		System.out.println(c.course("java"));
		
		// option 1
//		ICourse course = (String name) -> {
//			return "Course duration of " + name + " is 5 months.";
//		};
//		courseInfo(course);
		
		// option 2
//		ICourse course = name -> "Course duration of " + name + " is 5 months.";
//		courseInfo(course);
		
		//option 3
//		courseInfo(name -> "Course duration of " + name + " is 5 months.");
//	}
//	public static void courseInfo(ICourse course) {
//		System.out.println("Course duration is " + course.course("Java") );
//	}
//}


//public class Demo{
//	public static void main(String[] a) {
//		int arr[][] = new int[3][];
//		arr[0] = new int[4];
//		arr[1] = new int[2];
//		arr[2] = new int[3];
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.println("Kindly enter marks of class " + i + " student " + j);
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println("Marks are stored as below: ");
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//}

// static 

//class practice
//{
//	static int a ,b; //1
//	
//	int x ,y;
//
//	static  // 2
//	{
//		System.out.println("Static init block");
//	}
//	
//	{
//		System.out.println("Java init block(non static)");
//	}
//	
//	
//	practice()
//	{
//		System.out.println("Constructor");
//	}
//	
//	static  // 2
//	{
//		System.out.println("Static init block");
//	}
//	static void disp()
//	{
//		System.out.println("disp static method");
//	}
//	
//	void show()
//	{
//		System.out.println("non static show method");
//	}
//}
//public class Demo
//{
//	
//	static
//	{
//		System.out.println("static block main");
//	}
//	
//	public static void main(String[] args) 
//	{
//		System.out.println("main method");
//		
//		practice d=new practice();
//		d.show();
//		
//		//disp();
//	}
//}

//class Parent {
//    static int x = 10;
//}
//
//class Child extends Parent {
//    static int x = 20;
//}
//
//public class Demo {
//    public static void main(String[] args) {
//        Parent p = new Child();
//        child();
//    }
//}

//class Parent {
//    static void show() {
//        System.out.println("Parent show");
//    }
//}
//
//class Child extends Parent {
//    static void show() {
//        System.out.println("Child show");
//    }
//}
//
//public class Demo {
//    public static void main(String[] args) {
//        Parent p = new Child();
//        p.show();  // parent show,   they are inherited and hidden.
//    }
//}


//class Parent {
//    static final int a = 10;
//
//    static {
//        System.out.println("Class Loaded");
//    }
//}
//
//public class Demo {
//    public static void main(String[] args) {
//        System.out.println(Parent.a);    // 10   - constant inlining
//    }
//}

//class Animal {
//    Animal() {
//        System.out.println("Animal constructor");
//    }
//}
//
//class Dog extends Animal {
//    Dog() {
//    	//super()
//        System.out.println("Dog constructor");
//    }
//}
//
//public class Demo {
//    public static void main(String[] args) {
//        Dog d = new Dog();   // Animal constructor     Dog constructor
//    }
//}


// Interface
//interface Camera {
//	default void start() {
//		System.out.println("Default method");
//	}
//}
//
//interface MusicPlayer {
//	void start();
//}
//
//class SmartPhone implements Camera, MusicPlayer {
//	public void start() {
//        System.out.println("Implemented");    }
//}
//
//public class Demo {
//    public static void main(String[] args) {
//        SmartPhone s = new SmartPhone();
//        s.start();
////        s.playMusic();
//    }
//}

// loose coupling

//interface Animal{
//	void sound(double amount);
//}
//class Dog implements Animal{
//	public void sound(double amount) {
//		System.out.println("Dog Barks..");
//	}
//}
//class Cat implements Animal{
//	public void sound(double amount) {
//		System.out.println("Cat meows.." + amount);
//	}
//}
//class Zoo{
//	Animal animal;
//	
//	void setAnimal(Animal animal) {
//		this.animal = animal;
//	}
//	public void makeSound(double amount) {
//		if(animal == null)     // if this not resent then it is null pointer exception
//			System.out.println("Animal not set.");
//		else
//			animal.sound(amount);
//		
//	}
//}
//public class Demo{
//	public static void main(String[] args) {
//		Zoo z = new Zoo();
//		
//		//z.setAnimal();  not setting animal intentionally
//		z.makeSound(4999.9);
//		
//		z.setAnimal(new Cat());
//		z.makeSound(3555.5);
//	}
//}

// Lambda expression

//interface ICourse{
//	String course(String name);
//}
//class Demo{
//	public static void main(String[] a) {
////		ICourse course = name -> "course name is " + name;
////		courseInfo(course);
//		
//		courseInfo(name -> "course name is " + name);
//	}
//	public static void courseInfo(ICourse course) {
//		System.out.print("name " + course.course("java"));
//	}
//}

//import java.util.Arrays;
//
//public class Demo
//{
//	public static void main(String[] args) 
//	{
// 		int []ar=new int[4];
//		float []ar=new float[4];
		
//		double [][]ar=new double[4][3];
// 		
// 		System.out.println(ar.getClass().getName());
// 		String str[]= {"saketh"};
// 		int a[]= {4,2,3,5,6,1};
 		//utility ==> Arrays
// 		System.out.println(a);
// 		for(int data:a)
// 		{
// 			System.out.print(data+ " ");
// 		}
// 		
// 		Arrays.sort(a);
// 		
// 		System.out.println("After sorting");
// 		for(int data:a)
// 		{
// 			System.out.print(data+" ");
// 		}
// 		System.out.println();
// 		int d=Arrays.binarySearch(a, 4);
// 		System.out.println(d);		
//	}
//}
