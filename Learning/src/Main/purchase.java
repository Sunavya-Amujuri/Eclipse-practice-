package Main;

import service.ICourse;

public class purchase {
	private ICourse course;
	
	public purchase(ICourse course) {
		this.course = course;
	}
	
	public purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setCourse(ICourse course) {
		this.course = course;
	}
	
	public boolean buyTheCourse(){
		return course.registerCourse();
	}
}
