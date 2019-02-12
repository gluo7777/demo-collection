package algorithms;

public class BitOperations {
	public static void main(String[] args) {
		displayBits(15);
	}

	public static void displayBits(int integer) {
		System.out.printf("Leading zeroes of %d=%d\n",integer ,Integer.numberOfLeadingZeros(integer));
		System.out.printf("Trailing zeroes of %d=%d\n",integer,Integer.numberOfTrailingZeros(integer));
		System.out.printf("Number of bits for %d=%d\n",integer,32 - Integer.numberOfLeadingZeros(integer));
	}
}
