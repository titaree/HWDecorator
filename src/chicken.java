public class chicken extends topping {
	joke joke;
	
	public chicken(joke joke){
		 this.joke = joke;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  joke.getDescription()+", chicken";
	}
	public double cost(){
		return 10 + joke.cost();
	
}
}