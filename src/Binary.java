
public class Binary {
	public static void main(String [] args) {
		byte n = 3;
		byte m = -4;
		
		byte r = (byte)  (n + m);
		
		
		String binary_n = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
		String binary_m = String.format("%32s", Integer.toBinaryString(m)).replace(' ', '0');
		String binary_r = String.format("%32s", Integer.toBinaryString(r)).replace(' ', '0');

		/*
		String binary_n = Integer.toBinaryString(n);
		String binary_m = Integer.toBinaryString(m);
		String binary_r = Integer.toBinaryString(r);
		*/

		System.out.println("n = \t" + binary_n);
		System.out.println("m = \t" + binary_m);
		System.out.println("n+m = \t" + binary_r);
		

	}
}

/*
binary_n = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
binary_m = String.format("%32s", Integer.toBinaryString(m)).replace(' ', '0');
binary_r = String.format("%32s", Integer.toBinaryString(r)).replace(' ', '0');

*/