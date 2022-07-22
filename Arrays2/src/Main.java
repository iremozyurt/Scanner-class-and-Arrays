import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("how many numbers will you enter");
		int amount=scanner.nextInt();
		
		int [] arr=new int[amount];
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+". number");
			arr[i]=scanner.nextInt();
		}
		
		int max =arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("the greatest number: "+ max);
		
		
	}

}
