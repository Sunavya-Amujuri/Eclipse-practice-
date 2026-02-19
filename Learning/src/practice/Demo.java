package practice;

//class Telusko{
//	void sleep() {
//		System.out.println("Sleeping...");    // inherited method
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