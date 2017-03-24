package rest;

import javax.validation.ValidationException;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import accu.Accu;

@Path("/accuservice")
public class AccuService {
    
	@GET
	@Path("/percentage")
    @Produces(MediaType.APPLICATION_JSON)
    public Accu getAccuPercentage()
    {
		Accu accu = new Accu();
		accu.setPercentage(50);
		if(accu.getPercentage() < 0 || accu.getPercentage() > 100){
			throw new ValidationException();
		}else{
			return accu;
		}
    }
	
	@GET
	@Path("/accu")
	@Produces(MediaType.APPLICATION_JSON)
	public int getPercentage (
			@QueryParam("percentage")
			@NotNull(message = "het percentage mag niet leeg zijn")
		    @Min(value=0, message = "percentage mag niet onder de 0 zijn")
		    @Max(value=100, message = "percentage mag niet hoger dan 100 zijn")
				int percentage) throws ValidationException {
		
		Accu accu = new Accu();
		return accu.calculateAccuPercentageUntilFull(percentage);
	}
}
