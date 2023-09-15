package InfiniteLoops;

public class InfiniteLoops {
	public static void main(String[] args) {
		int i=1;
		for(;;)
		{
			if(i!=100000)
			{
			System.out.println("Value is "+i);
	 	    }
			if(i==200000)
			{
				break;
			}
			i++;
	}
	}
}
