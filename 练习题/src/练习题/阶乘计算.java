package 练习题;

public class 阶乘计算 {
	public static void main(String[] args)
	{
		double i,j,mul,sum=0;
		for(i=1;i<=20;i++)
		{
			mul=1;
			for(j=1;j<=i;j++)
			{
				mul*=j;
			}
			sum+=mul;
		}
		System.out.println(sum);
	}
}
