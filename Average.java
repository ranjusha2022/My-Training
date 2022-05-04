class Average
{

	public int findAverage(int a, int b, int c)
	{
	 int avg = ((a+b+c)/3);
	 return avg;
	}
	
	public float findAverage(float a, float b, float c)
	{
	 float avg = ((a+b+c)/3);
	 return avg;
	}
	
	
	public static void main(String args[])
	{
		Average obj = new Average();
		
		System.out.println(obj.findAverage(100,200,300));
		
		System.out.println(obj.findAverage(100.50f,200.75f,300.25f));		
	
	
	}
}