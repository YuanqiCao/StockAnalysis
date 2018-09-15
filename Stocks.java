
public class Stocks {

	String name;
	String industry;
	double PE;
	double netWorth;
	//add more variables, the more the better
	
	public Stocks(String name, String industry, double PE, double netWorth)
	{
		this.name = name;
		this.industry = industry;
		this.PE = PE;
		this.netWorth = netWorth;
	}
	
	public void setName(String input) {
		name = input;
	}

	public void setIndustry(String input) {
		 industry = input;
	}
	
	public void setPE(double input)
	{
	   PE= input;
	}
	
	public void setName(double c)
	{
		netWorth = c;
	}
	
}
