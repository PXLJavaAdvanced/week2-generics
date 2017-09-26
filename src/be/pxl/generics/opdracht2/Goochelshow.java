package be.pxl.generics.opdracht2;

public class Goochelshow {
	public static void main(String[] args) {
		Goochelaar goochelaar = new Goochelaar();
		for(int i = 0; i  < 5; i++) {
			System.out.println("Goocheltruc " + (i+1));
			goochelaar.verstopDier();
			goochelaar.kijkInHoed();
			goochelaar.kijkInHoed();
		}
	}
}
