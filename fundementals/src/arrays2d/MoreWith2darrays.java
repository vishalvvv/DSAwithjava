package arrays2d;

public class MoreWith2darrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	  int[][] arr=new int[3][5];
	  //    System.out.println(arr[0][0]);
	      int[][]arr =new int[4][];
	    //  System.out.println(arr);
	    //  for(int i=0;i<arr.length;i++){
	    //      System.out.println(arr[i]);
	   //   }
	   //   System.out.println(arr[0][0]);
	//      for(int i=0;i<arr.length;i++){
	//          arr[i]=new int[5];
	   //   }
	      for(int i=0;i<arr.length;i++){
	          arr[i]=new int[i+2];
	      }
	      for(int i=0;i<arr.length;i++){
	          for(int j=0;j<arr[i].length;j++){
	              System.out.print(arr[i][j]+" ");
	          }
	          System.out.println();
	      }
	}

}
