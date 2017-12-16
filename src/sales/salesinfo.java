package sales;

public class salesinfo {

    public  static void main(String[] args){
	       
    	
    	    sales1 salobj2=new sales1 ("Andres", 7688.98, 887.98,"CA");
	        salobj2.display();
	
	}
}
	

	
	
	class sales1 {
		String salesmanname;
		Double sales;
		Double bonus;
		String location;

	
		sales1(String sm, Double sal, Double bon, String loc) {
			salesmanname = sm;
			sales = sal;
			bonus = bon;
			location = loc;

		}
		static final String companyname = "Tesla";


		Double getbonus() {
			Double bonus = sales * .05;
			return bonus;
		}

		void display() {
			System.out.println(" salesmananme" + salesmanname);
			System.out.println("sales" + sales);
			System.out.println("bonus" + bonus);
			System.out.println("location " + location);
			System.out.println(" bonus for each salesman is :" + getbonus());
	     	System.out.println(companyname);

		}

	}

