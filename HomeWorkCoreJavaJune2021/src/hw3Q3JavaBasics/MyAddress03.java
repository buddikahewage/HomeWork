package hw3Q3JavaBasics;

public class MyAddress03 {

	public static void main(String[] args) {
		String MyName = "Bonny Hewage";
		int houseNumber = 2920;
		String StreetName = "Hone Ave";
		String CityName = "Bronx";
		String StateName = "NY";
		int zipCode = 10469;
		boolean inNy = true;

		System.out.println(MyName + " " + houseNumber + " " + StreetName + " " + CityName + " " + StateName + " "
				+ zipCode + " " + inNy);
		System.out.println("\n\t" + MyName + "\n\t" + houseNumber + "\n\t" + StreetName + "\n\t" + CityName + "\n\t"
				+ StateName + "\n\t" + zipCode + "\n\t" + inNy);
		System.out.println("\n\t" + MyName + "\n\t" + houseNumber + "," + StreetName + "\n\t" + CityName + ","
				+ StateName + "\n\t" + zipCode + "\n\t" + inNy);
		System.out.println("\n\t" + MyName + "\n\t" + houseNumber + "," + StreetName + "\n\t" + CityName + ","
				+ StateName + "," + zipCode + "\n\t" + inNy);

	}

}
