package Exceptionpack;

public class MyCalculator {
long power(int n, int p) throws Exception {
	long result=1;
	if(p<=0 || n<=0)
	{
		throw new Exception("Either of the two variable can not be less or equal to zero");
	}
	else if(p<=0 && n<=0)
	{
		throw new Exception("both variable can not be less than or equal to zero");
	}
	
	else 
	{
	 while(p!=0)
	 {
		 result *=n;
		 p--;
	 }
	 return result;
	}
}
}
