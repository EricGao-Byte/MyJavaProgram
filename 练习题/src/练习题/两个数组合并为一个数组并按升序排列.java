package 练习题;

import java.util.Arrays;

public class 两个数组合并为一个数组并按升序排列 {
	public static void main(String[] args) {
		int A[]= {1,5,8,3,9,65};
		int B[]= {76,34,23,98};
		System.out.println("A:");
		for (int i : A) {
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("B:");
		for (int i : B) {
			System.out.print(" "+i);
		}
		int C[]=new int[A.length+B.length];
		for (int i = 0; i < C.length; i++) {
			if((i+1)<=A.length)
			{
				C[i]=A[i];
			}
			else
			{
				C[i]=B[i-A.length];
			}
		}
		Arrays.sort(C);
		System.out.println();
		System.out.println("C:");
		System.out.println(Arrays.toString(C));
	}
}
