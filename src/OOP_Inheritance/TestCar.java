package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		 final int days = 10;//constant var
		System.out.println(days * 100);
		

		BMW b = new BMW();
		//Runtime PolyMorphism or Dynamic
		b.start();//overriden from child
		b.stop();//parent
		b.refuel();//parent
		b.autoParking();//child
		b.engine();
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		//child class object can be referred by parent class ref variable
		//Top Casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//bmw object can be referred by vechile clas ref varibale:
		Vehicle v1 = new BMW();
		
		//down casting: parent class object can be referred by child class ref variable
		BMW b1 = (BMW)new Car();//ClassCastException
		BMW b2 = (BMW)new Vehicle();
		
		
		
	}

}
