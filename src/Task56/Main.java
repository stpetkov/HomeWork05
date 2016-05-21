package Task56;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("How many numbers ?");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter numbers : ");
		for(int i=0;i<n;i++){
			System.out.print("number("+i+") : ");
			int num=sc.nextInt();
			arr[i]=num;
		}
for(int i=arr.length-1;i>=0;i--){
	System.out.print(arr[i]+" | ");
}
	}

}
