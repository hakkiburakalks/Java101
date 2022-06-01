
public class Course {

	Teacher courseTeacher;
	String name;
    String code;
    String prefix;
    int note = 0;
    
	public Course( String name, String code, String prefix) {
		super();
		this.name = name;
		this.code = code;
		this.prefix = prefix;
	
	}
	
	
	void addTeacher(Teacher courseTeacher) {
		if (courseTeacher.branch.equals(this.prefix)) {
			this.courseTeacher = courseTeacher;
		}
		
		else {
			System.out.println("Öðretmen ve Ders Bölümleri Uyuþmuyor");
		}
		
		
		
	}
	
	
    void printTeacherInfo() {
    	this.courseTeacher.print(); 
    }
    
	
	
}
