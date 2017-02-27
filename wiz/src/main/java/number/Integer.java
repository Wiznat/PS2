package number;

public class Integer {
	
	private static int iValue;

	public Integer(int iValue) 
	{
		super();
		this.iValue = iValue;
	}

	public static int getiValue() 
	{
		return iValue;
	}
	
	public boolean isEven()
	{
		return (getiValue() % 2 == 0);
	}
	
	public boolean isOdd()
	{
		return (getiValue() % 2 == 1);
	}
	
	public boolean isPrime(){
		for (int i = 2; i < getiValue(); i++){
			if (getiValue() % i == 0) {
	            return false;
	        }
	    }
	    return true;

	}
	
	public static boolean isEven(int n)
	{
		return (n % 2 == 0);
	}
	
	public static boolean isOdd(int n)
	{
		return (n % 2 == 1);
	}
	
	public static boolean isPrime(int n)
	{
		for (int i = 2; i < n; i++){
			if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static boolean isEven(Integer num1){
		return (num1.getiValue() % 2 == 0);
	}
	
	public static boolean isOdd(Integer num1){
		return (num1.getiValue() % 2 == 1);
	}
	public static boolean isPrime(Integer num1)
	{
		for (int i = 2; i < num1.getiValue(); i++){
			if (num1.getiValue() % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static boolean equals(int n){
		return (n == getiValue());
	}
	
	public static boolean equals(Integer num1){
		return(num1.getiValue() == getiValue());
	}
}
