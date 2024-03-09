package Day1_javabasics;

public class customer_java {
 
		
            private int cid;
            private String name;
            private String address;
			//getters setters
            public int getCid() {
				return cid;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getAddress() {
				return address;
			}
			public void setAddress(String address) {
				this.address = address;
			}
			public void setCid(int cid) {
				this.cid = cid;
			}//override
			@Override
			public String toString() {
				return "customer_java [cid=" + cid + ", name=" + name + ", address=" + address + "]";
			}

//default constructor
     public customer_java()
     {
    	 this.cid=01;
    	 this.name="unknown";
    	 this.address="somewhere";
     }
     //parameterized construction
     public customer_java(int cid,String name,String address) {
    	 this.cid=cid;
    	 this.name=name;
    	 this.address=address;
     }
}
     

                                               