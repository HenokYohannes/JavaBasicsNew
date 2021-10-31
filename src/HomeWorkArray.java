
public class HomeWorkArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Create an array of cars and store 6 elements into it. 
	 * Using 2 different loops print all values from the array.
	 */
	
	String[]cars= {"VW","Opel","BMW","Audi","Mercedes","Smart" };
			
	
		for (int a=0; a< cars.length; a++) {
		System.out.println(cars[a]);
	}

		System.out.println("----------------");
		
		for(String ca:cars) {
			System.out.println(ca);
}
}
}