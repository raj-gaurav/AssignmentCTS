public class Course{
	private String courseId;
	private String courseTitle;
	private String courseInstructor;
	private static int noOfInstructors;
	
	public String getCourseId(){
		return courseId;
	}
	
	public void setCourseId(String courseId){
		this.courseId = courseId;
	}
	
	public String getCourseTitle(){
		return courseTitle;
	}
	
	public void setCourseTitle(String courseTitle){
		this.courseTitle = courseTitle;
	}
	
	public String getCourseInstructor(){
		return courseInstructor;
	}
	
	public void setCourseInstructor(String courseInstructor){
		this.courseInstructor = courseInstructor;
	}
	
	public static int getNoOfInstructors(){
		return noOfInstructors;
	}
	
	public static void setNoOfInstructors(int noOfInstructor){
		noOfInstructors = noOfInstructor;
	}
	
	public String getCourseInstructor(){
		return courseInstructor;
	}
	
	
	
}