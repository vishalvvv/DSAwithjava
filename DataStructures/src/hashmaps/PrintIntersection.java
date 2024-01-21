package hashmaps;
import java.util.HashMap;

public class PrintIntersection {
	public static void printArrayIntersection(int[] arr1,int[] arr2){
	
	HashMap<Integer, Integer> map = new HashMap<>();
	for(int i=0;i<arr1.length;i++) {
		if(map.containsKey(arr1[i])) {
			int value = map.get(arr1[i]);
			map.put(arr1[i], value+1);
			
		}else {
			map.put(arr1[i], 1); //for 1st occurence of item the value is 1
		}
	}
	//now that map is ready for arr1
	for(int i=0;i<arr2.length;i++) {
		if(map.containsKey(arr2[i])) {
			int frequnecy = map.get(arr2[i]);
			if(frequnecy>0) {
				System.out.print(arr2[i]+" ");
				map.put(arr2[i], frequnecy-1);
			}
		}
	}

}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int arr1[] = {1,4,5,2,2,3,6,5,3,2};
	int arr2[] = {2,3,2,6,6,5,1};
	printArrayIntersection(arr1, arr2);
	/*
	2
	3
	2
	6
	5
	1
	*/ //is the output
	

}


}
