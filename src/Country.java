/**
 * Class Country that  list of all provinces and population per province in country
 * @author Landry Achia, Ndong
 *
 */
public class Country {
	
	/**
	 * name of country 
	 */
	private String name;
	
	/**
	 * provinces in the country
	 */
	private Province[] provinces;
	
	/**
	 * This gives the full list of provinces and the capitals in Canada
	 * Constructor for Country class
	 */
	public Country() {
		this.name = "Canada";
		this.provinces = new Province [10];
		
		provinces[0] = new Province("Ontario", "Toronto", 13);
		provinces[1] = new Province("Quebec", "Quebec City", 8);
		provinces[2] = new Province("Nova Scotia", "Halifax", 9);
		provinces[3] = new Province("New Brunswick", "Fredericton", 7);
		provinces[4] = new Province("Manitoba", "Winnipeg", 2);
		provinces[5] = new Province("British Columbia", "Victoria", 5);
		provinces[6] = new Province("Prince Edward Island", "Charlottetown", 1);
		provinces[7] = new Province("Saskatchewan", "Regina", 1);
		provinces[8] = new Province("Alberta", "Edmonton", 4);
		provinces[9] = new Province("New Foundland and Labrador", "St. John's", 1);
	}
	
	/**
	 * method displays all provinces in Canada
	 */
	public void displayAllProvinces() {
		for(Province province : provinces) {
			System.out.println(province.getDetails());
		}
	}
	
	/**
	 * method to determine how many regions have population within a ranger
	 * @param min variable for minimum population for the ranger
	 * @param max variable for maximum population for the ranger
	 * @return the total number of provinces with population in range min and max
	 */
	public int howManyHaveThisPopulation(int min, int max) {
		int provincesWithPopulation = 0;
		for(Province province : provinces) {
			if(province.getPopulationInMillions() >= min && province.getPopulationInMillions() <= max) {
				provincesWithPopulation ++;
			}
		}
		return provincesWithPopulation;
	}

}
