package Day1_javabasics;

public class executor {
 public static void main(String[] args) {
	 customer_java c1 =new customer_java();
	 c1.setCid(112);
	 c1.setName("Moni");
	 c1.setAddress("pondy");
	System.out.println("Customer id:"+c1.getCid()+"customer name:"+c1.getName()+"customer Address:"+c1.getAddress());
	    
	 customer_java c2 =new customer_java();
	 c2.setCid(113);
	 c2.setName("Hema");
	 c2.setAddress("Bangalore");
	 
	 System.out.println(c2);
	    //calling the to string method
	 customer_java c3 =new customer_java();//invoke explicit default constructor
	 System.out.println(c3);//parameterized constructor
	 customer_java c4 =new customer_java(114,"divya","chennai");//invoke parameterized constructor
	 System.out.println(c4); 
 }
}  
