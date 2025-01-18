import java.util.*;
public class PracticeProblem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your range");
		int range = sc.nextInt();
		System.out.print("Even Range :");
		for(int i=1;i<=range;i++){
			if(i%2==0){
				System.out.print(i + " ");
			}
		}
		System.out.println("Odd Range :" );
		for(int i=1; i<=range;i++){
			if(i%2!=0){
				System.out.print(i);
			}
		}
	}
}
