package practise;
//WAP to print flyod's triangle
public class FlyodTriangle {

	public static void printFlyodTriangle(int rows){
		System.out.println("No. of rows in flyod triangle is "+rows);
		int num=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		
		printFlyodTriangle(5);
		printFlyodTriangle(3);
	}
	
}
