package be.pxl.generics.opdracht2;

public class Goochelaar {
	private Hoed<? extends Dier> hoed;
	
	public void verstopDier() {
		if (Math.random() <= 0.5) {
			hoed = new Hoed<>(new Konijn());
		} else {
			hoed = new Hoed<>(new Duif());
		}
	}
	
	public void kijkInHoed() {
		Dier dier = hoed.kijk();
		if (dier == null) {
			System.out.println("HOED IS LEEG");
		} else {
			System.out.println(dier.getClass().getSimpleName());
		}
	}
}
