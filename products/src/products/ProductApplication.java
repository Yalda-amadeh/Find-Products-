package products;


public class ProductApplication {

	public static void main(String[] args) {
		try {
			var prod = ProductService.FindProduct("pan",ProductType.Home);
			System.out.println( prod );
		} catch (ProductNotFoundException e) {
			System.out.println("Coud not find any product, check and try again");
		}
    	System.out.println( "--------------------------------");
    	try {
			var prod2 = ProductService.FindProduct("jknck",ProductType.Digital);
			System.out.println( prod2 );
		} catch (ProductNotFoundException e) {
			System.out.println("Coud not find any product, check and try again");
		}


	}

}
