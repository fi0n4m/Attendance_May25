public class VehicleRunner {
	
	public static void main (String[] args) {
		
		Toyota_Vios toyotaVios = new Toyota_Vios(170, "Orange", 706000, "Proxes CR1");
		toyotaVios.drive();
		toyotaVios.stop();
		
		Fandango_Yatch fandangoYatch = new Fandango_Yatch(18, "white", 2000000, "Cobalt Blue");
		fandangoYatch.floating();
		fandangoYatch.stop();
		
		U_2_Spy_Plane u2SpyPlane = new U_2_Spy_Plane(805, "Gray", 50000000, 31);
		u2SpyPlane.fly();
		u2SpyPlane.stop();
	}
}
