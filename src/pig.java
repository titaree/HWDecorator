
public class pig extends topping {
	joke joke;
	
	public pig(joke joke){
		 this.joke = joke;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return  joke.getDescription()+", pig";
	}
	public double cost(){
		return 15 + joke.cost();
	
}
}