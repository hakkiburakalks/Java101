
public class Main {

	public static void main(String[] args) {
		 Course mat = new Course("Matematik", "MAT101", "MAT");
	        Course fizik = new Course("Fizik", "FZK101", "FZK");
	        Course kimya = new Course("Kimya", "KMY101", "KMY");

	        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
	        Teacher t2 = new Teacher("Fatma Ayþe", "90550000001", "FZK");
	        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

	        mat.addTeacher(t1);
	        fizik.addTeacher(t2);
	        kimya.addTeacher(t3);

		
		Student s1 = new Student("Burak A.", "804", 4, mat, fizik, kimya);
		
		s1.addBulkExamNote(100, 200, 40);
		s1.printNote();
		s1.isPass();
		
		
	}

}
