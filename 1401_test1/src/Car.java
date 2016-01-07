

public class Car {
	
Door door;
Window window;
Sensors sensors;

public Car(Door door,Window window,Sensors sensors){
	this.door=door;
	this.window=window;
	this.sensors=sensors;
}

void display(){  
	System.out.println("door:handle,seal,latch:\t"+door.handle+" "+door.seal+" "+door.latch);
	System.out.println("window:glass,sunproof:\t"+window.glass+" "+window.sunproof);
	System.out.println("sensors:airbagSensor,knockSensor:\t"+sensors.airbagSensor+" "+sensors.knockSensor);
	System.out.println("car price: "+Sum.sum2());
	System.out.println("-------------------");
	}

public static void main(String args[]){
	Sum sum=new Sum();
	
	Door door1=new Door(100,200,150);
	Door door2=new Door(950,200,200);
	
	Window window1=new Window(1000,700);
	
	Sensors sensors1=new Sensors(2000,2500);
	Sensors sensors2=new Sensors(3000,2000);
	
	Car myCar1=new Car(door1,window1,sensors1);
	Car myCar2=new Car(door2,window1,sensors2);
	Car myCar3=new Car(door2,window1,sensors1);
	
	myCar1.display();  
	myCar2.display();
	myCar3.display();
	
}

}
