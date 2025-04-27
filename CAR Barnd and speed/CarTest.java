class CarTest{
	public static void main(String[]args){
		Car c1 = new Car();
		
		c1.setspeed(200);
		c1.setbrand("Toyota");
		
		System.out.println(c1.getspeed() +" KM/H "+ "   brand  is " +c1.getbrand());	
	}
}