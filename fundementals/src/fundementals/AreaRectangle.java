package fundementals;
import java.util.Scanner;
public class AreaRectangle {
	public static void main(String[] args) {
	int x1,y1,x2,y2,area;
	System.out.println("enter the values of x1 y1 x2 y2");
	Scanner sc = new Scanner(System.in);
	x1=sc.nextInt();
	y1=sc.nextInt();
	x2=sc.nextInt();
	y2=sc.nextInt();
	area =  (x2-x1) * (y2-y1);
	System.out.println("the area of rectangle is"+ area);

}


}
