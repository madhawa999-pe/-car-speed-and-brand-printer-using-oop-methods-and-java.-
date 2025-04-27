class Car{
	private String brand;
	private  int speed;
	
	public void setspeed(int s){
			if(speed<= 180){
				speed = s;
			}
			else{
				System.out.println("car speed is greater than 180");	
			}
	}
	public int getspeed(){
		return speed;
	}
	public void setbrand(String b){
		brand =b;
	}
	public String getbrand(){
		return brand;
	}
}