hierarchical inheritance:
hierarchical inheritance is one of the types of inheritance where multiple child classes inherit the methods and properties of the same parent class



class TestVehicle {
	public static void main(String[] args)
	{
		pmw a1=new pmw();
		Yamaha y1=new Yamaha();
		p1.Name();
		p1.Motors();
		p1.Engine();
		y1.Name();
		y1.Motors();
		y1.Engine();
	}
}
class Vehicle{
	public void Motors() {
	System.out.println(" Vehicle");
	}
}
class twoWheeler extends Vehicle{
	public void Engine()
	{
		System.out.println("Two Wheeler Engine Starts");
	}
}
class fourWheeler extends Vehicle{
	public void Engine()
	{
		System.out.println("Four Wheeler Engine Starts");
	}
}

class Yamaha extends twoWheeler{
	public void Name()
	{
		System.out.print("Yamaha");
	}
}

class pmw extends fourWheeler{
	public void Name()
	{
		System.out.print("pmwi");
	}
}

