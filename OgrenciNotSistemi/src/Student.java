
public class Student {

	String name;
	String stuNo;
	int classes;
	Course course1;
	Course course2;
	Course course3;
	double avarage;
	boolean isPass;
	
	
	public Student(String name, String stuNo, int classes, Course course1, Course course2, Course course3) {
		super();
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		this.isPass = false;
	}	
	
	
	void addBulkExamNote(int note1,int note2,int note3) {
		
		if (note1>=0 && note1<=100) {
			this.course1.note =note1;
		}
		
		if (note2>=0 && note2<=100) {
			this.course2.note =note2;
		}
		
		
		if (note3>=0 && note3<=100) {
			this.course3.note = note3;
		}
		
	}
	
	void printNote() {
		System.out.println(this.course1.name + "Notu\t"+course1.note);
		System.out.println(this.course2.name + "Notu\t"+course2.note);
		System.out.println(this.course3.name + "Notu\t"+course3.note);
	}
	
	
	void isPass() {
		this.avarage = (this.course1.note + this.course2.note + this.course3.note) / 3.0;  
		
		
		if(this.avarage >= 0 && this.avarage < 50) {
			System.out.println("Kaldýnýz");
			this.isPass = false;
		}
		
		else {
			System.out.println("Geçtiniz");
			this.isPass = true;
		}
		
		
		
	}
	
	
	
	
	
	
}
