package hw4Q3JavaVariablesConstructorAndMethod;

public class TestMyProfile {

	public static void main(String[] args) {
		MyProfile bonny = new MyProfile(); // Constructor Initialized
		bonny.MyName = "Bonny";
		bonny.mySex = 'M';
		bonny.myAge = 37;
		bonny.usCitizen = true;
		bonny.yearsWork = 15;
		bonny.myHouseRent = 3000;
		bonny.mySalary = 125000;
		bonny.myClassGrade = 3.625f;
		bonny.myHight = 1.5206213;
		bonny.myProfile();

		MyProfile jhon = new MyProfile(); // Constructor Initialized
		jhon.MyName = "Jhon";
		jhon.mySex = 'M';
		jhon.myAge = 40;
		jhon.usCitizen = true;
		jhon.yearsWork = 20;
		jhon.myHouseRent = 5000;
		jhon.mySalary = 175000;
		jhon.myClassGrade = 3.565f;
		jhon.myHight = 1.83206213;
		jhon.myProfile();

	}

}
