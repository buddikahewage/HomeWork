package lec13_java_oop_encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStNameString("Bonny");
		student.setStId(2021009);
		student.setSex('M');
		student.isUsCitizen();
		student.setGrade(3.9876f);
		student.setAge(37.3256);
		System.out.println("");
		

	}

}
