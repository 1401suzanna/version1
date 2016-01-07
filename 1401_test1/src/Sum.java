
public class Sum {


	public static int sum2() {
	    int total1= Door.handle+Door.seal+Door.latch;
	    int total2= Window.glass+ Window.sunproof;
	    int total3=Sensors.airbagSensor+Sensors.knockSensor;
	    
	    int total=total1+total2+total3;
	    return total;
			
	}
}
