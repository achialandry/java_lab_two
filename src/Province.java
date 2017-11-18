
/**
 * Class Province which gives details and information about name, capital, total number  of inhabitants in Country with current case study being Canada.
 * @author Landry Achia, Ndong
 *
 */
public class Province {
	
	/**
	 * name for each province
	 */
	private String name;
	
	/**
	 * name of capital for each province
	 */
	private String capital;
	
	/**
	 * total number in millions of people in each province 
	 */
	private int populationInMillions;
	
	/**
	 * Default population per province in millions
	 */
	public static final int DEFAULT_POPULATION_MILLIONS = 4;
	
	/**
	 * This gives the minimum population in millions for each province
	 */
	public static final int MIN_POPULATION_IN_MILLIONS = 0;
	
	
	/**
	 * Default maximum population per province 
	 */
	public static final int MAX_POPULATION_IN_MILLIONS = 38;
	
	/**
	 * Default province name
	 */
	public static final String DEFAULT_PROVINCE = "British Columbia";
	
	/**
	 * Default name for province Capital
	 */
	public static final String DEFAULT_CAPITAL = "Victoria";
	
	
	/**
	 * Constructor for the Province class, default constructor
	 */
	public Province() {
		this.name = DEFAULT_PROVINCE;
		this.capital = DEFAULT_CAPITAL;
		this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
		
	}
	
	
	
	/**
	 * Constructor for Province class taking 3 parameters
	 * @param name is name of a Province
	 * @param capital is capital of a province
	 * @param populationInMillions population in millions of inhabitants in a province
	 */
	public Province(String name, String capital, int populationInMillions) {
		if(this.isValidProvince(name) && this.isValidCapitalCity(capital) && this.isValidPopulation(populationInMillions)){
			this.name = name;
			this.capital = capital;
			this.populationInMillions = populationInMillions;
		}else {
			this.name = DEFAULT_PROVINCE;
			this.capital = DEFAULT_CAPITAL;
			this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
		}
		
	}
	
	
	/**
	 * List of provinces in Canada
	 * @param province list in Canada
	 * @return validProvince true if province  is valid
	 */
	private boolean isValidProvince(String province) {
		boolean provinceResult = false;
		int i = 0;
		String [] provinces = {"Ontario","Quebec", "Nova Scotia", "New Brunswick","Manitoba", "British Columbia", "Prince Edward Island", "Saskatchewan", "Alberta","New Foundland and Labrador" };
		
			while(!provinceResult) {
				if(province.equals(provinces[i])) {
					provinceResult = true; 
					
				}
				i++;
			}
		
		
		return provinceResult;
	}
	
	
	/**
	 * method to check if there is a valid capital city 
	 * @param city name or capital city of province
	 * @return returns true if capital city name is valid
	 */
	private boolean isValidCapitalCity(String city) {
		boolean cityResult = false;
		int i = 0;
		String [] cities = {"Toronto","Quebec City","Halifax","Fredericton", "Winnipeg", "Victoria", "Charlottetown","Regina","Edmonton","St. John's" };
		for(String validCity : cities) {
				if(validCity.equals(cities[i])) {
					cityResult = true; 
				}
			i++;
		}
		
		return cityResult;
	}
	
	/**
	 * checks to see if population per province is valid
	 * @param population variable of each province
	 * @return returns true if population is valid
	 */
	private boolean isValidPopulation (int population) {
		boolean validPopulation = false;
		if((population >= DEFAULT_POPULATION_MILLIONS) && (population <= MAX_POPULATION_IN_MILLIONS)) {
			validPopulation = true;
		}
		
		return validPopulation ;
	}



	/**
	 * @return the name of province
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name of province to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the capital of each province
	 */
	public String getCapital() {
		return capital;
	}



	/**
	 * @param capital the capital of province to set
	 */
	public void setCapital(String capital) {
		this.capital = capital;
	}



	/**
	 * @return the populationInMillions for each province
	 */
	public int getPopulationInMillions() {
		return populationInMillions;
	}



	/**
	 * @param populationInMillions the populationInMillions to set
	 */
	public void setPopulationInMillions(int populationInMillions) {
		this.populationInMillions = populationInMillions;
	}
	
	
	/**
	 * method for getDetails for each province
	 * @return the detail output for each province
	 */
	public String getDetails() {
		String detailsOuput = "The Capital of  " + this.getName() + "( pop. " + this.getPopulationInMillions() + " millions)" + " is " + this.getCapital();
		return detailsOuput;
	}
	
}
