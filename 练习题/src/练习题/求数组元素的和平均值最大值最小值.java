package 练习题;

import java.util.Iterator;

public class 求数组元素的和平均值最大值最小值 {
	public static void main(String[] args) {
		int a[]= {-10,2,4,78,765,9};
		int sum=0;
		int min,max;
		min=a[0];
		max=a[0];
		/*
		 * for (int i = 0; i < a.length; i++) { sum+=a[i]; if(a[i]<min) { min=a[i]; }
		 * if(a[i]>max) { max=a[i]; } }
		 */
		for (int i : a) {
			sum+=i;
			if(i<min)
				min=i;
			if(i>max)
				max=i;
		}
		double ave=sum/(double)a.length;
		System.out.println("总和:"+sum);
		System.out.println("平均值:"+ave);
		System.out.println("最大值:"+max);
		System.out.println("最小值:"+min);
	}
}
