package accu;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Accu {
	
	@NotNull(message = "het percentage mag niet leeg zijn")
    @Min(value=0, message = "percentage mag niet onder de 0 zijn")
    @Max(value=100, message = "percentage mag niet hoger dan 100 zijn")
	private int percentage;
	
	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	public int calculateAccuPercentageUntilFull(int currentPercentage){
		this.percentage = currentPercentage;
		int maxPercentage = 100;
		int result = maxPercentage - percentage;
		
		if(percentage < 0 || percentage > 100){
			System.out.println("Het ingevoerde accupercentage zit niet tussen de 0 en 100");
			return 0;
		}else{
			return result;
		}
		
	}
	
    public String toString() {
        return String.format("Accu percentage is: %s",
                percentage);
    }

}
