
public class test {

	public static void main(String[] args) {
	

		
		joke  j1 = new large();
		j1 = new pig(j1);
		
		System.out.println(j1.getDescription()+ " $ = "+ j1.cost() );
		
		joke  j2 = new medium();
		j2 = new pig(j2);
		System.out.println(j2.getDescription()+ " $ = "+ j2.cost() );
		
		joke  j3 = new small();
		j3 = new pig(j3);
		System.out.println(j3.getDescription()+ " $ = "+ j3.cost() );
		
		
	}

}
