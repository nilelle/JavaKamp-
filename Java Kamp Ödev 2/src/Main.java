
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course course1 = new Course("C#+Angular Kampı","Engin Demirog");
		Course course2 = new Course("Java+React Kampı","Engin Demirog");
		
		Student student1= new Student("Bora Kaya");
		CourseManager coursemanager = new CourseManager();
		coursemanager.createCourse(course1); //Kurs oluşturma
		coursemanager.createCourse(course2);
		coursemanager.addToCourse(student1);  //Öğrenciyi kursa ekleme
		
		
		Instructor instructor = new Instructor();
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.getInstructor(course1,instructor); //Eğitmeni gösterme
		instructorManager.getInstructor(course2,instructor);
		
		
		
		
		
		Course courses[]= {course1,course2}; //Kursları Listeleme
		for(Course course: courses) {
			System.out.println(course.coursename);
		}
		
		
		
	}

}
