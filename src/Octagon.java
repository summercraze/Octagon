
public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable {
	private double side;
	
	public Octagon()
	{
		
	}
	//constructor with parameter
	public Octagon(double side)
	{
		this.side = side;

	}
	public Octagon(double side,String color, boolean filled)
	{
		this.side = side;
		setColor(color);
		setFilled(filled);
	}
	
	//getter and setter
	public double getSide()
	{
		return this.side;
	}

	public void setSide(double side)
	{
		this.side = side;
	}
	@Override
	public double getArea() {
		
		return (2+(4/Math.sqrt(2)))*side*side;
	}

	@Override
	public double getPerimeter() {
		
		return side*8;
	}
	@Override
	public String toString()
	{
		return super.toString() + "\nPerimeter : " + this.getPerimeter() + "\nArea : " + this.getArea();
	}
	@Override
	public int compareTo(Octagon o)
	{
		if(getArea() > o.getArea() )
			return 1;
		else if(getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	

}
