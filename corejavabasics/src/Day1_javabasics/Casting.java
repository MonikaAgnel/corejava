package Day1_javabasics;

public class Casting {

	public static void main(String[] args) {
		byte b=10;
		int i=b;
		System.out.println("value is:"+i);
		
		
		float f=122.4f;
		double d =f;
		System.out.println("value is:"+d);
		
		char ch='A';
		int i1=ch;
		System.out.println("value is:"+i1);
		
		char var1='\u00A7';
		int i2=var1;
		System.out.println("value is:"+i2);
		
		double d1=10.5f;
		long l=(long)d1;
		System.out.println("value is:"+l);
		
		long l1= 923372036854775806l;
      	int i3=(int) l1;
		System.out.println("value is:"+i3);
		
		float f2=45.45f;
		int i4=(int)f2;
		System.out.println("value is:"+i4);
		
		byte b1=89;
		char ch1=(char)b1;
		System.out.println("value is:"+ch1);
		

	}

}
