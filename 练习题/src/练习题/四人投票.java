package 练习题;
import java.util.Scanner;

public class 四人投票 {
	public static void main(String[] args)
	{
		System.out.println("投票,输入1表示同意,输入0表示不同意.");
		Scanner scan=new Scanner(System.in);
		System.out.println("A投票:");
		int A =scan.nextInt();
		System.out.println("B投票:");
		int B =scan.nextInt();
		System.out.println("C投票:");
		int C =scan.nextInt();
		System.out.println("D投票:");
		int D =scan.nextInt();
		if((A==1&&B==1)||(C==1||D==1))
		{
			System.out.println("投票通过!");
		}
		else
		{
			System.out.println("投票不通过!");
		}
		
	}
}
