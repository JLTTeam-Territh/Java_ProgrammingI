public class Circle
{
	private double radius = 1;
	private double area = 1;
	private double circumference = 1;
	
	public circle() 
	{
		CalcAreaAndCircumferenec();
		public void setRadius(double rad)
		{
			radius = radl
			calcAreaAndCircumference();
		
		}
		
		
		public double getRadius()
		{
			return radius;
		}
		
		public double getArea()
		{
			return circumference;
		}
		
		private void calcAreaAndCircumference()
		{
			area = Math.PI * Math.pow(radius, 2);
			circumference = 2.0 * Math.PI * radius;
		}
	}
}