package Interface;

public interface Car {
	

	public class Car extends Vehicle implement VehicleInterface, CarInterface{

	    @Override
	    public boolean isMotorized(){
	      return true;
	    }

	    @Override
	    public string getCompany(){
	      return null;
	     }

	     @Override
	     public int numGears(){
	       return 5;
	      }

	      void print(){
	          System.out.println(PI);
	      }
	}



