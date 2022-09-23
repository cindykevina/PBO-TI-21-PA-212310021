
public class Latihan01 {

	public static void main(String[] args) {
		int c, k;
		float r;
		c = 90;
		
		CelciusToFahrenheit();
		r = CelciusToReamur();
		k = CelciusToKelvin(c);
		System.out.println("Convert celcius to others");
		System.out.println("reamur = "+ r);
		System.out.println("celcius = "+ c);
		System.out.println("Kelvin = "+ k);

	}
	
	static void CelciusToFahrenheit() {
		int c = 90;
		int f = (9/5 * c) + 32;
		
		System.out.println("Convert celcius to fahrenheit");
		System.out.println("celcius = "+ c);
		System.out.println("fahrenheit = "+ f);
	}
	
	static float CelciusToReamur() {
		int c = 90;
		int r = (5/4 * c);
		return r;
	}
	
	static int CelciusToKelvin(int c) {
		int k = (c + 273);
		return k;
		
	}
}