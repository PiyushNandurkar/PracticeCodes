class Bicycle
{
	int gear;
	int speed;
	public Bicycle(int gear,int speed)
	{
		this.gear=gear;
		this.speed=speed;
	}
	
	public void applyBreak(int decrement)
	{
		speed=speed-decrement;
	}
	
	public void speedUp(int increment)
	{
		speed=speed+increment;
	}
	
	public String toString()
	{
		return("No of gear "+gear +"\n"+"Speed of bicycle"+speed);
	}
}

class MountainCycle extends Bicycle
{
	public int seatheight;
	public MountainCycle(int speed,int gear,int seatheight)
	{
		super(speed,gear);		
		this.seatheight=seatheight;
	}
	@Override
	public String toString()
	{
		return(super.toString()+"\n"+"Seat height of bicycle"+seatheight);
	}
}
public class Cycles
{
	public static void main(String args[])
	{
		MountainCycle mc=new MountainCycle(10,20,40);
		System.out.println(mc.toString());
	}
	
}
