package Interface;

public interface Vehicle {
	
	public class Vehicle implements VehicleInterface{

	    @Override
	    public boolean isMotorized(){
	      return false;
	    }

	    @Override
	    public string getCompany(){
	      return null;
	    }

	    void prnt(){
	      System.out.println(PI);
	    }

	}


}
