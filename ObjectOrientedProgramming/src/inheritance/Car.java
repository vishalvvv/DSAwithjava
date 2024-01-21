package inheritance;

public class Car extends Vehicle {

	
		// TODO Auto-generated method stub
 int numDoors; 
 // int maxSpeed;
 
 public Car(int numDoors, int maxspeed){
     //super(maxspeed);
     System.out.println("Car's Constructor");
     this.numDoors = numDoors;
   }

 
 public void print(){
     super.print();
     System.out.println("Car "+ " numdoors "+ numDoors);
 }
 
 public void printMaxspeed(){
     super.maxSpeed = 15;
     System.out.println(maxSpeed+ " " + super.maxSpeed);
 }
 
//  public void printCar(){
   //  System.out.println("Car "+ " color "+ getColor()+" maxspeed " + maxSpeed + " numdoors "+ numDoors);
//  }
}
