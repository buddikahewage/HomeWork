package hw5Q4Constructor;
/*
 * Create a package name "hw5Q4Constructor" in your HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (grade as char). Declare default constructor and multiple parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class TestComputer. Create object as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as --> This is from default Constructor of Computer class. Second outcome as-- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? : false. I want the third outcome in console for your configuration. Fourth outcome for 1 variable, 5th outcome for 3 variable, 6th outcome for 5 variable. Organize your code. Push in the github. Paste your github link below. (Please paste the whole question inside the multiple line comments between package and class)
 * **/

public class TestComputer {

	public static void main(String[] args) {
		Computer computer1 = new Computer();
		Computer computer2 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, false, 'C');
		Computer computer3 = new Computer("HP", "Hp Pavilion", "Windows", 700, false, 'C');
		Computer computer4 = new Computer("HP");
		Computer computer5 = new Computer("HP", "Hp Pavilion", 700);
		Computer computer6 = new Computer("HP", "Hp Pavilion", "Windows", 700, false);

	}

}
