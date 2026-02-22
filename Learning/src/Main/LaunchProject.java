package Main;

import service.Devops;
public class LaunchProject {

	public static void main(String[] args) {
		purchase p = new purchase(new Devops());
		
//		purchase p = new purchase();
//		p.setCourse(null);
		boolean status = p.buyTheCourse();
		
		if(status)
			System.out.println("Successfully registered at telusko");
		else
			System.out.println("Successfully registered at telusko");

	}
}
