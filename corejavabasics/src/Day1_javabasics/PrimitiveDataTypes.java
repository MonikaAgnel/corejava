package Day1_javabasics;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		byte bmax = 127;
		byte bmin = -128;
		
		System.out.println("Min range of byte is:" +
				bmin+",Max range of byte is :"+bmax);
		
		short smax = 32767;
		short smin = -32768;
		System.out.println("Min short range of byte is:" +
				smin+",Max short range of byte is :"+smax);
		
		int imax = 2147483647;
		int imin = -2147483648;
		System.out.println("Min int range of byte is" +
				imin+",Max int range of byte is: "+imax);
		
		long maxl = 9223372036854775807L;
		long minl = -9223372036854775808L;
		
		System.out.println("Min long range of byte is:" +
				minl+",Max long range of byte is: "+maxl);
		
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("float value is :"+f+",double value is: "+d);
		
	
		boolean flag=true;
		System.out.println("boolean value is "+flag);
	}

}
