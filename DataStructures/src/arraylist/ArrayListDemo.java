package arraylist;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> arr= new ArrayList<>(20);
	        arr.add(10);
	        arr.add(20);
	        arr.add(30);
	        arr.add(1,80);
	//        arr.set(0,100);
	        
	 //       Integer i = 10;
	 //       arr.remove(i);
	        
	        // iterate using index
	        
	        for(int i=0;i<arr.size();i++){
	            System.out.println(arr.get(i));
	        }
	        
	        // iterating through elements enhanced for each loop
	        
	        for(int i:arr){
	            System.out.println(i);
	          }
	        
	        

	  //      System.out.println(arr.size());
	  //      System.out.println(arr.get(1));

	}

}
